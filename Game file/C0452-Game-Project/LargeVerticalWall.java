import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LargeVerticalWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LargeVerticalWall extends Wall
{
    /**
     * Act - do whatever the LargeVerticalWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public LargeVerticalWall()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getWidth() * 6);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
