import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n = v.nextInt();
        int[] x = new int[n];
        for(int i = 0;i<n;i++)
        {
            x[i]=v.nextInt();
        }
        Arrays.sort(x);
        System.out.println(x[n-1]);
    }
}