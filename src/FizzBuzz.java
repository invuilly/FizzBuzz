
public class FizzBuzz {
	public static void main(String[]argn) {
		for(int i = 1; i <= 0; i ++) {
			if (i % 3 == 0) {
				System.out.println("Fizz");
				
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
				
			}else  if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}else {
				System.out.println(i);
			}
		}
	}

}
