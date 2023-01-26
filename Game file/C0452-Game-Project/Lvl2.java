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
    
    Player1 mainPlayer1 = new Player1();
    Nickdurer Nickdurer = new Nickdurer();
    HealthBar0 healthBar0 = new HealthBar0();
    FireballBossFight fireballBossFight;
    Fireball2 fireball2;
    Magix shots = new Magix();
    int i = 0;
    
    public Lvl2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1536, 864, 1);
        addObject(mainPlayer1, 46, 237);
        addObject(new Nickdurer(), 950, 450);
        addObject(healthBar0,getPlayer1().getX(), getPlayer1().getY() - 80);
        addObject(shots,164,50);
        prepare();
        for (i=0; i <10 ; i++){
        int x = Greenfoot.getRandomNumber(getWidth()-1);
       int y = Greenfoot.getRandomNumber(getHeight()-1);
       addObject (new Toxic(), x, y);
    }
}
    
    public Fireball2 getFireball2()
    {
        return fireball2;
    }
    
    public Player1 getPlayer1()
    {
        return mainPlayer1;
    }
    
    public FireballBossFight getFireballBossFight()
    {
        return fireballBossFight;
    }
    
    public Magix getMagix()
    {
        return shots;
    }
    
    private void prepare()
    {
        BorderWallSmallest borderWallSmallest = new BorderWallSmallest();
        addObject(borderWallSmallest,4,118);
        BorderWallSmallest borderWallSmallest2 = new BorderWallSmallest();
        addObject(borderWallSmallest2,81,118);
        BorderWallSmallest borderWallSmallest3 = new BorderWallSmallest();
        addObject(borderWallSmallest3,37,334);
        BorderWallSmallest borderWallSmallest4 = new BorderWallSmallest();
        addObject(borderWallSmallest4,86,334);
        BorderWall borderWall = new BorderWall();
        addObject(borderWall,776,90);
        VerticalBorderWall verticalborderWall = new VerticalBorderWall();
        addObject(verticalborderWall,1413,429);
        SmallWall smallWall = new SmallWall();
        addObject(smallWall,1368,750);
        VerticalBorderWallSmaller verticalBorderWallSmaller = new VerticalBorderWallSmaller();
        addObject(verticalBorderWallSmaller,1328,790);
        VerticalBorderWallSmaller verticalBorderWallSmaller2 = new VerticalBorderWallSmaller();
        addObject(verticalBorderWallSmaller2,1146,789);
        BorderWallSmaller borderWallSmaller = new BorderWallSmaller();
        addObject(borderWallSmaller,632,751);
        SmallVerticalWall smallVerticalWall = new SmallVerticalWall();
        addObject(smallVerticalWall,126,695);
        MediumVerticalWall mediumVerticalWall = new MediumVerticalWall();
        addObject(mediumVerticalWall,126,574);
        MediumVerticalWall mediumVerticalWall2 = new MediumVerticalWall();
        addObject(mediumVerticalWall2,126,423);
        
        
        Spike spike = new Spike();
        addObject(spike,176,395);
        Spike spike1 = new Spike();
        addObject(spike1,176,639);
        Spike spike2 = new Spike();
        addObject(spike2,657,639);
        Spike spike3 = new Spike();
        addObject(spike3,1140,152);
        Spike spike4 = new Spike();
        addObject(spike4,1221,153);
        Spike spike5 = new Spike();
        addObject(spike5,1300,154);
        Spike spike6 = new Spike();
        addObject(spike6,1221,800);
        Spike spike7 = new Spike();
        addObject(spike7,1220,721);
        
    }
}
