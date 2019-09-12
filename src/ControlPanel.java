import java.awt.*;
import javax.swing.*;

public class ControlPanel extends JPanel
{

   int theme = 1;
   IntroScreen main;
   MainMap gameSelection;
   Game1 game1;
   Game2 game2;
   JLayeredPane game3Group;

   ImageIcon sourceImage1 = new ImageIcon("images/stars.png");
   Image myImage1 = sourceImage1.getImage();

   ImageIcon sourceImage2 = new ImageIcon("images/nintendo clouds.jpg");
   Image myImage2 = sourceImage2.getImage();

   ImageIcon sourceImage3 = new ImageIcon("images/farm.jpg");
   Image myImage3 = sourceImage3.getImage();

   public ControlPanel()
   {
       super();
       gameSelection = new MainMap();
       main = new IntroScreen();
       Credits credits = new Credits();
       Instructions instructions = new Instructions();
       
       GameOver gameOverScreen = new GameOver();
       
       game1 = new Game1();
       game2 = new Game2(gameSelection);
       Game3 game3 = new Game3();
       
       Options options = new Options(this, game2);
       
       Game3StarWars starWarsScreen = new Game3StarWars();
       Game3Nintendo nintendoScreen = new Game3Nintendo();
       Game3Dogs dogsScreen = new Game3Dogs();
       Game3StarWars2 starWarsScreen2 = new Game3StarWars2();
       starWarsScreen.getScreen2(starWarsScreen2);
       Game3StarWars3 starWarsScreen3 = new Game3StarWars3();
       starWarsScreen2.getScreen3(starWarsScreen3);

       game1.getMainMapScreen(gameSelection);
       game1.getstarWarsScreen(starWarsScreen);
       game1.getNintendoScreen(nintendoScreen);
       game1.getDogsScreen(dogsScreen);
       game1.getstarWarsScreen2(starWarsScreen2);
       game1.getstarWarsScreen3(starWarsScreen3);
       
       game3.getMainMapScreen(gameSelection);
       game3.getstarWarsScreen(starWarsScreen);
       game3.getNintendoScreen(nintendoScreen);
       game3.getDogsScreen(dogsScreen);
       game3.getstarWarsScreen2(starWarsScreen2);
       game3.getstarWarsScreen3(starWarsScreen3);


       main.getMainMapScreen(gameSelection);
       main.getCreditsScreen(credits);
       main.getInstructionsScreen(instructions);
       main.getOptionsScreen(options);

       credits.getIntroScreen(main);

       instructions.getIntroScreen(main);

       options.getIntroScreen(main);

       gameSelection.getIntroScreen(main);
       gameSelection.getGameOverScreen(gameOverScreen);
       gameSelection.getGames(game1, game2, game3);


       add(main);
       add(gameSelection);
       add(gameOverScreen);
       add(credits);
       add(instructions);
       add(options);
       
       add(game1);
       add(game2);
       add(game3);
       
       add(starWarsScreen);
       add(nintendoScreen);
       add(dogsScreen);
       add(starWarsScreen2);
       add(starWarsScreen3);
       

       gameSelection.setVisible(false);
       gameOverScreen.setVisible(false);
       credits.setVisible(false);
       game1.setVisible(false);
       game2.setVisible(false);
       game3.setVisible(false);
       instructions.setVisible(false);
       options.setVisible(false);
       starWarsScreen.setVisible(false);
       starWarsScreen2.setVisible(false);
       starWarsScreen3.setVisible(false);
       nintendoScreen.setVisible(false);
       dogsScreen.setVisible(false);
       
   }

   @Override
   public void paintComponent(Graphics g)  //just an example of how to use paintComponent
   {
       super.paintComponent(g);
       if (theme == 1)
       {
           g.drawImage(myImage1, 0, 0, this);
       }
       if (theme == 2)
       {
           g.drawImage(myImage2, 0, 0, this);
       }
       if (theme == 3)
       {
           g.drawImage(myImage3, 0, 0, this);
       }
   }

   public void setTheme(int t)
   {
       theme = t;
       repaint();
       if(theme == 1)
       {
           main.setStarWars();
           gameSelection.setStarWars();
           game1.setStarWars();
           game2.setStarWars();
       }
       if(theme == 2)
       {
           main.setNintendo();
           gameSelection.setNintendo();
           game1.setNintendo();
           game2.setNintendo();
           
       }
       if(theme == 3)
       {
           main.setFarm();
           gameSelection.setFarm();
           game1.setFarm();
           game2.setFarm();
       }
   }

}