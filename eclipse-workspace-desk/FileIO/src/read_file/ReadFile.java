package read_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf = null;
		
		try {
			bf = new BufferedReader(new FileReader("textFile.txt"));
			String line;
			
			while((line = bf.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch(IOException e) {
			// e.printStackTrace();
			System.out.println("Exception found: " + e);
		} finally {
			try {
				bf.close();
			} catch(Exception e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("Exception found: " + e);
			}
		}		
	}

}
