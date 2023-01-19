import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 5;
    public Player(){
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
    public void act()
    {
        movement();
    }
    
    public void movement()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - speed);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + speed);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + speed, getY());
        }if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - speed, getY());
        }
    }
}
