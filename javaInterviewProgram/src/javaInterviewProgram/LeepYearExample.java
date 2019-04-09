package javaInterviewProgram;

public class LeepYearExample {

	public static void main(String[] args) {

		int year = 2004;

		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))

			System.out.println(" year " + year + " is a leep year ");
		else
			System.out.println(" year " + year + " is not a leep year ");
	}

}
