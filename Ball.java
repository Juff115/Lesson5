import processing.core.*;
public class Ball {
    private PApplet pen;
    private float x, y, size;
   
   public Ball(PApplet p, float x1, float y1, float s, char c){
       pen=p;
       x=x1;
       y=y1;
       size=s;
       if (c=='g') pen.fill(0,255,0);
       else pen.fill(0,0,255);
   }
   
   public void draw(){
       pen.ellipse(x,y,size,size);
   }
}
