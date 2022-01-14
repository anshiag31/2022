import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        int i;
        try {
            for (i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[i] = 0;
            for (i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println("Invalid index");
        }
    }
}
