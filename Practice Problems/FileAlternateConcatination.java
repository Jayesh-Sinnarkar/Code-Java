//This program takes two files as an input abc.txt and def.txt and writes one line from each file alternatively onto out.txt file.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class FileAlternateConcatination {

    public static void main(String[] args) throws IOException{

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));
        BufferedReader br1 = new BufferedReader(new FileReader("abc.txt"));
        String line1 = br1.readLine();
        BufferedReader br2 = new BufferedReader(new FileReader("def.txt"));
        String line2 = br2.readLine();

        while(line1!=null || line2!=null)
        {
            if(line1!=null)
            {
                pw.println(line1);
                line1 = br1.readLine();
            }

            if(line2!=null)
            {
                pw.println(line2);
                line2 = br2.readLine();
            }

        }

        pw.flush();
        br1.close();
        br2.close();

        
    }
    
}
