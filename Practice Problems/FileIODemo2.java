import java.io.IOException;
import java.io.*;

public class FileIODemo2 {
    
    public static void main(String[] args) throws IOException
    {
        int fileCount =0;
        int foldersCount =0;

        File f = new File("/home/jayesh/Git_Repo/WPT");

        String[] fileList = f.list();

        for(String s: fileList)
        {
            File f1 = new File(f,s);

            if(f1.isFile())
                fileCount++;
            else if(f1.isDirectory())
                foldersCount++;
        }

        System.out.println("Total Files in "+f.getPath()+" is:"+fileCount);
        System.out.println("Total Directories in "+f.getPath()+" is:"+foldersCount);


    }
}
