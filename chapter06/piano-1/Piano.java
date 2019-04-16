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
    int addKeyVar;
    int addBlackKeyVar;
    int whichKey;
    int whichNote;
    int whichBlackKey;
    int whichBlackNote;
    String[] keyToPress = {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'"};
    String[] noteToPlay = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f"}; 
    String[] blackKeyToPress = {"w", "e", "r", "y", "u", "o", "p", "["};
    String[] blackNoteToPlay = {"3c#", "3d#", "3f#", "3g#", "3a#", "4c#", "4d#", "4f#"}; 

    String[] peopleInClass = {"Julio", "Liam", "Simon", "Eric"}; 

    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        addKeyVar = 75;
        addBlackKeyVar = 75;
        timeElapsed = 0;
        whichKey = 0;
        whichNote = 0;
        whichBlackKey = 0;
        whichBlackNote = 0;
        
    }

    public void act() {

        showText("Time Elapsed: " + timeElapsed, 120, 320);
        if (timeElapsed % 60 == 0 && timeElapsed / 60 < 4) {
            // showText("hello " + peopleInClass[timeElapsed / 60], 400, 170);
            // showText("Array index is " + timeElapsed / 60, 400, 250);
        }

        if (addKeyVar < 740 && timeElapsed % 10 == 0) {
            createKeys();
            addKeyVar += 64;
        }

        if (addBlackKeyVar < 700 && timeElapsed > 5 && timeElapsed % 10 == 0) {
            if (addBlackKeyVar != 267 && addBlackKeyVar != 459) {
                createBlackKeys();
            }
            addBlackKeyVar += 64;
        }

        timeElapsed += 1;

    }

    void createKeys() {
        addObject(new Key(keyToPress[whichKey], noteToPlay[whichNote], true), addKeyVar, 140);
        whichKey += 1;
        whichNote += 1;
    }

    void createBlackKeys() {
        addObject(new Key(blackKeyToPress[whichBlackKey], blackNoteToPlay[whichBlackNote], false), addBlackKeyVar + 30, 80);
        whichBlackKey += 1;
        whichBlackNote += 1;
    }
}