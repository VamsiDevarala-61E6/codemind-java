import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n;
        n=v.nextInt();
        if(n==1)
          System.out.println(0);
        else if(n==2)
           System.out.println(1);
        else
           System.out.println(2);
    }
}