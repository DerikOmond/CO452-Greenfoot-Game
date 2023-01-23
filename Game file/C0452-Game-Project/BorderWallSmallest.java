import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BorderWallSmallest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BorderWallSmallest extends Wall
{
    /**
     * Act - do whatever the BorderWallSmallest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BorderWallSmallest()
    {
        getImage().scale(getImage().getWidth() * 2, getImage().getHeight() / 2);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
