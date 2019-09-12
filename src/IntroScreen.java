
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;

public class IntroScreen extends JPanel implements ActionListener, KeyListener
{
    JLabel  gameName;
    JButton credits;
    JButton instructions;
    JButton options;
    JButton mainMap;
    MainMap gameSelection;
    Credits creditsScreen;
    Instructions instructionsScreen;
    Options optionsScreen;
    JButton quit;

    public IntroScreen()
    {
        super();
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        this.setOpaque(false);
        add(Box.createRigidArea(new Dimension(0,40)));
        
        gameName = new JLabel("Game");
        add(gameName);
        gameName.setFont(new Font("IMPACT", Font.PLAIN, 50));
        gameName.setForeground(Color.yellow);
        gameName.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,70)));
        
        mainMap = new JButton("Main Map");
        add(mainMap);
        mainMap.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,20)));
        mainMap.addActionListener(this);
        
        instructions = new JButton("Instructions");
        add(instructions);
        instructions.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,20)));
        instructions.addActionListener(this);
        
        options = new JButton("Options");
        add(options);
        options.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,20)));
        options.addActionListener(this);
        
        credits = new JButton("Credits");
        add(credits);
        credits.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,20)));
        credits.addActionListener(this);
        
        quit = new JButton("Quit");
        add(quit);
        quit.setAlignmentX(Component.CENTER_ALIGNMENT);
        quit.addActionListener(this);
        addKeyListener(this);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }
    
    public void getMainMapScreen(MainMap m)
    {
        gameSelection = m;
    }
    
    public void getCreditsScreen(Credits c)
    {
        creditsScreen = c;
    }
    
    public void getInstructionsScreen(Instructions i)
    {
        instructionsScreen = i;
    }
    
    public void getOptionsScreen(Options o)
    {
        optionsScreen = o;
    }
    
    public void setStarWars()
    {
        gameName.setFont(new Font("IMPACT", Font.PLAIN, 50));
        gameName.setForeground(Color.yellow);
    }
    
    public void setNintendo()
    {
        gameName.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
        gameName.setForeground(Color.orange);
    }
    
    public void setFarm()
    {
        gameName.setFont(new Font("Arial Black", Font.PLAIN, 50));
        gameName.setForeground(Color.white);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if (obj == mainMap)
        {
            this.setVisible(false);
            gameSelection.setVisible(true);
        }
        
        if (obj == credits)
        {
            this.setVisible(false);
            creditsScreen.setVisible(true);
        }
        
        if (obj == instructions)
        {
            this.setVisible(false);
            instructionsScreen.setVisible(true);
        }
        
        if (obj == options)
        {
            this.setVisible(false);
            optionsScreen.setVisible(true);
        }
        
        if (obj == quit)
        {
            System.exit(0);
        }
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int kk = ke.getKeyCode();
        System.out.println("Key pressed");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
