import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallVericalWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallVerticalWall extends Wall
{
    /**
     * Act - do whatever the SmallVericalWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SmallVerticalWall()
    {
        getImage().scale(getImage().getWidth(), getImage().getWidth() * 2);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
