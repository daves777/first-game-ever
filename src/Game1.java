import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Game1 extends JPanel implements ActionListener {

   JLabel gameTitle;
   JLabel score;
   MainMap mainMap;
   JButton nintendo;
   JButton starWars;
   JButton dog;
   JButton back;
   Game3StarWars trivia1;
   Game3Nintendo trivia2;
   Game3Dogs trivia3;
   Game3StarWars2 trivia4;
   Game3StarWars3 trivia5;
   Timer tim;
   int i = 21;
   

   public Game1() {
       super();
       BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
       setLayout(layout);
       this.setOpaque(false);
       add(Box.createRigidArea(new Dimension(0, 120)));

       gameTitle = new JLabel("Trivia! Pick your category!");
       gameTitle.setForeground(Color.YELLOW);
       add(gameTitle);
       gameTitle.setFont(new Font("ARIEL", Font.PLAIN, 50));
       gameTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
       add(Box.createRigidArea(new Dimension(0, 20)));


       starWars = new JButton("Star Wars");
       add(starWars);
       starWars.setAlignmentX(Component.CENTER_ALIGNMENT);
       add(Box.createRigidArea(new Dimension(0, 20)));
       starWars.addActionListener(this);
       
       nintendo = new JButton("Nintendo");
       add(nintendo);
       nintendo.setAlignmentX(Component.CENTER_ALIGNMENT);
       add(Box.createRigidArea(new Dimension(0, 20)));
       nintendo.addActionListener(this);

       dog = new JButton("Dogs");
       add(dog);
       dog.setAlignmentX(Component.CENTER_ALIGNMENT);
       add(Box.createRigidArea(new Dimension(0, 20)));
       dog.addActionListener(this);

       back = new JButton("Back");
       add(back);
       back.setAlignmentX(Component.CENTER_ALIGNMENT);
       add(Box.createRigidArea(new Dimension(0, 20)));
       back.addActionListener(this);
       
       
       tim = new Timer(1000, this);
       tim.start();
       tim.stop();
        
       
   }

    public void getMainMapScreen(MainMap m) {
        mainMap = m;
    }

    public void getstarWarsScreen(Game3StarWars s) {
        trivia1 = s;
    }

    public void getNintendoScreen(Game3Nintendo s) {
        trivia2 = s;
    }

    public void getDogsScreen(Game3Dogs s) {
        trivia3 = s;
    }
    public void getstarWarsScreen2(Game3StarWars2 s) {
        trivia4 = s;
    }
    public void getstarWarsScreen3(Game3StarWars3 s) {
        trivia5 = s;
    }
    public void setStarWars()
    {
        gameTitle.setFont(new Font("IMPACT", Font.PLAIN, 50));
        gameTitle.setForeground(Color.yellow);
    }
    
    public void setNintendo()
    {
        gameTitle.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
        gameTitle.setForeground(Color.orange);
    }
    
    public void setFarm()
    {
        gameTitle.setFont(new Font("Arial Black", Font.PLAIN, 50));
        gameTitle.setForeground(Color.white);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == back) {
            this.setVisible(false);
            mainMap.setVisible(true);
        }
        if (obj == starWars) {
            this.setVisible(false);
            trivia1.setVisible(true);
            tim.start();
            
        }
        if (obj == nintendo) {

            this.setVisible(false);
            trivia2.setVisible(true);
            tim.start();
        }
        if (obj == dog) {

            this.setVisible(false);
            trivia3.setVisible(true);
            tim.start();
        }
        
        if (obj == tim) {
            if (i > 0) {
                i--;
                
                //shows the timer is working
                System.out.println("Seconds Left: " + i);
                
                if (i == 0){
                    System.out.println("GAME OVER");
                }
                repaint();
            }

           
       }

    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawString("Timer = " + (i-1), 320, 60);
        g.drawString("You have 20 seconds to answer all of the questions!", 320, 80);
        
    }

}
