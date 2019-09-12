
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class Instructions extends JPanel implements ActionListener
{
    JLabel instructions;
    IntroScreen intro;
    JButton back;

    public Instructions()
    {
        super();
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        this.setOpaque(false);
        add(Box.createRigidArea(new Dimension(0,20)));
        
        instructions = new JLabel("Instructions");
        add(instructions);
        instructions.setFont(new Font("IMPACT", Font.PLAIN, 35));
        instructions.setForeground(Color.yellow);
        instructions.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,30)));
        
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
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if (obj == back)
        {
            this.setVisible(false);
            intro.setVisible(true);
        }
    }
}
