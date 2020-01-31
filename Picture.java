/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 * 
 * The picture shown is a person who went to an art museum and is admiring
 * the art shown.
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Ryan Boehm
 * @version 2020.01.31
 */
public class Picture
{
    private Square frame;
    private Square background;
    private Triangle topHalf;
    private Circle bottomHalf;
    private Square middle;
    private Person tourist;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        frame = new Square();
        background = new Square();
        topHalf = new Triangle();  
        bottomHalf = new Circle();
        middle = new Square();
        tourist = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            frame.moveHorizontal(-30);
            frame.moveVertical(-100);
            frame.changeSize(150);
            frame.changeColor("black");
            frame.makeVisible();
            
            background.changeColor("red");
            background.moveHorizontal(-20);
            background.moveVertical(-90);
            background.changeSize(130);
            background.makeVisible();
    
            topHalf.changeSize(70, 130);
            topHalf.moveHorizontal(145);
            topHalf.moveVertical(-110);
            topHalf.makeVisible();
    
            bottomHalf.moveHorizontal(90);
            bottomHalf.changeSize(70);
            bottomHalf.makeVisible();
            
            middle.changeColor("magenta");
            middle.changeSize(25);
            middle.moveHorizontal(32);
            middle.moveVertical(-60);
            middle.makeVisible();
            
            tourist.moveHorizontal(-80);
            tourist.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        frame.changeColor("black");
        background.changeColor("white");
        topHalf.changeColor("black");
        bottomHalf.changeColor("black");
        middle.changeColor("white");
        tourist.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        frame.changeColor("black");
        background.changeColor("red");
        topHalf.changeColor("green");
        bottomHalf.changeColor("blue");
        middle.changeColor("magenta");
        tourist.changeColor("black");
    }
}
