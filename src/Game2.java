import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;

public class Game2 extends JPanel implements KeyListener, ActionListener
{
    MainMap gameSelection;
    
    int score = 0;
    Timer gametime = new Timer(8, this);
    Timer timer = new Timer(1000, this);
    double timeElapsed = 0;
    double newDelay = 0;
    JLabel gameTitle;
    JLabel scoreLabel;
    JLabel timerLabel;
    JButton back;
    JButton reset;
    JPanel hud;
    JPanel buttons;
    
    ImageIcon luke = new ImageIcon("images/luke.png");
    ImageIcon mario = new ImageIcon("images/mario.png");
    ImageIcon dog = new ImageIcon("images/dog.png");
    ImageIcon stormtrooper = new ImageIcon("images/stormtrooper.png");
    ImageIcon goomba = new ImageIcon("images/goomba.png");
    ImageIcon cat = new ImageIcon("images/cat.png");
    Image charSprite = luke.getImage();
    Image enemySprite = stormtrooper.getImage();
    
    Rectangle playerHitBox = new Rectangle(500, 300, 25, 35);
    Rectangle enemy1HitBox = new Rectangle(700, 300, 25, 35);
    Rectangle enemy2HitBox = new Rectangle(300, 300, 25, 35);
    
    int xpos = 500, ypos = 300;
    int xVelocity = 0, yVelocity = 0;
    
    int enemyxpos = 700, enemyypos = 300;
    int enemyxVelocity = 1, enemyyVelocity = 1;
    
    int enemyxpos2 = 300, enemyypos2 = 300;
    int enemyxVelocity2 = 1, enemyyVelocity2 = 1;
    
    public Game2(MainMap m)
    {
        gameSelection = m;
        gametime.start();
        gametime.addActionListener(this);
        timer.start();
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        
        hud = new JPanel();
        hud.setLayout(new BoxLayout(hud, BoxLayout.X_AXIS));
        hud.setOpaque(false);
        
        add(Box.createRigidArea(new Dimension(1000,20)));
        add(hud);
        
        scoreLabel = new JLabel("Score: 0 points");
        timerLabel = new JLabel("Time: 0 seconds");
        hud.add(scoreLabel);
        hud.add(Box.createRigidArea(new Dimension(20,0)));
        hud.add(timerLabel);
        scoreLabel.setFont(new Font("IMPACT", Font.PLAIN, 20));
        scoreLabel.setForeground(Color.yellow);
        scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        timerLabel.setFont(new Font("IMPACT", Font.PLAIN, 20));
        timerLabel.setForeground(Color.yellow);
        timerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        add(Box.createRigidArea(new Dimension(0,5)));
        
        gameTitle = new JLabel("Avoid touching the enemies!");
        gameTitle.setFont(new Font("IMPACT", Font.PLAIN, 20));
        gameTitle.setForeground(Color.yellow);
        gameTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(gameTitle);
        
        add(Box.createRigidArea(new Dimension(0,550)));
        
        buttons = new JPanel();
        buttons.setLayout(new BoxLayout(buttons, BoxLayout.X_AXIS));
        buttons.setOpaque(false);
        add(buttons);
        
        back = new JButton("Back to menu");
        buttons.add(back);
        back.setAlignmentX(Component.CENTER_ALIGNMENT);
        back.addActionListener(this);
        
        reset = new JButton("Reset");
        buttons.add(reset);
        reset.setAlignmentX(Component.CENTER_ALIGNMENT);
        reset.addActionListener(this);
        
        add(Box.createRigidArea(new Dimension(0,700)));
        this.setOpaque(false);
            
	setFocusable(true);
        addKeyListener(this);
        setFocusTraversalKeysEnabled(false);
            
    }
//==========================================================================
        public void keyPressed(KeyEvent evt) 
        {
            int kk = evt.getKeyCode();
            if(kk ==  evt.VK_LEFT)
            {
                xVelocity = -1;
            }
            if(kk ==  evt.VK_RIGHT)
            {
                xVelocity = 1;
            }
            if(kk ==  evt.VK_UP)
            {
                yVelocity = -1;
            }
            if(kk ==  evt.VK_DOWN)
            {
                yVelocity = 1;
            }
        }

        public void keyReleased(KeyEvent evt)
        {
            int kk = evt.getKeyCode();
            if(kk ==  evt.VK_LEFT)
            {
                xVelocity = 0;
            }
            if(kk ==  evt.VK_RIGHT)
            {
                xVelocity = 0;
            }
            if(kk ==  evt.VK_UP)
            {
                yVelocity = 0;
            }
            if(kk ==  evt.VK_DOWN)
            {
                yVelocity = 0;
            }
        }

        public void keyTyped(KeyEvent evt) { }
//============================================================================
        public void paintComponent(Graphics g)
        {
            
            super.paintComponent(g);
            
            Graphics2D character = (Graphics2D)g;
            Graphics2D enemy = (Graphics2D)g;
            Graphics2D enemy2 = (Graphics2D)g;
            
            character.drawImage(charSprite, xpos, ypos, this);
            playerHitBox.x = xpos;
            playerHitBox.y = ypos;
            enemy.drawImage(enemySprite, enemyxpos, enemyypos, this);
            enemy1HitBox.x = enemyxpos;
            enemy1HitBox.y = enemyypos;
            enemy.drawImage(enemySprite, enemyxpos2, enemyypos2, this);
            enemy2HitBox.x = enemyxpos2;
            enemy2HitBox.y = enemyypos2;
            
            super.paintComponent(g);
            requestFocusInWindow();
        }  

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if(playerHitBox.intersects(enemy1HitBox) || playerHitBox.intersects(enemy2HitBox))
        {
            timeElapsed = -1000;
            gameTitle.setText("Game Over!");
        }
        if(timeElapsed > 3)
        {
        
        xpos += xVelocity;
        ypos += yVelocity;
        
        if(xpos<14)
            xpos -= xVelocity;
        if(xpos>930)
            xpos -= xVelocity;
        if(ypos<5)
            ypos -= yVelocity;
        if(ypos>580)
            ypos -= yVelocity;
        
        
        enemyxpos += enemyxVelocity;
        enemyypos += enemyyVelocity;
        
        enemyxpos2 += enemyxVelocity2;
        enemyypos2 += enemyyVelocity2;
        
        
        if(enemyypos > 570 && enemyypos < 580)
        {
            enemyyVelocity = -2;
        }
        if(enemyypos > 0 && enemyypos < 10)
        {
            enemyyVelocity = 2;
        }
        if(enemyxpos > 0 && enemyxpos < 10)
        {
            enemyxVelocity = 2;
        }
        if(enemyxpos > 920 && enemyxpos < 930)
        {
            enemyxVelocity = -2;
        }
        
        if(enemyypos2 > 570 && enemyypos2 < 580)
        {
            enemyyVelocity2 = -2;
        }
        if(enemyypos2 > 0 && enemyypos2 < 10)
        {
            enemyyVelocity2 = 2;
        }
        if(enemyxpos2 > 0 && enemyxpos2 < 10)
        {
            enemyxVelocity2 = 2;
        }
        if(enemyxpos2 > 920 && enemyxpos2 < 930)
        {
            enemyxVelocity2 = -2;
        }
        repaint();
        }

        if(obj == back)
        {
            this.setVisible(false);
            gameSelection.setVisible(true);
        }
        
        if(obj == reset)
        {
            this.resetGame();
        }
        
        if(obj == timer)
        {
            timeElapsed++;
            if(timeElapsed>3)
                timerLabel.setText("Time: " + ((int)timeElapsed-4) + " seconds");
            newDelay = 8-(timeElapsed/15);
            gametime.setDelay((int)newDelay);
            if(timeElapsed % 4 == 0 && timeElapsed > 3)
            {
                score++;
                scoreLabel.setText("Score: " + score + " points");
            }
            if(timeElapsed == 0)
            {
                timerLabel.setText("Game Start in 3...");
            }
            if(timeElapsed == 1)
            {
                timerLabel.setText("Game Start in 2...");
            }
            if(timeElapsed == 2)
            {
                timerLabel.setText("Game Start in 1...");
            }
            if(timeElapsed == 3)
            {
                timerLabel.setText("GO!");
            }
        }
    }
    
    public void setLuke()
    {
        charSprite = luke.getImage();
    }
    
    public void setMario()
    {
        charSprite = mario.getImage();
    }
    
    public void setDog()
    {
        charSprite = dog.getImage();
    }
    
    public void setStarWars()
    {
        scoreLabel.setFont(new Font("IMPACT", Font.PLAIN, 20));
        scoreLabel.setForeground(Color.yellow);
        timerLabel.setFont(new Font("IMPACT", Font.PLAIN, 20));
        timerLabel.setForeground(Color.yellow);
        gameTitle.setFont(new Font("IMPACT", Font.PLAIN, 20));
        gameTitle.setForeground(Color.yellow);
        enemySprite = stormtrooper.getImage();
    }
    
    public void setNintendo()
    {
        scoreLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        scoreLabel.setForeground(Color.orange);
        timerLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        timerLabel.setForeground(Color.orange);
        gameTitle.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        gameTitle.setForeground(Color.orange);
        enemySprite = goomba.getImage();
    }
    
    public void setFarm()
    {
        scoreLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
        scoreLabel.setForeground(Color.white);
        timerLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
        timerLabel.setForeground(Color.white);
        gameTitle.setFont(new Font("Arial Black", Font.PLAIN, 20));
        gameTitle.setForeground(Color.white);
        enemySprite = cat.getImage();
    }
    
    public void resetGame()
    {
        timeElapsed = -1;
        scoreLabel.setText("");
        timerLabel.setText("Game Start in 3...");
        gameTitle.setText("Avoid touching the enemies!");
        score = 0;
        xpos = 500;
        ypos = 300;
        enemyxpos = 700;
        enemyypos = 300;
        enemyxpos2 = 300;
        enemyypos2 = 300;
        repaint();
    }
}