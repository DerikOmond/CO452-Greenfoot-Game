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
    private int worldTime = frame / 60;
    
    private int animationCounter = 0;
    int divisor;
    
    public Player(){
        getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);
    }
    
    public void act()
    {
        frame++;
        shootFireball1();
        movement();
        faceMouse();
    }
    
    public void movement()
    {
        if(Greenfoot.isKeyDown("shift"))
        {
            speed = 8;
            divisor = 3;
        }
        else
        {
            speed = 5;
            divisor = 10;
        }
        
        if(Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("d"))
        {
            speed = 0;
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            animate();
            setLocation(getX(), getY() - speed);
            
            if(isTouching(Wall.class))
            {
                setLocation(getX(), getY() + speed);
            }
        }
        
        if(Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("d"))
        {
            speed = 0;
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            animate();
            setLocation(getX(), getY() + speed);
            
            if(isTouching(Wall.class))
            {
                setLocation(getX(), getY() - speed);
            }
        }
        if(Greenfoot.isKeyDown("d"))
        {
            animate();
            setLocation(getX() + speed, getY());
            
            if(isTouching(Wall.class))
            {
                setLocation(getX() - speed, getY());
            }
        }if(Greenfoot.isKeyDown("a"))
        {
            animate();
            setLocation(getX() - speed, getY());
            
            if(isTouching(Wall.class))
            {
                setLocation(getX() + speed, getY());
            }
        }
    }
    
    public void animate()
    {
        if(frame%divisor == 0)
        {
            setImage("PlayerMove" + animationCounter + ".png");
            getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);
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
    
    public void shootFireball1()
    {
        if(Greenfoot.mouseClicked(null)){
        World world = getWorld();
        Lvl1 myWorld1 = (Lvl1)world;
        
        Fireball1 fireball1 = new Fireball1();
        myWorld1.addObject(fireball1 , myWorld1.getPlayer().getX(), myWorld1.getPlayer().getY());
        myWorld1.getFireball1().setRotation(myWorld1.getPlayer().getRotation());
        }
    }
    
    public boolean touchingSpike()
    {
        if(isTouching(Spike.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
