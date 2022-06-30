import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    static boolean isArmstrong(int n){
        int temp,digit=0,last=0,sum=0;
        temp=n;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        temp=n;
        while(temp>0){
            last=temp%10;
            sum+=(Math.pow(last,digit));
            temp=temp/10;
        }
        if(n==sum){
            return true;
        }else 
            return false;
    }
    public static void main(String[] args){
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Limit: ");
        num = s.nextInt();
        for(int i=0;i<=num;i++){
            if(isArmstrong(i))
                System.out.println(i+" ");
        }

    }   
}
