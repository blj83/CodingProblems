
public class EvenFib {
	public static void main(String[] args) {
		int evenSum = 0;
		int fibOne = 1;
		int fibTwo = 2;
		
		while (fibOne < 4000000){
			System.out.println(fibOne);
			if (fibOne%2 == 0){
				evenSum = evenSum + fibOne;
			}
			int temp = fibOne + fibTwo;
			fibOne = fibTwo;
			fibTwo = temp;
		}
		System.out.println(evenSum);

	}
}
