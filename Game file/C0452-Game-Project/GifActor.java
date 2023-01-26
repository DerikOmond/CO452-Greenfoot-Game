import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GifActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GifActor extends Actor
{   private boolean isFirstImage;
    private GreenfootImage firstImage; 
    GifImage myGif1 = new GifImage("gif1.gif");
    /**
     * Act - do whatever the GifActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif1.getCurrentImage());
        if (firstImage == null) // initializing (only executed during first act step)
    {
    firstImage = getImage(); // retain first image
    isFirstImage = true; // set tracking field
     }
     if (isFirstImage != (getImage() == firstImage)) // if an image change involved first image
    {
    isFirstImage = ! isFirstImage; // toggle tracking field
    if (isFirstImage) getWorld().removeObject(this);
    // if returning to first image, remove this
    }
    }
   
    
}
