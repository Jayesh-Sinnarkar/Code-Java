package printers;

public class Test1 {

	public static void main(String[] args) {
		ConsolePrinter printer=new ConsolePrinter();
		printer.print("some mesg!");
		NetworkPrinter printer2=new NetworkPrinter();
		printer2.print("another mesg");

	}

}
