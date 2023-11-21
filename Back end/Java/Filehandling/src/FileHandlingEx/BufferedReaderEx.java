package FileHandlingEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method File
		FileReader fw=new FileReader("d:\\test.txt");
         BufferedReader br=new BufferedReader(fw);
         String line=br.readLine();
         while(line!=null)
         {
        	 System.out.println(line);
        	 line=br.readLine();
         }
         
	}

}
