import java.util.*;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int size = sc.nextInt();
        int temp;
        int min;
        int[] a = new int[size];
        System.out.print("enter the elements:\n");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;

        }
        sc.close();
        System.out.print("array is :");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]);
        }
    }
}
