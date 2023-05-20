package printers;

public class NetworkPrinter implements Printer{
//implement inheruted abstract method declaration
	@Override //can be used either to override / implement 
	public void print(String message)
	{
		System.out.println("Sending a message to server  "+message);
	}
	public void openConnection()
	{
		System.out.println("establishing cn with remote server");
	}
	public void CloseConnection()
	{
		System.out.println("closing cn with remote server");
	}
}
