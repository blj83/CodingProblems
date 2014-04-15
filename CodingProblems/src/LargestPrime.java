
public class LargestPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find all the prime numbers in rang
		//Check to see if they are a multiple
		long largest = 0;
		//BigInteger num = new BigInteger( "600851475143");
		long num;
		num =600851475143L;
		long i, j;
		for (i=1; i < num;i++){
			if (i != 1){
				for(j = 2; j <= i; j++){
					if (j == i){
						//System.out.println("yes");
						if (num%j == 0){
							largest = j;
							System.out.println(largest);
						}
					}else if(i%j == 0){
						//System.out.println("j = " + j + "Not prime");
						break;
					}
				}
			}
		}
		
	}

}
