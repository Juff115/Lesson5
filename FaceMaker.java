import javax.swing.JOptionPane;
import processing.core.PApplet;
import g4p_controls.*;
import java.awt.Color;
import javax.swing.JColorChooser;
public class FaceMaker extends PApplet{
    Face f;
    GButton movebtn;
    GButton rsizebtn;
    GButton chbtn;
    GButton moodbtn;
    float x, y;
    
    public void setup(){
        setSize(400,400);
        background(255);
        f=new Face(this,200,200);
        movebtn=new GButton(this, 22, 20, 80, 30);
        movebtn.setText("Move Face");
        rsizebtn=new GButton(this, 119, 20, 80, 30);
        rsizebtn.setText("Resize Face");
        chbtn=new GButton(this, 217, 20, 80, 30);
        chbtn.setText("Change Color");
        moodbtn=new GButton(this, 311, 20, 80, 30);
        moodbtn.setText("Set Mood");
    }
    
    public void handleButtonEvents(GButton button, GEvent event){
        if(button==movebtn){
            //ask for new x-y loc
            x = Float.parseFloat(JOptionPane.showInputDialog(this, "Enter new x: "));
            y = Float.parseFloat(JOptionPane.showInputDialog(this, "Enter new y: "));
            //move to new loc
            f.erase();
            f.move(x, y);
        }
        else if(button==rsizebtn){
            float radius;
            radius = Float.parseFloat(JOptionPane.showInputDialog(this, "Enter new radius: "));
            f.erase();
            f.setRadius(radius);
        }
        else if(button==chbtn){
            Color color;
            color = JColorChooser.showDialog(this, "Choose Face Color", Color.red);
            f.erase();
            f.setColor(color);
        }
        else if(button==moodbtn){
            int mood;
            while(true){
                mood= Integer.parseInt(JOptionPane.showInputDialog("Enter mood, 1 is happy, 0 is sad "));
                if(mood==1 || mood==0){
                    break;
                }
            }
            f.erase();
            f.setMood(mood);
        }
    }
    public void draw(){
        f.draw();
    }
    
    public static void main(String[] args) {
        // to ask for color, color=JColorChooser.showDialog(this,"Choose Face Color"),Color.red);
        PApplet.main("FaceMaker");
    }
    
}
