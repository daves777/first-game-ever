
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class Credits extends JPanel implements ActionListener
{
    JLabel credits;
    IntroScreen intro;
    JButton back;

    public Credits()
    {
        super();
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        this.setOpaque(false);
        add(Box.createRigidArea(new Dimension(0,20)));
        
        credits = new JLabel("Credits/About");
        add(credits);
        credits.setFont(new Font("IMPACT", Font.PLAIN, 35));
        credits.setForeground(Color.yellow);
        credits.setAlignmentX(Component.CENTER_ALIGNMENT);
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
