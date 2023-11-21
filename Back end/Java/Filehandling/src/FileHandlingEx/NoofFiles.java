package FileHandlingEx;

import java.io.File;


public class NoofFiles {
	  public static void main(String args[])
	  {
		  File f =new File("D:\\JavaFullstack\\Full stack\\Fullstackjava practice\\Java");
		  String[] fileNames=f.list();
		  int count=0;
		  for(String fileName:fileNames)
		  { 
			  File f1=new File(f,fileName);
			/*if(f1.isFile())  
			{
				System.out.println(fileName);
				count++;
			}*/
			  if(!f1.isFile())  
				{
					//System.out.println(f1);//it will give whole path with files
					System.out.println(fileName);//it gives only filenames
					count++;
				}
		  }
		  System.out.println(count);
	  }
	}


