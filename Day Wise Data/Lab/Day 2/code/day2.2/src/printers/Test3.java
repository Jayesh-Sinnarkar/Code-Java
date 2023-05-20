package printers;

public class Test3 {

	public static void main(String[] args) {
		Printer p;// p:i/f type of ref , local var =>main thrd's stack --stack frame : main method
		//p=new Printer(); i/f CAN'T be instantiated!
		p=new ConsolePrinter();// indirect ref , up casting , ConsolePrinter IS-A Printer , implements
		p.print("mesg1");//run time poly
		p=new FilePrinter();//up casting 
		p.print("mesg2");//run time poly.
	}

}
