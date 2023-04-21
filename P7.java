// Find Common element of array -->

import java.util.Scanner;

class P7 {
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

        System.out.println("Common Elements : ");
        for (int i = 0; i < arr1.length; i++) {
            
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){

                    System.out.println(arr1[i]);
                }
            }
        }
    }
}

