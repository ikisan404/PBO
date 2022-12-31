import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Reiki
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Block block = new Block();
        
        addObject(new Block(2),427, 145);
        Robot robot = new Robot();
        addObject(robot,48,50);
        Wall wall = new Wall();
        addObject(wall,52, 147);
        Wall wall2 = new Wall();
        addObject(wall2,159, 147);
        Wall wall3 = new Wall();
        addObject(wall3,266,147);
        Wall wall4 = new Wall();
        addObject(wall4,587, 147);
        Wall wall5 = new Wall();
        addObject(wall5,692, 147);
        Wall wall6 = new Wall();
        addObject(wall6,791, 147);
        Home home = new Home();
        addObject(home,751, 552);
        Scorepanel scorepanel = new Scorepanel();
        addObject(scorepanel,71, 554);
        Pizza pizza = new Pizza ();
        addObject(pizza,720, 46);
        Pizza pizza2 = new Pizza ();
        addObject(pizza2,433, 38);
        Pizza pizza3 = new Pizza ();
        addObject(pizza3,183, 302);
        Pizza pizza4 = new Pizza ();
        addObject(pizza4,682, 312);
        Pizza pizza5 = new Pizza ();
        addObject(pizza5,417, 537);
        scorepanel.setLocation(115,562);
        scorepanel.setLocation(95,554);
    }
    
    int currentMaxTurnSpeed = 2;
    int currentLevel = 1;
    int level = 0;
    
    public void setUpLevel(){
       if (level==2)
        {
            currentMaxTurnSpeed=currentMaxTurnSpeed+1;
            addObject(new Block(2),427,145);
            
            Pizza pizza1 = new Pizza();
            addObject(pizza1,720,46);
            Pizza pizza2 = new Pizza();
            addObject(pizza2,433,38);
            Pizza pizza3 = new Pizza();
            addObject(pizza3,183,302);
            Pizza pizza4 = new Pizza();
            addObject(pizza4,682,312);
            Pizza pizza5 = new Pizza();
            addObject(pizza5,417,537);
        }
        else if (level==3)
        {
            currentMaxTurnSpeed=currentMaxTurnSpeed+2;
            addObject(new Block(2),427,145);
            
            Pizza pizza1 = new Pizza();
            addObject(pizza1,720,46);
            Pizza pizza2 = new Pizza();
            addObject(pizza2,433,38);
            Pizza pizza3 = new Pizza();
            addObject(pizza3,183,302);
            Pizza pizza4 = new Pizza();
            addObject(pizza4,682,312);
            Pizza pizza5 = new Pizza();
            addObject(pizza5,417,537);
        }
        else if (level==4)
        {
            currentMaxTurnSpeed++; 
            addObject(new Block(2),427,145);
            
            Pizza pizza1 = new Pizza();
            addObject(pizza1,720,46);
            Pizza pizza2 = new Pizza();
            addObject(pizza2,433,38);
            Pizza pizza3 = new Pizza();
            addObject(pizza3,183,302);
            Pizza pizza4 = new Pizza();
            addObject(pizza4,682,312);
            Pizza pizza5 = new Pizza();
            addObject(pizza5,417,537);
        }
        increaseLevel();
    }
    public void increaseLevel()
    {
        currentLevel++;
    } 
}
