package FileHandlingEx;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
       FileWriter fw=new FileWriter("d:\\test.txt",true);
       BufferedWriter bw= new BufferedWriter(fw);
       bw.write(99);
       bw.newLine();
       bw.write("Hello");
       bw.newLine();
       bw.write("Good mrng");
       bw.flush();
       bw.close();
       
       
	}

}
