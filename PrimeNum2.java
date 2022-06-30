import java.util.Scanner;

public class PrimeNum2 {

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i =2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] as){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = s.nextInt();
        if(isPrime(n)){
            System.out.println(n+" is Prime");
        }else
            System.out.println(n+" is not Prime");
    }
    
}
