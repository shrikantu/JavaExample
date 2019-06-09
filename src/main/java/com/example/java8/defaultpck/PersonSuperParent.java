package com.example.java8.defaultpck;

class PersonSuperParent implements Employee, Parent {
	public static void main(String args[]) {
		new PersonSuperParent().showName();
	}

	@Override
	public void showName() {
		// TODO Auto-generated method stub
		Employee.super.showName();
	}

	
}
