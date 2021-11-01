import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pizza extends Actor
{
    private int speed;
    private String name;
    private int turnAmount;
    private int width;
    private int height;
    private int collisionCount;
    private boolean collision; 
    
    public pizza () {
        this.speed = 0;
        this.name=null;
        this.turnAmount=turnAmount;
        this.width=0;
        this.height=0;
        this.collisionCount=0;
        this.collision=false;
        
        
        
    }
    public pizza( int speed, String name, int turnAmount, int width, int height, int collisionCount, boolean collision) {
        this.speed=speed;
        this.name=name;
        this.turnAmount=turnAmount;
        this.width=width;
        this.height=height;
        this.collisionCount=collisionCount;
        this.collision=collision;
      
        
        
    }
    public void act() 
    {
        
        move(this.speed);
        if (isAtEdge()){
            
            turn(this.turnAmount);
        }
        
        if (isTouching(man.class)) {
            collisionCount++;
            System.out.println("COLLIDED: " +collisionCount); 
        }
        getWorld().showText(this.toString() , +(this.width/2 -150), +(this.height/2));
    }    
    public String toString() {
        
     return  "Name: \n " +this.name+ " \n X: " +this.getX()+ " Y: " +this.getY();
    }
}
