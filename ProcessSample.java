import processing.core.*;
import g4p_controls.*;
public class ProcessSample extends PApplet {
    
    GButton btnblue, btngreen;
    Ball b;
    
    public void setup(){
        size(640,480);
        btnblue= new GButton(this,10,10,100,30);
        btngreen= new GButton(this,200,10,100,30);
        btnblue.setText("Blue Circle");
        btngreen.setText("Green Circle");
        b= new Ball(this,(float)Math.random()*600,(float)Math.random()*400,(float)Math.random()*100,'b');
        //randomize background
        //background((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
    }
    
    public void handleButtonEvents(GButton button, GEvent event) {
        if(button ==btnblue){
            b= new Ball(this,(float)Math.random()*600,(float)Math.random()*400,(float)Math.random()*100,'b'); 
        }
        if(button==btngreen){
            b= new Ball(this,(float)Math.random()*600,(float)Math.random()*400,(float)Math.random()*100,'g');
        }
    }
    
    public void draw(){
        //flashing color
        //background((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        b.draw();
    }
    
    public static void main(String[] args) {
        PApplet.main("ProcessSample");
    }
    
}
