package com.pemula;

import java.io.*;
import java.util.*;

public class day9_java_End_of_file {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named 
Solution. */
Scanner sc = new Scanner(System.in);
int k = 1;
while(sc.hasNext()){//Deteksi EOF
    String s = sc.nextLine();
    System.out.println(k+" "+s);
    k++;
}
}
}

    

