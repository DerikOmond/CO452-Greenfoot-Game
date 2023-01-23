import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BorderWallSmaller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BorderWallSmaller extends Wall
{
    /**
     * Act - do whatever the BorderWallSmaller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BorderWallSmaller()
    {
        getImage().scale(getImage().getWidth() * 21, getImage().getWidth() / 2);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
