
/**
 * This class will give the largest product that is a palidrome by multiplying two 3 
 * digit numbers together.
 * 4/10/14
 * @author Ben Johnson
 */
public class Largest3DigitPalindromeProduct {

	public static boolean isPalindrome(int product){
		String productString = Integer.toString(product);
		int front = 0;
		int back = productString.length() -1;
		while (front < back){
			if (productString.charAt(front) == productString.charAt(back)){
				front++;
				back--;
			}else{
				return false;
			}
		}
		return true;
	}
	
	public static int largestPalindromeProduct(){
		//int num1 = 100;
		//int num2 = 100;
		//int numToIncrease = 1;
		int largest = 0;
		int product;
		for (int num1 = 100; num1 < 1000; num1++){
			for (int num2 = 100; num2 < 1000; num2++){
				product = num1*num2;
				if (isPalindrome(product)){
					if (product > largest){
						largest = product;
					}
				}
			}
		}
		
		/*while (num1 < 1000 && num2 < 1000){
			int product = num1*num2;
			System.out.println("Num1: " + num1);
			System.out.println("Num2: " + num2);
			System.out.println("Product: " + product);
			if (isPalindrome(product)){
				if (product > largest){
					largest = product;
				}
			}
			if (numToIncrease == 1){
				num1++;
				numToIncrease = 2;
			}else{
				num2++;
				numToIncrease = 1;
			}
		}*/
		
		return largest;
	}
	
	public static void main(String[] args) {
		
		if (isPalindrome(17684)){
			System.out.println("Palindrome!!");
		}else{
			System.out.println("Not a palindrome!");
		}

		System.out.println(largestPalindromeProduct());
	}

}
