import java.io.*;
import java.util.*;

public class program9 {
       public static void main(String[] args) {
       File file = new File("D:\\internship\\assignment-5\\sample.txt");
       Date date=new Date(file.lastModified());
	   System.out.println("\nThe file was last modified on: "+date+"\n");	   
     }
}