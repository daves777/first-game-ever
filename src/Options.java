
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class Options extends JPanel implements ActionListener
{
    JPanel themes;
    
    JLabel options;
    IntroScreen intro;
    JButton back;
    JLabel characterSelection;
    
    JLabel themeSelection;
    
    JButton starWars;
    JButton nintendo;
    JButton farm;
    
    JButton luke;
    JButton mario;
    JButton dog;
    
    ControlPanel control;
    Game2 game2;

    public Options(ControlPanel c, Game2 g)
    {
        super();
        control = c;
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        this.setOpaque(false);
        
        add(Box.createRigidArea(new Dimension(0,20)));
        
        options = new JLabel("Options");
        add(options);
        options.setFont(new Font("IMPACT", Font.PLAIN, 35));
        options.setForeground(Color.yellow);
        options.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        add(Box.createRigidArea(new Dimension(0,30)));
        
        characterSelection = new JLabel("Character Selection");
        add(characterSelection);
        characterSelection.setFont(new Font("IMPACT", Font.PLAIN, 20));
        characterSelection.setForeground(Color.yellow);
        characterSelection.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        add(Box.createRigidArea(new Dimension(0,30)));
        game2 = g;
        CharacterSelection characters = new CharacterSelection();
        characters.getGame2(game2);
        add(characters);
        characters.setVisible(true);
        
        add(Box.createRigidArea(new Dimension(0,30)));
        
        themeSelection = new JLabel("Theme Selection");
        add(themeSelection);
        themeSelection.setFont(new Font("IMPACT", Font.PLAIN, 20));
        themeSelection.setForeground(Color.yellow);
        themeSelection.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        add(Box.createRigidArea(new Dimension(0,30)));
        
        themes = new JPanel();
        themes.setLayout(new BoxLayout(themes, BoxLayout.X_AXIS));
        themes.setOpaque(false);
        add(themes);
        
        starWars = new JButton("Star Wars");
        starWars.addActionListener(this);
        themes.add(starWars);
        themes.add(Box.createRigidArea(new Dimension(30,0)));
        
        add(Box.createRigidArea(new Dimension(30,0)));
        
        nintendo = new JButton("Nintendo");
        nintendo.addActionListener(this);
        themes.add(nintendo);
        themes.add(Box.createRigidArea(new Dimension(30,0)));
        
        add(Box.createRigidArea(new Dimension(30,0)));
        
        farm = new JButton("Farm");
        farm.addActionListener(this);
        themes.add(farm);
        
        add(Box.createRigidArea(new Dimension(0,50)));
        
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
    
    public void setStarWars()
    {
        options.setFont(new Font("IMPACT", Font.PLAIN, 35));
        options.setForeground(Color.yellow);
        characterSelection.setFont(new Font("IMPACT", Font.PLAIN, 20));
        characterSelection.setForeground(Color.yellow);
        themeSelection.setFont(new Font("IMPACT", Font.PLAIN, 20));
        themeSelection.setForeground(Color.yellow);
    }
    
    public void setNintendo()
    {
        options.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
        options.setForeground(Color.orange);
        characterSelection.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        characterSelection.setForeground(Color.orange);
        themeSelection.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        themeSelection.setForeground(Color.orange);
    }
    
    public void setFarm()
    {
        options.setFont(new Font("Arial Black", Font.PLAIN, 35));
        options.setForeground(Color.white);
        characterSelection.setFont(new Font("Arial Black", Font.PLAIN, 20));
        characterSelection.setForeground(Color.white);
        themeSelection.setFont(new Font("Arial Black", Font.PLAIN, 20));
        themeSelection.setForeground(Color.white);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if (obj == starWars)
        {
            control.setTheme(1);
            setStarWars();
        }
        if (obj == nintendo)
        {
            control.setTheme(2);
            setNintendo();
        }
        if (obj == farm)
        {
            control.setTheme(3);
            setFarm();
        }
        if(obj == back)
        {
            this.setVisible(false);
            intro.setVisible(true);
        }
    }
}
