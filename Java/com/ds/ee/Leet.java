package com.ds.ee;

public class Leet {

    public static void main(String [] args){


        String s = longestPalindrome("xabbay");
        System.out.println(s);

    }

    public static void printMatrix(int[][] m){
        for(int i = 0; i < m.length; i++){
            int[] mm = m[i];
            for(int j = 0; j < mm.length; j++)
                System.out.print(mm[j] + ", ");
            System.out.println("");
        }
    }

    //TODO: debug case 
    public static String longestPalindrome(String s){
        int n = s.length();
        int[][] mat = new int[n][n];
        int max = 1;
        int start = 0;
        int end = 0;

        int i = 0;
        while(i < n){
            mat[i][i] = 1;
            i += 1;
        }

        i = 0;
        int j = 1;
        while(i < (n-1) && j < n){
            int k = i;
            int l = j;
            while(k < n-j && l < n){
                if(s.charAt(k) == s.charAt(l)){
                    mat[k][l] = 2 + mat[k+1][l-1];
                    if(max < mat[k][l]){
                        max = mat[k][l];
                        start = k;
                        end = l;
                    }
                }
                else{
                    mat[k][l] = 0;
                }
                k += 1;
                l += 1;
            }
            //i += 1;
            j += 1;
        }


        //printMatrix(mat);
        return s.substring(start, end+1);

    }
    
}
