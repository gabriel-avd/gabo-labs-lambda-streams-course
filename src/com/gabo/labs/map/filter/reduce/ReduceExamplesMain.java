package com.gabo.labs.map.filter.reduce;

import com.gabo.labs.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceExamplesMain {
    public static void main(String[] args) {





        System.out.println("EXAM LOG");

        int[] arr = {4,2,0,5};
        System.out.println(find_min(arr));
    }

   static int find_min(int[] A) {
        int ans = 0;
        for (int i=1; i< A.length; i++){
            System.out.println("A[i]: "+A[i]);
            System.out.println("ans: "+ans + "\n");
            if(ans> A[i]){
                ans = A[i];
            }
        }
        return ans;
    }
}
