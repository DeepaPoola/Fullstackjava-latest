package FileHandlingEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
  public static void main(String args[]) throws IOException {
	    
	  FileWriter fw=new FileWriter("d://test.txt",true);
	  fw.write("Hello");
	  fw.write(90);
	  fw.write("\n");
	  fw.write("welcome");
	  fw.flush();
	  fw.close();
	  
  }
}
