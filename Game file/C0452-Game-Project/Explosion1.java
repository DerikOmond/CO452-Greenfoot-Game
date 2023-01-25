import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion1 extends Actor
{
    /**
     * Act - do whatever the Explosion1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage explosion1 = new GifImage("explosion1.gif");
    
    private int timeLimit = 30;
    public Explosion1()
    {
        setImage(explosion1.getCurrentImage());
    }
    
    public void act()
    {
        timeLimit--;
        
        deleteExplosion1();
    }
    
    public void deleteExplosion1()
    {
        if(timeLimit < 1)
        {
            World world  = getWorld();
            Lvl1 myWorld1 = (Lvl1)world;
            
            myWorld1.removeObject(this);
        }
    }
}
