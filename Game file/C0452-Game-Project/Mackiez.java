import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mackiez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mackiez extends Item
{
    /**
     * Act - do whatever the Mackiez wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Magix shots;
    public Mackiez(Magix shots)
    {
        this.shots = shots;        
    }
    
    public void act()
    {
        mackiezMagix();
    }
    
    public void mackiezMagix()
    {
        if(isTouching(Player.class))
        {
            shots.shots += 10;
            getWorld().removeObject(this);
        }
    }
}
