// Search Element and return its index 

import java.util.Scanner;

class P4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int x = sc.nextInt();
        int arr[] = new int[x];
        

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + "= ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search : ");
        int search=sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==search){
                System.out.println("Element found at index : "+i);
                break;
            }
            else if(i==arr.length-1){
                System.out.println("Element not in Array !");
            }
        }
        

    }
}
