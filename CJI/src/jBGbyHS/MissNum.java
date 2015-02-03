package jBGbyHS;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MissNum 
{
    public static void main(String args[] ) throws Exception 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	ArrayList<Integer> numbers = new ArrayList<Integer>();
    	Scanner in = new Scanner(System.in);
    	//args[1].split(null, ' ');
    	
    	numbers.add(in.nextInt()); 
    	
    	System.out.print(numbers.get(0));
        
    }
}