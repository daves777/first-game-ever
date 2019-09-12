
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Game3StarWars2 extends JPanel implements ActionListener {

    JLabel gameTitle2, questionOne, questionTwo;    
    JRadioButton a1, b1, c1, d1;
    JRadioButton a2, b2, c2, d2;
    JButton submit;
    int score = 0;
    int i = 21;
    Game3StarWars3 starWarsScreen3;

    public Game3StarWars2() {

        super();
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        this.setOpaque(false);
        add(Box.createRigidArea(new Dimension(0, 120)));

        //Game Label
        gameTitle2 = new JLabel("Star Wars Trivia!");
        gameTitle2.setForeground(Color.YELLOW);
        add(gameTitle2);
        gameTitle2.setFont(new Font("ARIEL", Font.PLAIN, 50));
        gameTitle2.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,30)));
        
        //Question 3 Label
        questionOne = new JLabel("How tall is Chewbacca?");
        questionOne.setForeground(Color.YELLOW);
        add(questionOne);
        questionOne.setFont(new Font("ARIEL", Font.PLAIN, 20));
        questionOne.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Question 3 Buttons
        a1 = new JRadioButton("6ft 8in");
        b1 = new JRadioButton("8ft 11in");
        c1 = new JRadioButton("7ft 6in");
        d1 = new JRadioButton("12ft 10in");
        
        //Questions 3 Button Layout
        add(a1);
        /*
        Insert if statement for color depending on theme
        */
        a1.setOpaque(false);
        a1.setAlignmentX(Component.CENTER_ALIGNMENT);
        a1.setForeground(Color.WHITE);
        
        add(b1);
        /*
        Insert if statement for color depending on theme
        */
        b1.setOpaque(false);
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b1.setForeground(Color.WHITE);
        
        add(c1);
        /*
        Insert if statement for color depending on theme
        */
        c1.setOpaque(false);
        c1.setAlignmentX(Component.CENTER_ALIGNMENT);
        c1.setForeground(Color.WHITE);
        
        add(d1);
        /*
        Insert if statement for color depending on theme
        */
        d1.setOpaque(false);
        d1.setAlignmentX(Component.CENTER_ALIGNMENT);
        d1.setForeground(Color.WHITE);
        
        //Question 4 Label
        questionTwo = new JLabel("What color lasers do Tie Fighters shoot?");
        questionTwo.setForeground(Color.YELLOW);
        add(questionTwo);
        questionTwo.setFont(new Font("ARIEL", Font.PLAIN, 20));
        questionTwo.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Question 4 Buttons
        a2 = new JRadioButton("Green");
        b2 = new JRadioButton("Blue");
        c2 = new JRadioButton("Orange");
        d2 = new JRadioButton("White");
        
        //Question 4 Button Layout
         add(a2);
        /*
        Insert if statement for color depending on theme
        */
        a2.setOpaque(false);
        a2.setAlignmentX(Component.CENTER_ALIGNMENT);
        a2.setForeground(Color.WHITE);
        
        add(b2);
        /*
        Insert if statement for color depending on theme
        */
        b2.setOpaque(false);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setForeground(Color.WHITE);
        
        add(c2);
        /*
        Insert if statement for color depending on theme
        */
        c2.setOpaque(false);
        c2.setAlignmentX(Component.CENTER_ALIGNMENT);
        c2.setForeground(Color.WHITE);
        
        add(d2);
        /*
        Insert if statement for color depending on theme
        */
        d2.setOpaque(false);
        d2.setAlignmentX(Component.CENTER_ALIGNMENT);
        d2.setForeground(Color.WHITE);
        
        add(Box.createRigidArea(new Dimension(0, 30)));
        
        submit = new JButton("submit");
        add(submit);
        submit.setOpaque(false);
        submit.setAlignmentX(Component.CENTER_ALIGNMENT);
        submit.setForeground(Color.BLACK);
        
         
        
        //Action Listeners
        submit.addActionListener(this);
        
    }
    
    public void getScreen3(Game3StarWars3 s)
    {
        starWarsScreen3 = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

       Object obj = e.getSource();
        if (obj == submit) {
            this.setVisible(false);
            starWarsScreen3.setVisible(true);
            repaint();

        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawString("Timer = " + (i-1), 320, 60);
        g.drawString("You have 20 seconds to answer all of the questions!", 320, 80);
       
        
    }

}
