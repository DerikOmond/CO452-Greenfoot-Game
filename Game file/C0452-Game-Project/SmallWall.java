import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallWall extends Wall
{
    /**
     * Act - do whatever the SmallWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SmallWall()
    {
        getImage().scale(getImage().getWidth() * 2, getImage().getWidth()/2);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
