import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    
    public MyWorld()
    {    
        // Create a new world with 600x 400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new man(6, "Bob" , 95, getWidth(), getHeight() ), 300, 200);
        addObject(new pizza(4, "Gianfranco Giovanni Giancarlo" , 95, getWidth(), getHeight(), 0, false ), 300, 100);
        
        
    }
}
