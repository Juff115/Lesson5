
public class Student {
    //first step define properties of student
    //these are private they are instance variables
    private String name;
    private int mark1, mark2, mark3;
    //second step-construction method
    //called when the word new is used somewhere
    //creates the object and initializes properites
    public Student(){
        this("Unkown",0,0,0);
//        name="Unkown";
//        mark1=0;
//        mark2=0;
//        mark3=0;
        //this will allow Student s = new Student();
    }
    
    //over loading constructor
    public Student(String n,int a, int b, int c ){
        name=n;
        mark1=a;
        mark2=b;
        mark3=c;         
    }
    
    public Student(Student other){
        this(other.name,other.mark1,other.mark2,other.mark3);
//        name=other.getName();
//        mark1=other.getMark(1);
//        mark2=other.getMark(2);
//        mark3=other.getMark(3);
        
    }
    //third step define all abilties of student
    //these are public instance methods
    public void setName(String n){
        name=n;
        //this will allow s.setName("Joe");
    }
    
    public String getName(){
        return name;
        //this will allow: System.out.print(s.getName());
    }
    
    public void setMark(int which, int score){
        if (which==1) mark1=score;
        else if(which==2) mark2=score;
        else mark3=score;
        //this will allow: s.setMark(2, 75);
        //or s.setMark(1, 90);
    }
    
    public int getMark(int which){
        if (which==1) return mark1;
        else if (which==2) return mark2;
        else return mark3;
        //this will allow:
        //c.print("The first mark is " + s.getMark(1));
       
    }
    
    public int getAverage(){
        return (mark1+mark2+mark3)/3;
        //c.print("Average is" + s.getAverage());
    }
    
    public int getHighScore(){
        int highest=mark1;
        highest=Math.max(highest, mark2);
        highest=Math.max(highest, mark3);
        return highest;
    }
    
    public String toString(){
        //called by default when you PRINT an object
        //example c.print(s);
        String str="Name:\t" + name;
        str+="\nMark 1:\t" + mark1;
        str+="\nMark 2:\t" + mark2;
        str+="\nMark 3:\t" + mark3;
        str+="\nAverage: " + getAverage();
        return str;
    }
    
    public String vaildateData(){
        String em=null;
        if (name.length()<=1) //then a name was not entered
            em="\nName is required.";
        if (mark1<0 || mark1>100 || mark2<0 || mark2>100 ||mark3<0 || mark3>100)
            if (em == null) //then there has been no error yet
                em = "\nAt least 1 mark is out of the acceptable range";
            else //add on to message
                em += "\nAt least 1 mark is out of the acceptable range";
        if (em != null) //then we have an error so add the following line after it
            em += "\nPlease re-enter all the data\n\n";
        return em; //return the error message, either as null, or with a real message
    }
    
}
