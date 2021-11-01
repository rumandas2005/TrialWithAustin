import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class man extends Actor
{
    private int speed;
    private String name;
    private int turnAmount;
    private int width;
    private int height;
    public man () {
        this.speed=0;
        this.name=null;
        this.turnAmount=0;
        this.width=0;
        this.height=0;
        
    }
    public man(int speed, String name, int turnAmount, int width, int height) {
        this.speed=speed;
        this.name=name;
        this.turnAmount=turnAmount;
        this.width=width;
        this.height=height;
        
    }
    public void act() 
    {
        move(6);
        //
        if(isAtEdge()) {
            turn(this.turnAmount);
            
            
        }
        getWorld().showText(this.toString() , +(this.width/2 +150), +(this.height/2));
    }    
    
    public String toString() {
        
       return " Name: " +this.name+ " \n Speed: " +this.speed+ " \n TurnAmount: " +this.turnAmount+ " \n X: " +this.getX()+ " Y: " +this.getY();
    }
}
