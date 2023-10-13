import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int t=n,r=0;
        while(n!=0){
            r=r*10+n%10;
            n=n/10;
        }
        if(r==t)
          System.out.println("True");
        else
          System.out.println("False");
    }
}