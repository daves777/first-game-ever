
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class GameOver extends JPanel implements ActionListener
{
    JLabel gameOverText;
    JButton game1;
    JButton game2;
    JButton game3;
    JButton back;
    IntroScreen intro;

    public GameOver()
    {
        super();
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        this.setOpaque(false);
        add(Box.createRigidArea(new Dimension(0,120)));
        
        gameOverText = new JLabel("Game Over");
        add(gameOverText);
        gameOverText.setFont(new Font("IMPACT", Font.PLAIN, 50));
        gameOverText.setForeground(Color.YELLOW);
        gameOverText.setAlignmentX(Component.CENTER_ALIGNMENT);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if (obj == back)
        {

        }
        
    }
}
