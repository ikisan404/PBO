import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duar extends Actor
{
    /**
     * Act - do whatever the Duar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turn(2);
        duar();
    }
    int duarTime =0;
    public void duar(){
        duarTime++;
        if (duarTime==25){
            getWorld().removeObject(this);
            duarTime =0;
        }
        
    }
    
}
