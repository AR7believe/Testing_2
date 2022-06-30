import java.util.Scanner;
public class Fact {
    static int fact(int n){
        if(n==0)
            return 1;
        else
            return (n*fact(n-1));
    }
    public static void main(String[] args) {
        int i , fact =1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = s.nextInt();
        fact = fact(n);
        System.out.println("Factorial of "+n+"is: "+fact);
    }
    
}
