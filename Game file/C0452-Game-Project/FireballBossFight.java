import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireballBossFight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireballBossFight extends Actor
{
    /**
     * Act - do whatever the FireballBossFight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public FireballBossFight()
    {
        setImage("static fireball.png");
        getImage().scale(getImage().getWidth()/15 , getImage().getHeight()/15);
    }
    
    public void act()
    {
        move(15);
        
        rotationSet();
        deleteProjectile();
    }
    
    public void rotationSet()
    {
        World world = getWorld();
        Lvl2 myWorld2 = (Lvl2)world;
        
        setRotation(myWorld2.getPlayer1().getRotation());
    }
    
    public void deleteProjectile()
    {
        if(isTouching(Wall.class))
        {
            World world  = getWorld();
            Lvl2 myWorld2 = (Lvl2)world;
            
            getWorld().addObject(new Explosion1(),getX(), getY());

            getWorld().removeObject(this);
        }
    }
}