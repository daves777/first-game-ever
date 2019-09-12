
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class MainMap extends JPanel implements ActionListener
{
    JLabel mainMap;
    JButton game1;
    JButton game2;
    JButton game3;
    JButton back;
    JButton gameOver;
    IntroScreen intro;
    GameOver gameOverScreen;
    Game1 firstGame;
    Game2 secondGame;
    Game3 thirdGame;

    public MainMap()
    {
        super();
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        this.setOpaque(false);
        add(Box.createRigidArea(new Dimension(0,40)));
        
        mainMap = new JLabel("Main Map");
        add(mainMap);
        mainMap.setFont(new Font("IMPACT", Font.PLAIN, 35));
        mainMap.setForeground(Color.YELLOW);
        mainMap.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,30)));
        
        game1 = new JButton("Game 1");
        add(game1);
        game1.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,20)));
        game1.addActionListener(this);
        
        game2 = new JButton("Game 2");
        add(game2);
        game2.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,20)));
        game2.addActionListener(this);
        
        game3 = new JButton("Game 3");
        add(game3);
        game3.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,40)));
        game3.addActionListener(this);
        
        gameOver = new JButton("Game Over");
        add(gameOver);
        gameOver.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,20)));
        gameOver.addActionListener(this);
        
        back = new JButton("Back");
        add(back);
        back.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,20)));
        back.addActionListener(this);
    }
    
    public void getIntroScreen(IntroScreen i)
    {
        intro = i;
    }
    
    public void getGameOverScreen(GameOver g)
    {
        gameOverScreen = g;
    }
    
    public void getGames(Game1 a, Game2 b, Game3 c)
    {
        firstGame = a;
        secondGame = b;
        thirdGame = c;
    }
    
    public void setStarWars()
    {
        mainMap.setFont(new Font("IMPACT", Font.PLAIN, 35));
        mainMap.setForeground(Color.yellow);
    }
    
    public void setNintendo()
    {
        mainMap.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
        mainMap.setForeground(Color.orange);
    }
    
    public void setFarm()
    {
        mainMap.setFont(new Font("Arial Black", Font.PLAIN, 35));
        mainMap.setForeground(Color.white);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if (obj == back)
        {
            this.setVisible(false);
            intro.setVisible(true);
        }
        
        if (obj == gameOver)
        {
            this.setVisible(false);
            gameOverScreen.setVisible(true);
        }
        
        if (obj == game1)
        {
            this.setVisible(false);
            firstGame.setVisible(true);
        }
        
        if (obj == game2)
        {
            this.setVisible(false);
            secondGame.setVisible(true);
            secondGame.resetGame();
        }
        
        if (obj == game3)
        {
            this.setVisible(false);
            thirdGame.setVisible(true);
        }
        
    }
}
