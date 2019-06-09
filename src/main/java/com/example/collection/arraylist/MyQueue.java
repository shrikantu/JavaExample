package com.example.collection.arraylist;


//
//Implement Queue using an ArrayList.
//CONSTRUCTION: with no initializer
//
// ******************PUBLIC OPERATIONS*********************
// void enqueue( obj )      -- Insert obj
// Object dequeue( )      -- Return and remove least recent item
// boolean isEmpty( )     -- Return true if empty; else false


public class MyQueue {
	
	public static final int DEFAULT_SIZE=5;
	
	private Object data[];
	
	private int index;
	
	public MyQueue(){
		data=new Object[DEFAULT_SIZE];
	}
	
	public boolean isEmpty(){
		return index==0;
	}
	
	public void enqueue(Object obj) throws Exception{
		if(index==DEFAULT_SIZE-1){
			throw new Exception("Queue is full. Dequeue some objects");
		}
		this.data[index]=obj;
		this.index++;
	}
	
	public Object dequeue() throws Exception{
		if(isEmpty())throw new Exception("Queue is empty");
		Object obj=this.data[0];
		for(int i =0; i<this.index-1; i++){
			data[i]=data[i+1];
		}
		this.index--;
		return obj;
		
	}
	
	public static void main(String[] args) throws Exception {
		
		MyQueue queue = new MyQueue();
		queue.enqueue("1");
		System.out.println(queue.dequeue());
		
		queue.enqueue("2");
		queue.enqueue("3");
		queue.enqueue("4");
		System.out.println(queue.dequeue());
		
		queue.enqueue("5");
		queue.enqueue("6");
		//queue.enqueue("7");
		//queue.enqueue("8");
	}

}

