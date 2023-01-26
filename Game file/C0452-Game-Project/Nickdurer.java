import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nickdurer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nickdurer extends Actor
{
    /**
     * Act - do whatever the Nickdurer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean touchingFire = false;
   
    public void act()
      {
        follow();
        //shoot();
        shootFireball2();
        hitFireball();
      }
      
    public Nickdurer(){
        getImage().scale(getImage().getWidth()/4, getImage().getHeight()/4);
    }   
    
    public void follow()
    {
        World world = getWorld();
        Lvl2 myWorld2 = (Lvl2)world;
        
        turnTowards(myWorld2.mainPlayer1.getX() , myWorld2.mainPlayer1.getY());
        move(1);
        
    }
    
    public void shootFireball2()
    {
        int shoot = Greenfoot.getRandomNumber(100);
        if (shoot < 1)
        {
            Fireball2 fireballBlue=new Fireball2();
            getWorld().addObject(fireballBlue, getX(), getY());
            fireballBlue.setRotation(getRotation());
        }
        
    }
    
    public void hitFireball()
    {
        Actor fire = getOneIntersectingObject(FireballBossFight.class);
        if(fire != null)
        {
            World world = getWorld();
            Lvl2 myWorld = (Lvl2)world;
            
            NickHealth healthBar = myWorld.getBossHealth();
            if(touchingFire == false)
            {
                healthBar.NickLoseHealth();
                touchingFire = true;
                
                if(healthBar.health <= 0)
                {
                    setImage("explosion2.png");
                    for(int i = 0 ; i < 100 ; i++)
                    {
                        
                    }
                    getWorld().showText("Congratulaions!!!! \n You've Beat The Game!! XD \n Have a Nice Life", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                    Greenfoot.stop();
                }
            }
        }
    }











}

            
            
            
            
            
            
            
            


