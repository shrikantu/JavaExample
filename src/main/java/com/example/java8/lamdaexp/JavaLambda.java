package com.example.java8.lamdaexp;

/**
 * 
 * n -> System.out.println("Hello World " + n);
 * 
 * The element to the left of the arrow(->) are the parameters of the lambda. In
 * this case the input parameter is defined as- n. It can have receive zero, one
 * or more parameters. i.e ( ) -> { perform function } or (n)-> { perform
 * function } or (m,n )-> { perform function } and so on. To the right of the
 * arrow(->) we have the lambda body. This is where the actual logic is written.
 * The logic for the above lambda function is to print the message along with
 * the passed parameter.
 * 
 * Advantages of Lambda functions
 * 
 * Until Java 8 lists and sets were typically processed by client code obtaining
 * an iterator from the collection, then using that to iterate over its elements
 * and process each in turn. If the processing of different elements is to
 * proceed in parallel, it was the responsibility of the client code, not the
 * collection, to organise this. Java 8 makes it easier to distribute processing
 * of collections over multiple threads. Collections can now organise their own
 * iteration internally, transferring responsibility for parallelisation from
 * client code into library code. Fewer lines of code. As explained above the
 * user has to only declare what is to be done in a declarative way. n ->
 * System.out.println("Hello World " + n); So user has to type reduced amount of
 * code. Using Java 8 Lambda expressions higher efficiency can be achieved.
 * Using CPUs with multicores, user can take advantage of the multicore CPU’s by
 * parallel processing of collections using lambda.
 * 
 * @author Shrikant
 *
 */
public class JavaLambda {

	public static void main(String[] args) {

		Greetings greetingsInstance = n -> System.out.println("Hello World " + n);
		greet(greetingsInstance, "Tom");
	}

	private static void greet(Greetings greetingsInstance, String name) {
		greetingsInstance.sayHello(name);
	}

}
