
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Game3StarWars extends JPanel implements ActionListener {

    JLabel gameTitle, questionOne, questionTwo;
    JRadioButton a1, b1, c1, d1;
    JRadioButton a2, b2, c2, d2;
    JButton submit;
    Game3StarWars2 starWarsScreen2;
    Game3 game3;
    int score = 0;
    int i = 21;

    public Game3StarWars() {

        super();
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        this.setOpaque(false);
        add(Box.createRigidArea(new Dimension(0, 120)));

        //Game Label
        gameTitle = new JLabel("Star Wars Trivia!");
        gameTitle.setForeground(Color.YELLOW);
        add(gameTitle);
        gameTitle.setFont(new Font("ARIEL", Font.PLAIN, 50));
        gameTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0, 30)));

        //Question 1 Label
        questionOne = new JLabel("In the 'Star Wars' movies, who was Anakin Skywalker's father?");
        questionOne.setForeground(Color.YELLOW);
        add(questionOne);
        questionOne.setFont(new Font("ARIEL", Font.PLAIN, 20));
        questionOne.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Question 1 Buttons
        a1 = new JRadioButton("Senator Palpatine");
        b1 = new JRadioButton("Cade Skywalker");
        c1 = new JRadioButton("Owen Lars");
        d1 = new JRadioButton("He didnt have one");

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
        questionTwo = new JLabel("Who said \"Jabba's put a price on your head so large, every bounty hunter in the galaxy will be looking for you.\"? ");
        questionTwo.setForeground(Color.YELLOW);
        add(questionTwo);
        questionTwo.setFont(new Font("ARIEL", Font.PLAIN, 20));
        questionTwo.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Question 2 Buttons
        a2 = new JRadioButton("Luke Skywalker");
        b2 = new JRadioButton("Boba Fett");
        c2 = new JRadioButton("Greedo");
        d2 = new JRadioButton("Lando Calrissian");

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
        
        add(Box.createRigidArea(new Dimension(0, 10)));

        submit = new JButton("submit");
        add(submit);
        submit.setOpaque(false);
        submit.setAlignmentX(Component.CENTER_ALIGNMENT);
        submit.setForeground(Color.BLACK);

        //Action Listeners
        submit.addActionListener(this);

    }
    
    public void getScreen2(Game3StarWars2 s)
    {
        starWarsScreen2 = s;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == submit) {
            this.setVisible(false);
            starWarsScreen2.setVisible(true);
            repaint();

        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("Timer = " + (i - 1), 320, 60);
        g.drawString("You have 20 seconds to answer all of the questions!", 320, 80);

    }

}
