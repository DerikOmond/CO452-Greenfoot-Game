import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl1 extends World
{
    public int frame = 0;
    public double gameSeconds = frame/60;

    Player mainPlayer = new Player();
    DummyProjectile projectile = new DummyProjectile();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Lvl1()
    {    super(1536, 864, 1);

        frame++;

        addObject(mainPlayer, 196, 188);
        prepare();
    }

    public Player getPlayer()
    {
        return mainPlayer;
    }

    public double getTime()
    {
        return gameSeconds;
    }
    
    public DummyProjectile getProjectile()
    {
        return projectile;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LargeWall largeWall = new LargeWall();
        addObject(largeWall,288,269);
        LargeVerticalWall largeVerticalWall = new LargeVerticalWall();
        addObject(largeVerticalWall,635,259);
        LargeVerticalWall largeVerticalWall2 = new LargeVerticalWall();
        addObject(largeVerticalWall2,299,597);
        MediumWall mediumWall = new MediumWall();
        addObject(mediumWall,391, 468);
        MediumVerticalWall mediumVerticalWall = new MediumVerticalWall();
        addObject(mediumVerticalWall,624,667);
        MediumWall mediumWall2 = new MediumWall();
        addObject(mediumWall2,737,274);
        MediumVerticalWall mediumVerticalWall2 = new MediumVerticalWall();
        addObject(mediumVerticalWall2,798,672);
        SmallVerticalWall smallVerticalWall = new SmallVerticalWall();
        addObject(smallVerticalWall,808,502);
        MediumWall mediumWall3 = new MediumWall();
        addObject(mediumWall3,861,451);
        MediumVerticalWall mediumVerticalWall3 = new MediumVerticalWall();
        addObject(mediumVerticalWall3,963,200);
        MediumWall mediumWall4 = new MediumWall();
        addObject(mediumWall4,857,574);
        LargeVerticalWall largeVerticalWall3 = new LargeVerticalWall();
        addObject(largeVerticalWall3,1134,597);
        MediumVerticalWall mediumVerticalWall4 = new MediumVerticalWall();
        addObject(mediumVerticalWall4,1135,373);
        SmallWall smallWall = new SmallWall();
        addObject(smallWall,1166,448);
        SmallWall smallWall2 = new SmallWall();
        addObject(smallWall2,1344,619);
        smallWall2.setLocation(1344,619);
    }
}