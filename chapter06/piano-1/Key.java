import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    
    GreenfootImage keyDown;
    GreenfootImage keyUp;
    
    public Key()
    {
        keyDown = new GreenfootImage("white-key-down.png");
        keyUp = new GreenfootImage("white-key.png");
        setImage(keyUp);
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("g")) {
            setImage(keyDown);
        } else {
            setImage(keyUp);
        }
    }
}

