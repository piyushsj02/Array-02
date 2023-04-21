import java.util.Scanner;

class P2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int x = sc.nextInt();
        int arr[] = new int[x];
        int countEven=0;
        int countOdd=0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + "= ");
            arr[i] = sc.nextInt();
            if(arr[i]%2!=0){
                countOdd++;
            }
            else{
                countEven++;
            }

        }
        System.out.println("Number of Even elements = " + countEven);
        System.out.println("Number of Odd elements = " + countOdd);

    }
}
