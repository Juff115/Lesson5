import java.awt.Color;
import processing.core.PApplet;

public class Face {
    private float xPos, yPos, radius;
    private Color color;
    private PApplet pen;
    private boolean happy;
    
    public Face(PApplet p, float x, float y){
        xPos= x;
        yPos= y;
        radius = 100;
        color = Color.RED;
        pen=p;
        happy=true;
    }
    
    public void draw(){
        pen.stroke(0);//black outline
        pen.fill(color.getRed(),color.getGreen(),color.getBlue());//head color
        drawCircle(xPos, yPos, radius, radius);
        //yellow eyes
        pen.fill(255,255,0);
        drawCircle(xPos-radius/5, yPos-radius/5, radius/4, radius/4);
        drawCircle(xPos+radius/5, yPos-radius/5, radius/4, radius/4);
        //mouth
        if (happy){
            drawLine(xPos-.2*radius, yPos+.3*radius, xPos+.20*radius, yPos+.3*radius);
            drawLine(xPos-.2*radius, yPos+.3*radius, xPos-.25*radius, yPos+.2*radius);
            drawLine(xPos+.2*radius, yPos+.3*radius, xPos+.25*radius, yPos+.2*radius);
        }
        else if(happy==false){
            drawLine(xPos-.2*radius, yPos+.3*radius, xPos+.20*radius, yPos+.3*radius);
            drawLine(xPos-.2*radius, yPos+.3*radius, xPos-.25*radius, yPos+.4*radius);
            drawLine(xPos+.2*radius, yPos+.3*radius, xPos+.25*radius, yPos+.4*radius);
        }
    }
    
    public void move(float x, float y){
        xPos=x;
        yPos=y;
    }
    
    public void setRadius(float r){
        radius=r;
    }
    
    public void setMood(int m){
        if  (m==1){
            happy=true;
        }
        else if (m==0){
            happy=false;
        }
    }
    
    public void setColor(Color c){
        color=c;
    }
    //provate helper methods
    private void drawCircle(float x, float y, float wid, float ht){
        pen.ellipse(x, y, wid, ht);
    }
    
    private void drawLine(double x1, double y1, double x2, double y2){
        pen.line((float)x1, (float)y1 , (float)x2, (float)y2);
    }
     
    public void erase(){
        pen.fill(255);
        pen.noStroke();
        pen.ellipse(xPos, yPos, radius+5, radius+5);
    } 
}
