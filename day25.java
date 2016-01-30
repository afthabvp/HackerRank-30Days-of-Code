import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isPrime(int num){
        if(num == 1)
            return false;
        else if(num ==2)
            return true;
      if ( num > 2 && num%2 == 0 ) {
        return false;
    }
    int top = (int)Math.sqrt(num) + 1;
    for(int i = 3; i < top; i+=2){
        if(num % i == 0){
            return false;
        }
    } 
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            boolean isprime = isPrime(sc.nextInt());
            if(isprime)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
                
        }
    }
}
