import java.util.Scanner;
class PrimeNum{
     public static void main(String[] args) {
      
    Scanner s = new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        int n = s.nextInt();
        for(int i = 1;i<10;i++){
            if(i%2==0){
                System.out.println(i+" Number is not Prime ");
            }
            else
                System.out.println(i+" Number is Prime ");
        }
     }
}