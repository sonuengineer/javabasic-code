public class PrimeOrNot {

	public static void main(String[] args) {
		int num = 37, count = 0;
		for (int i=1; i <= num; i++) {
			if (num % i == 0) {
				count = count + 1;
			}
			
		}
		    if(count == 2) {
		    	System.out.println("Prime number");
		    } else {
		    	System.out.println("Not a Prime");
		    }
		    

	}

}
