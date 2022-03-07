import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrome = true;
        for(int i=0;i<1+A.length()/2;i++){
            if(!A.substring(i,i+1).equals(A.substring(A.length()-1-i,A.length()-i))){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
