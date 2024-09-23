import java.util.Scanner;

public class Inputs {
    public  int [] array(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int var=sc.nextInt();
        System.out.println("Enter the array values:");
        int[] arr=new int[var];
        for(int i=0;i<var;i++){
            arr[i]=sc.nextInt();
        }
        return  arr;
    }
}
