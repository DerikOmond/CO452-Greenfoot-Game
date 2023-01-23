import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DummyProjectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball1 extends Actor
{
    /**
     * Act - do whatever the DummyProjectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage fireball1 = new GifImage("fireball1.gif");
    
    public Fireball1()
    {
        setImage(fireball1.getCurrentImage());
        getImage().scale(getImage().getWidth() / 15, getImage().getHeight() / 15);
    }
    
    public void act()
    {
        move(15);
        
        rotationSet();
        deleteProjectile();
    }
    
    public void rotationSet()
    {
        World world = getWorld();
        Lvl1 myWorld1 = (Lvl1)world;
        
        setRotation(myWorld1.getPlayer().getRotation());
    }
    
    public void deleteProjectile()
    {
        if(isTouching(Wall.class))
        {
            World world  = getWorld();
            Lvl1 myWorld1 = (Lvl1)world;
            
            myWorld1.removeObject(this);
        }
    }
}
