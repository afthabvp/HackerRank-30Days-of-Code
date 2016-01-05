import java.io.*;
import java.util.*;

public class Solution {
    
    void out(int a,int b,int N){
        int sum = a;
        for(int j=0;j<N;j++){
            sum +=(int)Math.pow(2, j)*b;
            System.out.print(sum+" ");
            
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
       try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
              String [] input = br.readLine().split(" ");
              sol.out(Integer.parseInt(input[0]),Integer.parseInt(input[1]),Integer.parseInt(input[2]));
             }
           }catch(IOException io){
            io.printStackTrace();
          } 
        
}
}