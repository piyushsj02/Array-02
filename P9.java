
// Find minimum element of array -->

import java.util.Scanner;

class P9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of First Array");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("element " + (i + 1) + "= ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter Size of Second Array");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];

        for (int i = 0; i < arr2.length; i++) {
            System.out.print("element " + (i + 1) + "= ");
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[size1 + size2];
        int x=0;
        for (int i = 0; i < arr3.length; i++) {
            if(x<arr1.length){              
                arr3[i]=arr1[i];                // 1st array in new merged
            }
            else if(x>=arr1.length){
                arr3[i]=arr2[i-arr1.length];    // 2nd array in new merged
            }
            x++;
        }
        System.out.print("Merged Array = [ ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println("]");

    }
}
