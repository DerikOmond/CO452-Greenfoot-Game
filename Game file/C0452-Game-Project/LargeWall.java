import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LargeWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LargeWall extends Wall
{
    /**
     * Act - do whatever the LargeWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int x;
    private int y;
    
    public LargeWall()
    {
        getImage().scale(getImage().getWidth() * 6, getImage().getWidth()/2);
    }
    
    public void act()
    {
        
    }
}
