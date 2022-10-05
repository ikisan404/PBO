import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,62,248);
        hero.setLocation(55,313);
        hero.setLocation(47,313);
        hero.setLocation(61,286);
        hero.setLocation(34,295);
        

        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2, 500,95);
        
        

    }
    public void turnTowards​(int x, int y)
    {
        x = 311;
        y = 128;
    }
}

