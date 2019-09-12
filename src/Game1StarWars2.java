
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Game1StarWars2 extends JPanel implements ActionListener {

    JLabel gameTitle2, questionOne, questionTwo;
    JRadioButton a1, b1, c1, d1;
    JRadioButton a2, b2, c2, d2;
    JButton submit;
    int score = 0;
    int i = 21;

    public Game1StarWars2() {

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
        add(Box.createRigidArea(new Dimension(0, 30)));

        //Question 3 Label
        questionOne = new JLabel("How old is Padme Amidala when she's elected to the position of Queen of Naboo?");
        questionOne.setForeground(Color.YELLOW);
        add(questionOne);
        questionOne.setFont(new Font("ARIEL", Font.PLAIN, 20));
        questionOne.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Question 3 Buttons
        a1 = new JRadioButton("22");
        b1 = new JRadioButton("14");
        c1 = new JRadioButton("106");
        d1 = new JRadioButton("8");

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
        questionTwo = new JLabel("What famous composer has scored all the 'Star Wars' films so far?");
        questionTwo.setForeground(Color.YELLOW);
        add(questionTwo);
        questionTwo.setFont(new Font("ARIEL", Font.PLAIN, 20));
        questionTwo.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Question 4 Buttons
        a2 = new JRadioButton("John Barry");
        b2 = new JRadioButton("Hans Zimmer");
        c2 = new JRadioButton("Danny Elfman");
        d2 = new JRadioButton("John Williams");

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

        submit = new JButton("submit");
        add(submit);
        submit.setOpaque(false);
        submit.setAlignmentX(Component.CENTER_ALIGNMENT);
        submit.setForeground(Color.BLACK);

        //Action Listeners
        submit.addActionListener(this);

    }

    
    public void actionPerformed(ActionEvent e) {

        /*
        
        Insert code here.
        
         */
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("Timer = " + (i - 1), 320, 60);
        g.drawString("You have 20 seconds to answer all of the questions!", 320, 80);

    }

}
