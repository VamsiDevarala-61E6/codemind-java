import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n,k;
        n=v.nextInt();
        k=v.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=v.nextInt();
        }
        int c=0;
        for(int i:x)
        {
            if(i%k==0)
               c++;
        }
        System.out.println(c);
    }
}