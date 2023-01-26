import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar0 extends Bar
{
    /**
     * Act - do whatever the HealthBar0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health0 = 100;
    int healthBarWidth = 100;
    int healthBarHeight = 10;
    int pixelsPerHealth = healthBarWidth/health0;
    int playerTime = 0;

    public HealthBar0()
    {
        setImage(new GreenfootImage(102,12));
        getImage().drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,pixelsPerHealth * health0, 10 );
    }
    
    public void act()
    {
        World world = getWorld();
        Lvl2 myWorld2 = (Lvl2)world;
        playerTime++;
        
        setImage(new GreenfootImage(102,12));
        getImage().drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,pixelsPerHealth * health0, 10 );
        setLocation(myWorld2.getPlayer1().getX(), myWorld2.getPlayer1().getY() - 80);
        
        loseHealth0();
        gainHealth0();
    }
    
    public void loseHealth0()
    {
        World world = getWorld();
        Lvl2 myWorld2 = (Lvl2)world;
        
        if(myWorld2.getPlayer1().touchingSpike())
        {
            health0--;
        }
        if(myWorld2.getPlayer1().touchingToxic())
        {
            health0--;
        }
        if(myWorld2.getPlayer1().touchingBlueFlame())
        {
            health0--;
        }
        
        
        if(health0 <= 0)
        {
            getWorld().showText("You Have Died :( \nBetter Luck Next Time", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();           
        }
    }
    
    public void gainHealth0()
    {
        if(playerTime % 360 == 0)
        {
            health0 +=5;
        }
    }
}