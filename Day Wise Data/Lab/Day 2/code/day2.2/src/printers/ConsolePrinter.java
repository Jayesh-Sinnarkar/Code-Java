package printers;

public class ConsolePrinter implements Printer{
//implement inheruted abstract method declaration
	@Override //can be used either to override / implement 
	public void print(String message)
	{
		System.out.println("Printing a message on the console "+message);
	}
}
