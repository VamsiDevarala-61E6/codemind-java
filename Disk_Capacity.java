import java.util.Scanner;
public class Vamsi{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int s,t,b;
        s=v.nextInt();
        t=v.nextInt();
        b=v.nextInt();
        System.out.print(s*t*b*512*2);
    }
}