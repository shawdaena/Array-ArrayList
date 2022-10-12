public class Permutation {
    public static void main(String[] args) {
        int[] array =new int[10];
        for(int i=0;i<10;i++)
        {
            array[i]=i+1;
        }

        int[] array2= new int[10];
        for(int i=0;i<10;)
        {
            int m = (int) (10 * (Math.random()));
            if (array[m] != 10000)
            {
                array2[i] = array[m];
                array[m] = 10000;
                System.out.print(array2[i]+" ");
                i++;

            }
        }
    }
}

