import java.util.*;

public class Isprime{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    sc.close();
    Boolean ans=prime(n);
     System.out.println(ans);
   }

   static boolean prime(int n){
         if(n<=1){
            System.out.println("nor");
         }
        int c=2;
         while(c*c<n){
            if(n%c==0){
                System.out.println("not prime");
            }
            c++;
            break;
         }
         if(c*c>n){
            return true;
         }
         else {
            return false;
         }
   }

}