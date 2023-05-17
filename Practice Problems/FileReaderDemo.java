import java.io.*;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException
    {
        File f = new File("abc.txt");
        FileReader fr = new FileReader(f);
        System.out.println(fr.read()); // Prints unicode value of first character in a file

        char[] ch = new char[(int)f.length()]; // created array of length equals to total characters in a file

        fr.read(ch); // file data copied to char array
        System.out.println("\n\n\n----------------------------------\n\n\n");
        for(char c: ch)
        {
            System.out.print(c);
        }
        
        System.out.println("\n\n\n--------------------------------\n\n\n");

        FileReader fr1 = new FileReader(f);

        int i = fr1.read();
        while(i!=-1)
        {
            System.out.print(i+" ");
            i=fr1.read();
        }

        System.out.println("\n\n\n--------------------------------\n\n\n");

    }
    
}
