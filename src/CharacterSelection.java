
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CharacterSelection extends JPanel implements ActionListener
{
    JPanel buttons;
    JPanel pictures;
    
    JButton luke;
    JButton mario;
    JButton dog;
    
    JButton lukePicture;
    JButton marioPicture;
    JButton dogPicture;
    
    Game2 game2;

    public CharacterSelection()
    {
        super();
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        this.setOpaque(false);
        
        buttons = new JPanel();
        buttons.setLayout(new BoxLayout(buttons, BoxLayout.X_AXIS));
        add(buttons);
        buttons.setOpaque(false);
        
        luke = new JButton("Luke");
        luke.setPreferredSize(new Dimension(30, 30));
        buttons.add(luke);
        buttons.add(Box.createRigidArea(new Dimension(50,0)));
        luke.addActionListener(this);
        
        mario = new JButton("Mario");
        mario.setPreferredSize(new Dimension(30, 30));
        buttons.add(mario);
        buttons.add(Box.createRigidArea(new Dimension(50, 0)));
        mario.addActionListener(this);
        
        dog = new JButton("Dog");
        dog.setPreferredSize(new Dimension(30, 30));
        buttons.add(dog);
        dog.addActionListener(this);
        
        add(Box.createRigidArea(new Dimension(0,10)));
        
        pictures = new JPanel();
        pictures.setLayout(new BoxLayout(pictures, BoxLayout.X_AXIS));
        add(pictures);
        pictures.setOpaque(false);
        pictures.add(Box.createRigidArea(new Dimension(10, 0)));
        
        lukePicture = new JButton(new ImageIcon("images/luke.png"));
        pictures.add(lukePicture);
        lukePicture.setBounds(new Rectangle(120, 120, 45, 45));
        lukePicture.setBorderPainted(false);
        lukePicture.setContentAreaFilled(false);
        pictures.add(Box.createRigidArea(new Dimension(14, 0)));
        
        marioPicture = new JButton(new ImageIcon("images/mario.png"));
        pictures.add(marioPicture);
        marioPicture.setBounds(new Rectangle(120, 120, 45, 45));
        marioPicture.setBorderPainted(false);
        marioPicture.setContentAreaFilled(false);
        pictures.add(Box.createRigidArea(new Dimension(10, 0)));
        
        dogPicture = new JButton(new ImageIcon("images/dog.png"));
        pictures.add(dogPicture);
        dogPicture.setBounds(new Rectangle(120, 120, 45, 45));
        dogPicture.setBorderPainted(false);
        dogPicture.setContentAreaFilled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if (obj == luke)
        {
            game2.setLuke();
        }
        if (obj == mario)
        {
            game2.setMario();
        }
        if (obj == dog)
        {
            game2.setDog();
        }
    }
    
    public void getGame2(Game2 g)
    {
        game2 = g;
    }
}
