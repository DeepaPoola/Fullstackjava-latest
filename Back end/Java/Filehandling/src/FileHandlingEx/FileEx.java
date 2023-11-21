package FileHandlingEx;

import java.io.File;

import java.io.IOException;


public class FileEx {
  public static void main(String args[])throws IOException
  {
	  File f=new File("d://test.txt");
	  System.out.println(f.exists());
	  f.createNewFile();
	  System.out.println(f.exists());
	  
  }
}
