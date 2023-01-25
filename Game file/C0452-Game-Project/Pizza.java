import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Item
{
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Magix shots;
    public Pizza(Magix shots)
    {
        this.shots = shots;
    }
    
    public void act()
    {
        pizzaMagix();
    }
    
    public void pizzaMagix()
    {
        if(isTouching(Player.class))
        {
            shots.shots += 5;
            getWorld().removeObject(this);
        }
    }
}
