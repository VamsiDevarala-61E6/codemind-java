import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        Double n=v.nextDouble();
        Double p=(n*1.8)+32;
        System.out.printf("%.2f",p);
    }
}