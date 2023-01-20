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
    //Player speed
    private int speed = 5;
    
    //Player facing direcion
    private int mouseX,mouseY;

    //frame tracker
    private int frame;
    private int seconds = frame/60;
    
    private int animationCounter = 0;
    int divisor = 10;
    
    public Player(){
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
    public void act()
    {
        movement();
        faceMouse();
        shootProjectile();
        
        frame++;
    }
    
    public void movement()
    {
        if(Greenfoot.isKeyDown("shift"))
        {
            speed = 8;
            divisor = 10;
        }
        else
        {
            speed = 5;
            divisor = 3;
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            animate();
            setLocation(getX(), getY() - speed);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            animate();
            setLocation(getX(), getY() + speed);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            animate();
            setLocation(getX() + speed, getY());
        }if(Greenfoot.isKeyDown("a"))
        {
            animate();
            setLocation(getX() - speed, getY());
        }
    }
    
    public void animate()
    {
        if(frame%8 == 0)
        {
            setImage("PlayerMove" + animationCounter + ".png");
            getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
            animationCounter++;
            
            if(animationCounter > 3)
            {
                animationCounter = 0;
            }
        }
    }
    
    public void faceMouse()
    {
        if(Greenfoot.getMouseInfo() != null)
        {
            mouseX = Greenfoot.getMouseInfo().getX();
            mouseY = Greenfoot.getMouseInfo().getY();
            turnTowards(mouseX, mouseY);
        }
    }
    
    public void shootProjectile()
    {
        if(Greenfoot.mouseClicked(null)){
        World world = getWorld();
        Lvl1 myWorld = (Lvl1)world;
        
        DummyProjectile projectile = new DummyProjectile();
        myWorld.addObject(projectile, myWorld.getPlayer().getX(), myWorld.getPlayer().getY());
        }
    }
}
