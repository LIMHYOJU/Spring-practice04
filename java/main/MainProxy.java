package main;

import springTest.ExeTimeCalculator;
import springTest.ImpeCalculator;
import springTest.RecCalculator;

public class MainProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExeTimeCalculator ttcal1 = new ExeTimeCalculator(new ImpeCalculator());
		System.out.println(ttcal1.factorial(20));
		ExeTimeCalculator ttcal2 = new ExeTimeCalculator(new RecCalculator());
		System.out.println(ttcal2.factorial(20));
	}

}
