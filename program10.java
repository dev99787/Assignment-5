import java.io.*;

 
public class program10 {
     public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "D:\\internship\\assignment-5\\sample.txt";
             FileWriter fw = new FileWriter(filename,false); 

             fw.write("hii i am national footballer \n");
             fw.write("my dream is become an IAS \n");
             fw.write("i hate computer field \n");
             fw.write("java program no 10 \n");
             fw.write("i am from hell \n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("D:\\internship\\assignment-5\\sample.txt"));

             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();                          
           }
           catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());
           }
        }
  }