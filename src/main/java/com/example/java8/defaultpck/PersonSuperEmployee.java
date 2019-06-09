package com.example.java8.defaultpck;

/**
 * 
 * What are Default Method?
 * 
 * Default methods are the method defined in the interfaces with method body and
 * using the default keyword. Thus we can add instance methods to the
 * interfaces. Default method can call methods from the interfaces they are
 * enclosed in. Also in default method, this keyword refers to the declaring
 * interface.
 * 
 * Need for Default Method-
 * 
 * With Java 8, lambda expressions were introduced. So in existing Interfaces
 * like Iterator interface, new methods were needed to be added like
 * Spliterator<T> spliterator(). If this was done, then the code written in
 * previous versions of java would break when they start using Java 8 because
 * their interface implementation would not have these new methods. So for
 * backward compatibility and allowing code written in previous versions to make
 * use of Lambda expressions. So with default methods it is possible to evolve
 * interfaces more easily.
 * 
 * Some key points when using default method-
 * 
 * Default methods can have access specified as public only. They cannot be
 * declared as protected or private. 
 * Also since all interfaces are public by
 * default, declaring the default methods as public explicitly is not required.
 * 
 * Default methods cannot be abstract and should always have the method body.
 * The class implementing the Interface having default method can override it.
 * 
 * Default methods cannot be Final or Synchronized. Static methods can never be
 * default methods. Default methods are always instance methods.
 * 
 * Rules for defining multiple default methods-
 * 
 * When defining multiple interfaces having same default method name, we may
 * come accross the diamond problem.Lets look at such a scenario and how to
 * resolve it.
 * 
 * @author Shrikant
 *
 */
class PersonSuperEmployee implements Employee, Parent {
	public static void main(String args[]) {
		new PersonSuperEmployee().showName();
	}

	@Override
	public void showName() {
		// TODO Auto-generated method stub
		Parent.super.showName();
	}

}
