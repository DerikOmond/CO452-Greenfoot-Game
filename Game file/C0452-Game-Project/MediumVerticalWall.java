import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MediumVerticalWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MediumVerticalWall extends Wall
{
    /**
     * Act - do whatever the MediumVerticalWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MediumVerticalWall()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getWidth() * 3);    
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
