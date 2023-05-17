//This program takes two files as input abc.txt and def.txt and concatinate these two files to out.txt file.

import java.io.*;

public class FileConcatination {

    public static void main(String[] args) throws IOException{
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));
        BufferedReader br  = new BufferedReader(new FileReader("abc.txt"));

        String line = br.readLine();

        while(line!=null)
        {
            pw.println(line);
            line=br.readLine();
        }
        
        br = new BufferedReader(new FileReader("def.txt"));
        line = br.readLine();

        while(line!=null)
        {
            pw.println(line);
            line = br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();





    }
    
}
