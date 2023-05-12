import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {

        // File directory = new File("text");
 
        // File[] listFiles = directory.listFiles();

        // for(File f : listFiles){

        // System.out.println(f.getName());
        // }



        String line;
        int count = 1;
        int count2 = 1;

        Map<String, Integer> wordCount = new HashMap<>();

        FileReader fr = new FileReader("birches2.txt");
        BufferedReader br = new BufferedReader(fr);

        while ((line = br.readLine()) != null) {

            line = line.replaceAll("\\p{P}", " ").toLowerCase().trim();

            String[] words = line.split(" ");

            for(String word : words){

                if(!wordCount.containsKey(word)){

                    wordCount.put(word, count);

                }else{

                    count2 += count;
                    wordCount.replace(word, count, count2);
                }

                
                
            }
            System.out.println(wordCount);
            


        }

    }
}
