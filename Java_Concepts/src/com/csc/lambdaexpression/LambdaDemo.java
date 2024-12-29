package com.csc.lambdaexpression;

public class LambdaDemo {

	public static void main(String[] args) {
		//Sample s = new SampleClass();
		
		//anonymous  class
		Sample s1 = new Sample() {

			@Override
			public void show() {
				System.out.println("Anonymous class");
				
			}
			
		};
		s1.show();
		
		Sample s2 = () -> System.out.println("Lambda excpression");
		
		s2.show();
				
			System.out.println("Adding a new line");
		

		
	}

}
