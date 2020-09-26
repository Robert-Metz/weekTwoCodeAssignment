package week2;

public class Loops {

	public static void main(String[] args) {
		
		
		//every even number from 0-100
		int counter = 0;
		
		while(counter <= 100) {
			counter += 1;
			if(counter%2==0) {
				System.out.println(counter);
			}
		}
		//every 3rd number backwards from 100
		
		counter = 100;
		while(counter <= 100 && counter > 1) {
			counter -= 3;
			System.out.println(counter);
			
		}
		
		
		//prints every other number from 1 to 100
		
		counter = 1;
		for (counter = 1; counter <= 100; counter+=2) {
			System.out.println(counter);
		}
		
		
		// prints 0-100 but if divisible by 3 print hello
		//if divisible by 5 print world, if both, hello world
		
		counter =1;
		
		for(counter = 0; counter<=100; counter++) {
			
			if(counter%3==0 && counter%5==0) {
				System.out.println("Hello World");
			}
			
			else if(counter%3==0 ) {
				System.out.println("Hello");
				
			}
			else if (counter%5==0) {
				System.out.println("World");
			}
			
			else {
				System.out.println(counter);
			}

			
		}
			

	}

}
