import java.util.*;

class P10 {
    static int add(int x) {
        int sum = 0;
        while (x != 0) {
            int rem = x % 10;
            sum = sum + rem;
            x = x / 10;
        }
        return sum;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("element " + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (add(arr[i]) % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}