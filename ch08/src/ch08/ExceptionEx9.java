package ch08;

class ExceptionEx9 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시킴.");
			throw e;
			//throw new Exception("고의로 발생시킴."); 위의 두 줄을 한 줄로 줄여 쓸 수 있다.
		} catch (Exception e) {
			System.out.println("에러메시지:"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 종료.");
	}

}
