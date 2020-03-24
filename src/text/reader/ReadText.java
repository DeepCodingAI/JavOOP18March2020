package text.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) {
		String filePath = "/Users/matiur/develop/SeleniumMarch2020/file12.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
	
		try {
			
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File path was not right");
		}
		
		
		String line = "";
		
		
		try {
			while((line = br.readLine()) !=null){
				System.out.println(line);
			}
		} catch (IOException e) {
		
			System.out.println("File path was not right so we could not read");
		}
		finally {
			if(fr != null) {
				try {
					fr.close();
					fr = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(br !=null) {
				try {
					br.close();
					br = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
