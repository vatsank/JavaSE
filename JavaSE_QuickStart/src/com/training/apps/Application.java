package com.training.apps;

import com.training.Greet;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Greet obj =new Greet();
		
		System.out.println(obj.greet());
		
		System.out.println(obj.greet("Ramesh"));
	}

}
