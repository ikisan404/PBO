import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveHero();
        heroBullet();
        heroHit();
        restartPosition();
    }
    public void moveHero()
    {
        if(Greenfoot.isKeyDown("w"))
        setLocation(getX(),getY()-3);
        if(Greenfoot.isKeyDown("s"))
        setLocation(getX(),getY()+3);
        
        if(Greenfoot.isKeyDown("a"))
        setLocation(getX()-3,getY());
        if(Greenfoot.isKeyDown("d"))
        setLocation(getX()+3,getY());
    }
    int bulletTime = 0;
    public void heroBullet(){
        bulletTime++;
        if (bulletTime==15){
            Laser laser = new Laser();
            getWorld().addObject (laser, getX()+50,getY());
            bulletTime =0;
        }
    }
    public void heroHit(){
        if (isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            Duar duar = new Duar();
            getWorld().addObject(duar, getX(),getY());
            setLocation(50,200);
            
        }
    }
    public void restartPosition(){
        if (getY()==0){
            setLocation (getX(),398);  
    }
        if (getY()==399){
            setLocation (getX(),1);
        }
}
}
