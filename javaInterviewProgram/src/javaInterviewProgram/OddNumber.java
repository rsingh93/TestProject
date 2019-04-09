package javaInterviewProgram;

public class OddNumber {

	public static void main(String[] args) {
		
		int limit = 50;
		System.out.println("printing the odd number between 1 to "+ limit);
		
		for(int i = 1;i <= limit;i++){
			
			if(i % 2 != 0){
				System.out.println(i);
			}
		}

	}

}
