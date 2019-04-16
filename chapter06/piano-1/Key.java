import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{

    GreenfootImage keyDown;
    GreenfootImage keyUp;
    GreenfootImage blackKeyDown;
    GreenfootImage blackKeyUp;
    boolean isKeyWhite;
    String keyToPress;
    String noteToPlay;
    boolean canPlaySound;

    public Key(String key, String note, boolean isWhite)
    {
        keyDown = new GreenfootImage("white-key-down.png");
        keyUp = new GreenfootImage("white-key.png");
        blackKeyDown = new GreenfootImage("black-key-down.png");
        blackKeyUp = new GreenfootImage("black-key.png");
        isKeyWhite = isWhite;
        keyToPress = key;
        noteToPlay = note;
        canPlaySound = true;

        if (isKeyWhite == true) {
            setImage(keyUp);
        } else if (isKeyWhite == false) {
            setImage(blackKeyUp);
        }
    }

    public void act()
    {
        animate();
    }

    void animate() {
        if (Greenfoot.isKeyDown(keyToPress) && canPlaySound == true) {
            if (getImage() == keyUp) {
                setImage(keyDown);
            }
            if (getImage() == blackKeyUp) {
                setImage(blackKeyDown);
            }
            Greenfoot.playSound(noteToPlay + ".wav");
            canPlaySound = false;

        } else if (Greenfoot.isKeyDown(keyToPress) && canPlaySound == false) {
            if (getImage() == keyUp) {
                setImage(keyDown);
            }
            if (getImage() == blackKeyUp) {
                setImage(blackKeyDown);
            }

            
        } else {
            if (getImage() == blackKeyDown) {
                setImage(blackKeyUp);
            }
            if (getImage() == keyDown) {
                setImage(keyUp);
            }

            canPlaySound = true;
        }
    }

    void playNote() {
        Greenfoot.playSound(noteToPlay + ".wav");   
    }
}

