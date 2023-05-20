package printers;

public class Test4 {

	public static void main(String[] args) {
		// store all the printers : array
		Printer[] printers = { new FilePrinter(), new ConsolePrinter(), new NetworkPrinter() };// how many objs ? 4 , 1:
																								// array of i/f type of
																								// refs , 3 printers
		System.out.println("name of the class loaded for the array " + printers.getClass());// [Lprinters.Printer
		// Can you print a mesg on all 3 printers in a loop ? YES
		for (Printer p : printers)// p=printers[0]....
		{
			if (p instanceof FilePrinter) {
				FilePrinter fp = ((FilePrinter) p);
				fp.openFile();
				p.print("some mesg!!!!");// run time poly.
				fp.closeFile();

			} else if (p instanceof NetworkPrinter) {
				NetworkPrinter np = ((NetworkPrinter) p);
				np.openConnection();
				p.print("some other mesg");
				np.CloseConnection();
			} else
				p.print("mesg2");
			System.out.println("--------------------------");
		}

	}

}
