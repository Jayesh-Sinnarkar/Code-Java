import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//read line by line from file
//break line into tokens 
//HashMap<String,Integer>

public class WordFrequency {

	public static void main(String[] args) throws IOException {
		HashMap<String,Integer> wordToCount = new HashMap<String, Integer>();
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		String line = "";
		while ((line = br.readLine()) != null) {
			String[] words = line.split(" ");
			for (String word : words) {
				if(wordToCount.containsKey(word)) {
					int count = wordToCount.get(word);
					count = count+1;
					wordToCount.put(word,count );
				}else {
					wordToCount.put(word, 1);
				}
			}
		}
		System.out.println(wordToCount);
	}
}
