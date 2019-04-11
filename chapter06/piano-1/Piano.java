import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    int timeElapsed;
    String[] peopleInClass = {"Julio", "Liam", "Simon", "Eric"}; 
    
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        timeElapsed = 1926092604;
    }
    
    public void act() {
        timeElapsed += 1;
        showText("" + timeElapsed, 100, 100);
        addObject(new Key(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(340));
    }
}