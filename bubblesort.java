import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        int temp;
        System.out.print("enter the elements:\n");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        sc.close();
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

    }

}