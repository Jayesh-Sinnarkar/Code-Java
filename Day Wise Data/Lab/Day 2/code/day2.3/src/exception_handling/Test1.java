package exception_handling;

public class Test1 {

	public static void main(String[] args) {
		int[] numbers= {10,20,30};
		System.out.println(numbers[2]);//AOBExc
		System.out.println("The parsed number "+Integer.parseInt("-12345"));//NumberFormatExc
		String s="fsdfa";
		System.out.println("chat at 0th index "+s.charAt(0));//NullPOinterExc
		int a=123;
		int b=0;
		System.out.println("res ="+(a/b));//AExc.
		System.out.println("main over....");

	}

}
