import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int[] a=new int[5];
        Scanner scan=new Scanner(System.in);
        System.out.println("enter");
        for(int i=0;i<5;i++)
        {
            a[i]=scan.nextInt();

        }
        Arrays.sort(a);
        System.out.println("the sorted array");
        for (int j=0;j<5;j++)
        {
            System.out.println(a[j]);
        }
    }
}
