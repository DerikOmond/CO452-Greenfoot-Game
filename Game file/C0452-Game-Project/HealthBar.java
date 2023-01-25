import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Bar
{
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 100;
    int healthBarWidth = 100;
    int healthBarHeight = 10;
    int pixelsPerHealth = healthBarWidth/health;
    int playerTime = 0;

    public HealthBar()
    {
        setImage(new GreenfootImage(102,12));
        getImage().drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,pixelsPerHealth * health, 10 );
    }
    
    public void act()
    {
        World world = getWorld();
        Lvl1 myWorld1 = (Lvl1)world;
        playerTime++;
        
        setImage(new GreenfootImage(102,12));
        getImage().drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,pixelsPerHealth * health, 10 );
        setLocation(myWorld1.getPlayer().getX(), myWorld1.getPlayer().getY() - 80);
        
        loseHealth();
        gainHealth();
    }
    
    public void loseHealth()
    {
        World world = getWorld();
        Lvl1 myWorld1 = (Lvl1)world;
        
        if(myWorld1.getPlayer().touchingSpike())
        {
            health--;
        }
        if(health <= 0)
        {
            getWorld().showText("You Have Died :( \nBetter Luck Next Time \nYour Time: " + myWorld1.getTime() + " Seconds" , getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        }
    }
    
    public void gainHealth()
    {
        if(playerTime % 360 == 0)
        {
            health +=5;
        }
    }
}
