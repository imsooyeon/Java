package practice;

class Exercise3_8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		char ch = 'A';
		ch = (char)(ch + 2); //65+2=67 -> C
		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000l;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d!=f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
/*c=30
ch=C
f=1.5
l=27000000000
result=true*/
}