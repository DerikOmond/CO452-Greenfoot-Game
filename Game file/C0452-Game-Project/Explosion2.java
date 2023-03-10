import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion2 extends Actor
{
    /**
     * Act - do whatever the Explosion1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage explosion2 = new GifImage("explosion1.gif");
    
    private int timeLimit = 30;
    public Explosion2()
    {
        setImage(explosion2.getCurrentImage());
    }
    
    public void act()
    {
        timeLimit--;
        
        deleteExplosion2();
    }
    
    public void deleteExplosion2()
    {
        if(timeLimit < 1)
        {
            World world  = getWorld();
            Lvl2 myWorld2 = (Lvl2)world;
            
            myWorld2.removeObject(this);
        }
    }
}

