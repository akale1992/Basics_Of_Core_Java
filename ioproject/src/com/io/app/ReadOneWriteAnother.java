package com.io.app;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadOneWriteAnother {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Ashish1992\\Desktop\\idm serial key.txt");
		BufferedReader br= new BufferedReader(new InputStreamReader(fis));
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Ashish1992\\Desktop\\output.txt");
		/*while (true) {
			int a = fis.read();
			if(a== -1)
				break;
			System.out.println((char)a);
			fos.write(a);
		}
		fos.close();*/
		
		//=======================================================
		
		BufferedWriter bw=new BufferedWriter(new FileWriter(new File("C:\\Users\\Ashish1992\\Desktop\\output1.txt")));
		String line=br.readLine();
		while (line != null) {
			System.out.println(line);
			bw.write(line);
			bw.newLine();
			line=br.readLine();
		}
		
		bw.close();
		br.close();
		

	}

}
