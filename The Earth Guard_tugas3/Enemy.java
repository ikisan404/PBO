import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy(){
        setRotation(180);
    }
    public Enemy (int speedInput)
    {
        setRotation(180);
        speed = speedInput;
    }
    public int speed = 3;
    public void act()
    {
        // Add your action code here.
        move(speed);
        if(isTouching(Hero.class)){
            getWorld().removeObject(getOneIntersectingObject(Hero.class));
        }
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    }
    
