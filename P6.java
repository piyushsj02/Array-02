
// Find Maximum element in array -->

import java.util.Scanner;

class P6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int x = sc.nextInt();
        int arr[] = new int[x];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + "= ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            } else {
            }

        }
        System.out.println("Maximum element : " + max);
    }
}

