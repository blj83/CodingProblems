
public class SmallestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2520;
		while (true){
			if (num % 20 == 0 && num % 19 ==0 && num % 17 ==0){
				if (num % 18 == 0 && num % 16 ==0 && num % 15 ==0 && num % 14 == 0 && num % 13 ==0 && num % 12 ==0 && num % 11 ==0){
					break;
				}
			}
			num++;
		}
		System.out.println(num);
	}

}
