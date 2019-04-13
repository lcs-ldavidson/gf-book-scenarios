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
        
        timeElapsed = 0;
    }

    public void act() {
        
        showText("Time Elapsed: " + timeElapsed, 150, 100);
        if (timeElapsed % 60 == 0 && timeElapsed / 60 < 4) {
            showText("hello " + peopleInClass[timeElapsed / 60], 400, 170);
            showText("Array index is " + timeElapsed / 60, 400, 250);
        }

        timeElapsed += 1;
    }
}