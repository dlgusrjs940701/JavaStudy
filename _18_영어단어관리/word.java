package _18_영어단어관리;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class word {

	public static char[] txt;

	public static void main(String[] args) {
		try {
			File file=new File("word.txt");
			FileWriter writer=new FileWriter(file);
			BufferedWriter bWriter=new BufferedWriter(writer);
			bWriter.write("apple , banana");
			bWriter.flush();
			bWriter.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
		
		try {
			File file=new File("word.txt");
			FileWriter writer=new FileWriter(file, true);
			BufferedWriter bWriter=new BufferedWriter(writer);
			bWriter.write(" , car");
			bWriter.flush();
			bWriter.close();
		} catch(Exception e){
			e.getStackTrace();
		}
		
		try {
			File file=new File("word.txt");
			FileReader reader=new FileReader(file);
			BufferedReader bReader=new BufferedReader(reader);
			
			while(true) {
				String line=bReader.readLine();
				if(line==null) {
					break;
				}
				System.out.println(line);
			}
			bReader.close();
		}catch(Exception e) {
			
		}

	}

}
