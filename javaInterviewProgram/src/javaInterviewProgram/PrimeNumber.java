package javaInterviewProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int limit = 100;
		
		System.out.println("prime number is between 1 and"+limit);
		
		for(int i =1;i<limit;i++){
		
			boolean isprime = true;
			
		for(int j = 2;j<i;j++){
			
		if(i%j==0){
			isprime = false;
			break;
		}
		
		}
         
		if(isprime)
		System.out.println(i+"  ");
				
			}
		}
			
	}


