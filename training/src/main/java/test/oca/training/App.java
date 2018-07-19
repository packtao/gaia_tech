package test.oca.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	static void add(int a, int b){
		a=a+b;		
	}
	
	static void add(String a, String b){
		a=a+b+"test modif master";		
	}
	
    public static void main( String[] args )
    {
    	int p=15;
    	int q=10;
    	add(p, q);
    	
    	String str1 = "abc";
    	String str2 = "def";
    	add(str1, str2);
    	
    	System.out.println(p);
    	System.out.println(str1);
    	
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(4);
    	int[] l = {1,5,2,7,7};
    	System.out.println(l);
    }
}
