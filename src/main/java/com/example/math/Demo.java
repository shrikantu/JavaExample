package com.example.math;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.TreeSet;

public class Demo {
	// public static void main(String args[])
	/*
	 * { byte a[] = { 65, 66, 67, 68, 69, 70 }; byte b[] = { 71, 72, 73, 74, 75, 76
	 * }; System.arraycopy(a, 2, b, 1, a.length-3); System.out.print(new String(a) +
	 * " " + new String(b)); }
	 */
	/*
	 * public static void main(String [] args) { int j = 2, y = 3, z = 10; for (;j <
	 * 6;j++) { y = (++y + z++); System.out.println(y+z); } }
	 */
	/*public static void main(String[] args) {
		String obj = "abcdefgh";
		int length = obj.length();
		char c[] = new char[length];
		obj.getChars(0, length, c, 0);
		CharArrayReader input1 = new CharArrayReader(c);
		CharArrayReader input2 = new CharArrayReader(c, 1, 4);
		int i;
		int j;
		try {
			while ((i = input1.read()) == (j = input2.read())) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	/*static String str;
	   public void Constructor() 
	   {
	      System.out.println("In constructor");
	      str = "Hello World";
	   }
	   public static void main(String [] args)
	   {
	      Demo c = new Demo();
	      System.out.println(str);
	   }*/
	/*private Demo(int w) { // line 3
        System.out.println(w);
    }
    public static Demo() { // line 6
        System.out.println(5);
    }
    public static void main(String args[]) {
    	Demo obj = new Demo(10);
}*/
	/*static int a=20;
    int b=10;
    public static void main(String args[])
    {
        Demo t=new Demo();
        t.a=30;
        t.b=40;
        System.out.println(t.a);
        System.out.println(t.b);
    }*/
	/*public static void main(String args[]) {
        System.out.println(fun());
    }
    static int fun() {
        return 20;
    }*/
	public static void main(String args[] ) throws Exception {
        TreeSet<StringBuffer> t=new  TreeSet<StringBuffer> ();
        t.add(new StringBuffer("H"));
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("C"));
        t.add(new StringBuffer("K"));
        System.out.println(t);
}
}