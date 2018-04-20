import java.util.Arrays;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input the table size : ");
        int size = scanner.nextInt();

        int[][] table = new int[size][size];
        int i = 0; int j = 0;
        int count = 1;
        while (count <= (Math.pow(size,2))) {
            System.out.println(count);

            table[i][j] = count;

            if (j == 0 || i==size-1) {
                if (j == 0 && i != size-1) {
                    j = i+1;
                    i = 0;
                }  else {
                    i = j + 1;
                    j = size-1;
                }
            }
             else {
                i++;
                j--;
            }
            count++;
        }

        for (int[] printArray : table) {
            for (int intValue : printArray) {
                System.out.print(intValue);
                if (intValue < 10) {
                    System.out.print("\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }

    }
}


