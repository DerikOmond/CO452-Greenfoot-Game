import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VerticalBorderWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VerticalBorderWall extends Wall
{
    /**
     * Act - do whatever the VerticalBorderWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public VerticalBorderWall()
    {
        getImage().scale(getImage().getWidth() / 2, getImage().getHeight() * 13);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
