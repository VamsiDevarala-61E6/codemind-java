import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n;
        n=v.nextInt();
        System.out.println(odd(n));
    }
    public static int odd(int n)
    {
        if(n%2!=0)
           return 2;
        else
           return 1;
    }
}