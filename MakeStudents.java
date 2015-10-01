import hsa.*;
public class MakeStudents {

   
    public static void main(String[] args) {
        Console c= new Console();
        Student st1= new Student();
        Student st2= new Student();
        String name;
        int score;
        while (true){
            c.print("Enter the name of the first student 2 letter minimum: ");
            name= c.readString();
            st1.setName(name);
            for (int x=1; x<=3; x++){
                c.print("Enter score " + x +" for first studnet: ");
                score= c.readInt();
                st1.setMark(x, score);
            }
            String errorm= st1.vaildateData();//check to see if its okay
            if (errorm == null)//then we have no error
                break;
            else//there is an error
                c.print(errorm);
        }
        while (true){
            c.print("Enter the name of the second student 2 letter minimum: ");
            name= c.readString();
            st2.setName(name);
            for (int x=1; x<=3; x++){
                c.print("Enter score " + x +" for second student: ");
                score= c.readInt();
                st2.setMark(x, score);
            }
            String errorm= st1.vaildateData();//check to see if its okay
            if (errorm == null)//then we have no error
                break;
            else//there is an error
                c.print(errorm);
        }
        c.println(""+st1);
        c.println(""+st2);
        if(st1.getHighScore()>=st2.getHighScore()){
            c.println(st1.getName()+" has the highest mark of: "+st1.getHighScore());
        }
        else{
            c.println(st2.getName()+" has the highest mark of: "+st2.getHighScore());        
            }     
        if(st1.getAverage()>=st2.getAverage()){
            c.println(st1.getName()+ " has the highest average of: "+st1.getAverage());    
        }
        else{
            c.println(st2.getName()+" has the highest average of: "+st2.getAverage());
        }
    }
    
}
