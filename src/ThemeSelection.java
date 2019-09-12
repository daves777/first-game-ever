
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class ThemeSelection extends JPanel implements ActionListener
{
    JButton starWars;
    JButton nintendo;
    JButton farm;

    public ThemeSelection()
    {
        super();
        BoxLayout layout = new BoxLayout(this, BoxLayout.LINE_AXIS);
        setLayout(layout);
        this.setOpaque(false);
        
        starWars = new JButton("Star Wars");
        add(starWars);
        
        add(Box.createRigidArea(new Dimension(30,0)));
        
        nintendo = new JButton("Nintendo");
        add(nintendo);
        
        add(Box.createRigidArea(new Dimension(30,0)));
        
        farm = new JButton("farm");
        add(farm);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        /*if (obj == dog)
        {

        }*/
    }
}
