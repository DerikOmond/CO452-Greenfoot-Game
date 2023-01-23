import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BorderWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BorderWall extends Wall
{
    /**
     * Act - do whatever the BorderWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BorderWall()
    {
        getImage().scale(getImage().getWidth() * 26, getImage().getWidth()/2);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
