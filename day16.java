import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int cur = Integer.MAX_VALUE;
       
        List<Integer> res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArray = new int[n];
        
        for(int i=0;i<n;i++){
            nArray[i] = sc.nextInt();
            
        }
        
         Arrays.sort(nArray);
        
        for(int i=0;i<nArray.length-2;i++){
            
            cur = Math.abs(nArray[i] - nArray[i+1]);
            
            if(cur <= min){
                
                if(cur < min){
                    res.clear();
                }
                res.add(nArray[i]);
                res.add(nArray[i+1]);
                min = cur;
            }

        }
        
        for(int pairs: res){
            System.out.print(pairs+" ");
        }
        
        
    }
}
