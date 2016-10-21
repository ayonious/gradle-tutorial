package prog;

import java.util.Scanner;

import libs.Libs;

public class Main {
	public static void main(String[] args) {
		Libs libs= new Libs();
		int input_val = 1;
		System.out.println("firstoutput: " + libs.add(1, input_val));
		System.out.println("secondoutput: " + libs.add(2, input_val));
		System.out.println("thirdoutput: " + libs.add(3, input_val));
	}
}
