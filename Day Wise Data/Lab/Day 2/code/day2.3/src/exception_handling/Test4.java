package exception_handling;

public class Test4 {

	public static void main(String[] args) {
		try {
			int[] numbers = { 10, 20, 30 };
			System.out.println(numbers[0]);// AOBExc
			System.out.println("The parsed number " + Integer.parseInt("-345"));// NumberFormatExc
			String s =null;
			System.out.println("chat at 0th index " + s.charAt(0));// NullPOinterExc
			int a = 123;
			int b = 0;
			System.out.println("res =" + (a / b));// AExc.
			System.out.println("end of try....");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("1");
		} catch (NumberFormatException e) {
			System.out.println("2");
		}
//		 catch (NumberFormatException  e) {
//			System.out.println("3");
//		}
		catch (Exception e) {
			System.out.println("in catch-all");
			System.out.println("error mesg "+e.getMessage());
			System.out.println("toString "+e);
			System.out.println("printing stack trace");
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
