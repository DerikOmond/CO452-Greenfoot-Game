import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */ 
public class Player1 extends Actor
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
    
    public Player1(){
        getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);
    }
    
    public void act()
    {
        frame++;
        shootFireballBossFight();
        movement();
        faceMouse();
        checkPosition2();
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
    
        public void checkPosition2() {
    if (getX() == 46 && getY() == 237) {
        Greenfoot.playSound("musiki.mp3");
    }
}
    
    public void shootFireballBossFight()
    {
        if(Greenfoot.mouseClicked(null)){
            Greenfoot.playSound("pew.mp3");
            World world = getWorld();
            Lvl2 myWorld2 = (Lvl2)world;
        
            FireballBossFight fireballBossFight = new FireballBossFight();
        
            myWorld2.addObject(fireballBossFight , myWorld2.getPlayer1().getX(), myWorld2.getPlayer1().getY());
        
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
    public boolean touchingToxic()
    {
        if(isTouching(Toxic.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}
