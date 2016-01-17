import java.io.*;
import java.util.*;

public class Solution {

	void print_res(int n){

		for(int i=0;i<n;i++){
			String res="";
			for(int j=0;j<n-i-1;j++){
				res += " ";
			}
			for(int k=0;k<i+1;k++){
				res += "#";
			}
			System.out.println(res);
		}

	}

	public static void main(String[] args) {

		Solution sol = new Solution();
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			sol.print_res(N);
		}catch(IOException io){
			io.printStackTrace();
		} 

	}
}
