import java.util.Scanner;

public class HalfPyramidWithNo {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
// Enter the size: 4
// 1
// 12
// 123
// 1234