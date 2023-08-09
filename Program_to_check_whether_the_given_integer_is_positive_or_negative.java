import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n;
        n=v.nextInt();
        if (n>0)
          System.out.print("Positive Number");
        else
           System.out.print("Negative Number");
    }
}