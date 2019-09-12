
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Game3Dogs extends JPanel implements ActionListener {

    JLabel gameTitle, questionOne, questionTwo;    
    JRadioButton a1, b1, c1, d1;
    JRadioButton a2, b2, c2, d2;
    JButton submit;
    int score = 0;
    int i = 21;


    public Game3Dogs() {

        super();
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        this.setOpaque(false);
        add(Box.createRigidArea(new Dimension(0, 120)));

        //Game Label
        gameTitle = new JLabel("Dog Trivia!");
        gameTitle.setForeground(Color.YELLOW);
        add(gameTitle);
        gameTitle.setFont(new Font("ARIEL", Font.PLAIN, 50));
        gameTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,30)));
        
        //Question 1 Label
        questionOne = new JLabel("Question 1");
        questionOne.setForeground(Color.YELLOW);
        add(questionOne);
        questionOne.setFont(new Font("ARIEL", Font.PLAIN, 20));
        questionOne.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Question 1 Buttons
        a1 = new JRadioButton("Answer 1");
        b1 = new JRadioButton("Answer 2");
        c1 = new JRadioButton("Answer 3");
        d1 = new JRadioButton("Answer 4");
        
        //Questions 1 Button Layout
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
        
        //Question 2 Label
        questionTwo = new JLabel("Question 2");
        questionTwo.setForeground(Color.YELLOW);
        add(questionTwo);
        questionTwo.setFont(new Font("ARIEL", Font.PLAIN, 20));
        questionTwo.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Question 2 Buttons
        a2 = new JRadioButton("Answer 1");
        b2 = new JRadioButton("Answer 2");
        c2 = new JRadioButton("Answer 3");
        d2 = new JRadioButton("Answer 4");
        
        //Question 2 Button Layout
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
        
        
        submit = new JButton("submit");
        add(submit);
        submit.setOpaque(false);
        submit.setAlignmentX(Component.CENTER_ALIGNMENT);
        submit.setForeground(Color.BLACK);
        
         
        
        //Action Listeners
        submit.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        /*
        
        Insert code here.
        
         */
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawString("Timer = " + (i-1), 320, 60);
        g.drawString("You have 20 seconds to answer all of the questions!", 320, 80);
       
        
    }

}
