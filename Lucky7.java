import hsa.*;
public class Lucky7 {

    public static void main(String[] args) {
        Console c= new Console();
        Dice d1, d2;
        d1=new Dice();
        d2=new Dice();
        int money, maxmoney;
        while (true){
            c.print("How many dollars between ($10-$10000) do you have? ");
            money=c.readInt();
            maxmoney=money;
            if (money>=10 & money<=10000)break;
            else c.println("\nInvalid amount of money, please reenter amount.\n");
        }
        int total, roll=1,broll=1;
        while (true){
            roll++;
            d1.roll();
            d2.roll();
            total=d1.getValue()+d2.getValue();
            if (total==7){
                money+=4;
            }
            else{
                money--;
            }
            if (money>maxmoney){
                maxmoney=money;
                broll=roll;
            }
            if(money<=0)break;
        }
        c.println("\nYou are broke after "+roll+" rolls.");
        c.println("\nYou should have quit after "+broll+" rolls when you had: $"+maxmoney);
        
    }
    
}
