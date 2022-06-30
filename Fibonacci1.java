import java.util.Scanner;
public class Fibonacci1 {
    
    public static void main(String[] args) {
        int FibLength;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Length: ");
        FibLength = s.nextInt();
        int[] n = new int[FibLength];
        n[0] = 0;
        n[1] = 1;
        for(int i =2;i<FibLength;i++){
            n[i] = n[i-1]+n[i-2];
        }
        System.out.println("Fibonacci Series: ");

        for(int i = 0;i<FibLength;i++){
        System.out.println(n[i]+" ");
        }
    }
}
