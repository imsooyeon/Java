package exercise;
//int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성
class Exercise4_10 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		for(;num>0;) {
			sum += num%10;
			num /= 10;
		}
		
		System.out.println("sum="+sum);
	}

}
