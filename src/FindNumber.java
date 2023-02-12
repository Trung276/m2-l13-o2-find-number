import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        int length = scanner.nextInt();
        int [] array = new int [length];

        int i = 0;
        while (i != length) {
            System.out.println("Nhap phan tu thu " + i);
            int number = scanner.nextInt();
            array[i] = number;
            i ++;
        }
        System.out.println("Mang nhap vao:");
        for(int e: array) {
            System.out.printf(e + " ");
        }

       Arrays.sort(array);
        System.out.println("\nMang sau khi xep:");
        for(int e: array) {
            System.out.printf(e + " ");
        }

        System.out.println("\nNhap gia tri can tim: ");
        int value = scanner.nextInt();
        int index = binarySearch(array, 0, array.length, value);
        if(index == -1) {
            System.out.println("Khong co gia tri");
        } else {
            System.out.println("Gia tri "+ value +  " tai vi tri thu " + index + " trong mang");
        }


    }
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            }
            if (array[middle] > value) {
                return binarySearch(array, left, middle - 1, value);
            }
            return binarySearch(array, middle + 1, right, value);
        }
        return -1;
    }
}