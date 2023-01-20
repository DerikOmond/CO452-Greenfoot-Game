import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl1 extends World
{
    Player mainPlayer = new Player();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Lvl1()
    {    
        super(1536, 864, 1);
        
        addObject(mainPlayer, 196, 188);
    }
    
    public Player getPlayer()
    {
        return mainPlayer;
    }
}