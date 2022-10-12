import java.util.Scanner;

public class WithoutSmallestNum {
    public static void main(String[] args) {
        sumWithoutSmallest();
    }
    public static int sumWithoutSmallest(){
        Scanner in = new Scanner(System.in);
        int num[] = new int[10];
        for(int i = 0;i<10;i++){
            num[i] = in.nextInt();
        }

        int smallestnum = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0;i<10;i++)
        {
            if(num[i] < smallestnum)
                smallestnum = num[i];

            sum = sum + num[i];
        }
        sum = sum - smallestnum;
        System.out.println(sum);
        return sum;

    }
}
