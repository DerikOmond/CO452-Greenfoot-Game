import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Magix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magix extends Actor
{
    /**
     * Act - do whatever the Magix wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int shots = 0;
    public Magix()
    {
        setImage(new GreenfootImage("Magix: "+ shots, 40, Color.ORANGE, new Color (59, 124, 209, 0)));
    }

    
    public void act()
    {
        setImage(new GreenfootImage("Magix: "+ shots, 40, Color.ORANGE, new Color (59, 124, 209, 0)));
    }
}
