import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turn(turnspeed=2);
        // Add your action code here.
    }
    
    int turnspeed;
    public Block(int maxturnspeed){
        this.turnspeed = Greenfoot.getRandomNumber(maxturnspeed)-(maxturnspeed);
        if(turnspeed == 0){
            turnspeed = 1;
        }
    }
}
