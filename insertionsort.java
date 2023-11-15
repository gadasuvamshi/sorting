import java.util.*;

public class insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int temp;
        // int current;
        System.out.print("enter the size of the array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.print("enter the elements:\n");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < size; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > current) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = current;

        }

        sc.close();
        System.out.print("array is:");
        for (int i = 0; i < size; ++i) {
            System.out.print(a[i]);
        }

    }
}
