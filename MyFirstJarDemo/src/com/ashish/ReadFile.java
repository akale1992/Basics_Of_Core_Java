package com.ashish;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("G:\\Eclipse\\MyJavaWork\\MyFirstJarDemo\\src\\com\\ashish\\names.txt");
		BufferedReader br = new BufferedReader(fr);
		List<String> li = new ArrayList<String>();
		
		String line = br.readLine();
		while(line !=null){
			li.add(line);
			System.out.println(li);
			line=br.readLine();
		}
		Collections.sort(li);
		
		System.out.println(li);
		for (String name : li) {
			System.out.println(name);
		}
		br.close();
		fr.close();
		//FileWriter fw = new FileWriter(new File("G:\\Eclipse\\MyJavaWork\\MyFirstJarDemo\\src\\com\\ashish\\names.txt"),true);
		PrintStream pr= new PrintStream(new File("G:\\Eclipse\\MyJavaWork\\MyFirstJarDemo\\src\\com\\ashish\\names.txt"));
		for (String name : li) {
			pr.println(name);
		}
		pr.close();
	}

}
