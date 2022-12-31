import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(8);
        bulletHit();
    }
    
    public void bulletHit(){
        if (isTouching(Enemy.class)){
        removeTouching(Enemy.class);
        Duar duar = new Duar();
        
        getWorld().addObject(duar,getX(),getY());
        getWorld().removeObject(this);
    }else if (getX()==799){
        getWorld().removeObject(this);
    }
        
}
}

