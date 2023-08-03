import java.util.Scanner;
import java.io.*;

public class program12 {
     public static void main(String [ ] args) throws FileNotFoundException {
              new program12().findLongestWords();
         }

     public String findLongestWords() throws FileNotFoundException {

       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File("D:\\internship\\assignment-5\\sample.txt"));


       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longest_word.length()) {
             longest_word = current;
           }

       }
         System.out.println("\n"+longest_word+"\n");
            return longest_word;
            }
}
