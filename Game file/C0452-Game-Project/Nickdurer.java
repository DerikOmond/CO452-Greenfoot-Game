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
   
    public void act()
      {
        follow();
        //shoot();
        fireball2();
      }
    
   
            
            
            
            
    public void follow()
    {
        World world = getWorld();
        Lvl2 myWorld2 = (Lvl2)world;
        
        turnTowards(myWorld2.mainPlayer.getX() , myWorld2.mainPlayer.getY());
        move(2);
        
    }
  
            
    

    public void fireball2()
    {
        int shoot = Greenfoot.getRandomNumber(100);
        if (shoot < 2)
        {
            Fireball2 fireballBlue=new Fireball2();
            getWorld().addObject(fireballBlue, getX(), getY());
            fireballBlue.setRotation(getRotation());
        }
        
    }











}

            
            
            
            
            
            
            
            


