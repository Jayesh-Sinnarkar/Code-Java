package printers;

public class FilePrinter implements Printer{
//implement inheruted abstract method declaration
	@Override //can be used either to override / implement 
	public void print(String message)
	{
		System.out.println("Saving  a message in the file "+message);
	}
	//Can imple class add more features ? YESS
	public void openFile()
	{
		System.out.println("opening a file");
	}
	public void closeFile()
	{
		System.out.println("closing a file");
	}
}
