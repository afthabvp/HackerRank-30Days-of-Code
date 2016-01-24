import java.io.*;
import java.util.*;

public class Solution {
    void print_res(int x){
        StringBuilder bynary = new StringBuilder();
        while(x>0){
           bynary.append(x%2);
           x= x/2;
        }
        for(int j= bynary.length()-1;j>=0;j--){
           System.out.print(bynary.charAt(j));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i=0; i<n; i++){
            sol.print_res(sc.nextInt());
        }
    }
}
