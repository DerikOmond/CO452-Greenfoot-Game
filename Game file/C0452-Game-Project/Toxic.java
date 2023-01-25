import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Toxic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toxic extends Actor
{
  /**
     * Act - do whatever the Toxic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void removeToxic()
    {
        if (isTouching(Fireball1.class))
        {
          getWorld().removeObject(this);
        }
    }
  public Toxic(){
        getImage().scale(getImage().getWidth()/15, getImage().getHeight()/15);
    }
    public void act()
    {
      move(1);
    if (Greenfoot.getRandomNumber(10)<1)
       {
           turn(Greenfoot.getRandomNumber(90)-45);
       }
       if (isTouching(BorderWall.class))
    {
        turn(90);
        move(30);
    }
    if (isTouching(VerticalBorderWall.class))
    {
        turn(90);
        move(30);
    }
    if (isTouching(BorderWallSmaller.class))
    {
        turn(90);
        move(30);
    }
    removeToxic();
  } 
}
    
 
