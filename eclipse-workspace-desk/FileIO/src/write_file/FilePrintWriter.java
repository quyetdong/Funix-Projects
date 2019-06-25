package write_file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrintWriter {
	public static void main(String[] args) {
		File file = new File("textFile.txt");
		PrintWriter pw = null;
		
		try {
			if(!file.exists()) {			
					file.createNewFile();		
			}			
			
			pw = new PrintWriter(file);
			
			pw.print(1);
			pw.println(". First line");
			pw.print(2);
			pw.println(". Second line in the file");
			pw.print(3);
			pw.println(". Third line in the file");
			
			
			
			System.out.println("Done!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pw.print(1);
		pw.println(". First line");
		pw.close();
	}	
}
