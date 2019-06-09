package com.example.garbagecollection;

class A3
{
    int i = 50;
 
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method");
    }
}
 
public class MainClsFinalize
{
   public static void main(String[] args)
   {
      //Creating two instances of class A
 
      A3 a1 = new A3();
 
      A3 a2 = new A3();
 
      //Assigning a2 to a1
 
      a1 = a2;
      a2=null;
      a1=null;
 
      //Now both a1 and a2 will be pointing to same object 
 
      //An object earlier referred by a1 will become abandoned
 
      System.out.println("done");
   }
}