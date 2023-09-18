import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n = v.nextInt();
        int[] x = new int[n];
        for(int i = 0;i<n;i++)
        {
            x[i]=v.nextInt();
        }
        int c=0;
        for(int i=0;i<n-2;i++)
        {
            if(x[i]%2==0 && x[i+1]%2!=0 && x[i+2]%2==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}