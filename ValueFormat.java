import java.util.*;
import java.lang.Math;
public class ValueFormat {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        System.out.println("Small Integer not greater than the number:"+Math.ceil(num));
        System.out.println("Given number:"+num);
        System.out.println("Largest Integer not greater than the number:"+Math.floor(num));
        RandomDemo s=new RandomDemo();
        s.display();
    }
}
class RandomDemo{
    public void display(){
    for(int i=0;i<5;i++)
    {
        System.out.println(((int)Math.random()*100));
    }
}
}
