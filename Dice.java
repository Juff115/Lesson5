
public class Dice {
    private int value;
    
    public Dice(){
        roll();
    }
    
    public int getValue(){
        return value;
    }
    
    public void roll(){
        value=(int)(Math.random()*6)+1;
    }
}
