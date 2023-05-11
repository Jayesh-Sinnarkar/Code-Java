import java.io.*;

class FileIODemo {


    public static void main(String[] args) throws IOException {
        File f = new File("ABC");
        f.mkdir();

        File f1 = new File(f,"abc.txt");
        f1.createNewFile();
    }
}