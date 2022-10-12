import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] arg){
        Random random = new Random();
        //Scanner in = new Scanner(System.in);
        int a[] = new int [10];

        for(int i = 0;i<a.length;i++){
            //a[i] = in.nextInt();
            a[i] = random.nextInt(50);
            System.out.println(a[i]);
        }
        System.out.println("Even index num: ");
        for(int i = 0;i<a.length;i++){
            if(i%2 == 0)
            {
                System.out.println(i);
            }
        }
        System.out.println("Even element :");
        for(int i = 0;i<a.length;i++){
            if(a[i]%2 == 0){
                System.out.println(a[i]);
            }
        }
        System.out.println("First element :" +a[0]);
        System.out.println("Last element :" +a[a.length - 1]);

        System.out.println("Reverse number: ");
        for(int i = a.length - 1;i>=0;i--){
            System.out.println(a[i]);
        }

    }
}
