import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2 extends World
{
    
    /**
     * Constructor for objects of class Lvl2.
     * 
     */
    
    Player mainPlayer = new Player();
    Nickdurer Nickdurer = new Nickdurer();
    Fireball2 fireball2;
    
    public Lvl2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1536, 864, 1);
        addObject(mainPlayer, 80, 181);
        addObject(new Nickdurer(), 950, 450);
    }
    
    public Nickdurer getNick()
    {
        return Nickdurer;
    }
    
    public Fireball2 getFireball2()
    {
        return fireball2;
    }
}
