import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n;
        n=v.nextInt();
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        
    }
}