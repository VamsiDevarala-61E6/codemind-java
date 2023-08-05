import java.util.Scanner;
public class Vamsi{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int v,k;
        v=n.nextInt();
        k=v*(v-1)/2;
        System.out.print(k);
    }
}