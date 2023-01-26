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
    public int i = 0;

    Player mainPlayer = new Player();
    Fireball1 fireball1 = new Fireball1();
    HealthBar healthBar = new HealthBar();
    Magix shots = new Magix();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    public Lvl1()
    {    super(1536, 864, 1);

        frame++;
        prepare();
        for (i=0; i <8 ; i++){
        int x = Greenfoot.getRandomNumber(getWidth()-1);
       int y = Greenfoot.getRandomNumber(getHeight()-1);
       addObject (new Toxic(), x, y);
    }
    addObject (new GifActor(), 786, 757);

    }

    public Player getPlayer()
    {
        return mainPlayer;
    }

    public double getTime()
    {
        return gameSeconds;
    }
    
    public Fireball1 getFireball1()
    {
        return fireball1;
    }
    
    public Magix getMagix()
    {
        return shots;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Internal Walls
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

        //External Walls
        BorderWall borderWall = new BorderWall();
        addObject(borderWall,764,88);
        BorderWallSmaller borderWallSmaller = new BorderWallSmaller();
        addObject(borderWallSmaller,625,769);
        BorderWallSmallest borderWallSmallest = new BorderWallSmallest();
        addObject(borderWallSmallest,1381,768);
        VerticalBorderWall verticalBorderWall = new VerticalBorderWall();
        addObject(verticalBorderWall,1418,434);
        VerticalBorderWall verticalBorderWall2 = new VerticalBorderWall();
        addObject(verticalBorderWall2,116,429);
        VerticalBorderWallSmaller verticalBorderWallSmaller = new VerticalBorderWallSmaller();
        addObject(verticalBorderWallSmaller,1336,814);
        VerticalBorderWallSmaller verticalBorderWallSmaller2 = new VerticalBorderWallSmaller();
        addObject(verticalBorderWallSmaller2,1135,817);

        //Spikes
        Spike spike = new Spike();
        addObject(spike,176,325);
        Spike spike2 = new Spike();
        addObject(spike2,674,638);
        Spike spike3 = new Spike();
        addObject(spike3,739,648);
        Spike spike4 = new Spike();
        addObject(spike4,348,513);
        Spike spike5 = new Spike();
        addObject(spike5,737,154);
        Spike spike6 = new Spike();
        addObject(spike6,739,226);
        Spike spike7 = new Spike();
        addObject(spike7,1352,240);
        Spike spike8 = new Spike();
        addObject(spike8,1350,668);

        //Food items
        SenzuBean senzuBean = new SenzuBean(shots);
        addObject(senzuBean,521,198);
        SenzuBean senzuBean2 = new SenzuBean(shots);
        addObject(senzuBean2,877,150);
        SenzuBean senzuBean3 = new SenzuBean(shots);
        addObject(senzuBean3,182,640);
        SenzuBean senzuBean4 = new SenzuBean(shots);
        addObject(senzuBean4,249,636);
        Mackiez mackiez = new Mackiez(shots);
        addObject(mackiez,401,689);
        Pizza pizza = new Pizza(shots);
        addObject(pizza,705,493);
        Pizza pizza2 = new Pizza(shots);
        addObject(pizza2,1212,552);
        Mackiez mackiez2 = new Mackiez(shots);
        addObject(mackiez2,934,689);
        Pizza pizza3 = new Pizza(shots);
        addObject(pizza3,1041,416);
        Pizza pizza4 = new Pizza(shots);
        addObject(pizza4,368,366);

        //Player
        addObject(mainPlayer, 196, 188);

        //Player health
        addObject(healthBar,getPlayer().getX(), getPlayer().getY() - 80);

        //Magix counter
        addObject(shots,164,50);
    }
}