package com.myDemo.Sample;

import java.io.*;
import java.util.*;

public class TestClassExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());

            String out_ = Solve(N);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static String Solve(int N){
        // Write your code here
        //return String.valueOf(N);
    	if(N%2==0){
            return "YES";
            }
            else
            {
            return "NO";
            }
    }
}