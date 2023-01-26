import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NickHealth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NickHealth extends Bar
{
    /**
     * Act - do whatever the NickHealth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 300;
    int healthBarWidth = 300;
    int healthBarHeight = 30;
    int pixelsPerHealthPoint = (int)healthBarWidth/health;
    
    public NickHealth()
    {
        update();
    }
    
    public void act()
    {
        update();
    }
    
    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth + 2,healthBarHeight + 2));
        getImage().drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,pixelsPerHealthPoint * health, 30 );
    }
    
    public void NickLoseHealth()
    {
        health -= 10;
    }
}
