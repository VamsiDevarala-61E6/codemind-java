import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        Double f=v.nextDouble();
        Double p=(f-32)/1.8;
        System.out.printf("%.2f",p);
    }
}