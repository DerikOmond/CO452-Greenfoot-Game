import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SenzuBean here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SenzuBean extends Item
{
    /**
     * Act - do whatever the SenzuBean wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Magix shots;
    public SenzuBean(Magix shots)
    {
        this.shots = shots;
        getImage().scale(getImage().getWidth() / 5, getImage().getHeight() / 5);   
    }
    
    public void act()
    {
        senzuMagix();
    }
    
    public void senzuMagix()
    {
        if(isTouching(Player.class))
        {
            shots.shots += 15;
            getWorld().removeObject(this);
        }
    }
}
