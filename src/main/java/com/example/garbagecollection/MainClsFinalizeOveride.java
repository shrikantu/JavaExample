package com.example.garbagecollection;

class A4
{
    int i;
 
    public A4(int i)
    {
        this.i = i;
    }
 
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method, i = "+i);
 
        //Calling super class finalize() method explicitly
 
        super.finalize();
    }
}
 
public class MainClsFinalizeOveride
{
   public static void main(String[] args)
   {
       //Creating two instances of class A
 
       A4 a1 = new A4(10);
 
       A4 a2 = new A4(20);      
 
       //Calling finalize() method of a1 before it is abandoned
       try
       {
           a1.finalize();
       }
       catch (Throwable e)
       {
           e.printStackTrace();
       }
 
       //Assigning a2 to a1
 
       a1 = a2;
 
       //Now both a1 and a2 will be pointing same object 
 
       //An object earlier referred by a1 will become abandoned
 
       System.out.println("done");
   }
}