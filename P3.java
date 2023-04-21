// Sum of Even & Odd numbers in Array

import java.util.Scanner;

class P3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int x = sc.nextInt();
        int arr[] = new int[x];
        int sumEven=0;
        int sumOdd=0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + "= ");
            arr[i] = sc.nextInt();
            if(arr[i]%2!=0){
                sumOdd=sumOdd+arr[i];
            }
            else{
                sumEven=sumEven+arr[i];
            }

        }
        System.out.println("Odd numbeers sum = " + sumOdd);
        System.out.println("Even numbers sum = " + sumEven);
        

    }
}
