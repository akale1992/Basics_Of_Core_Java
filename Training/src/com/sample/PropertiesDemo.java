package com.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Properties properties= new Properties();
		properties.load(new FileReader(new File("G:\\Eclipse\\MyJavaWork\\Training\\src\\com\\sample\\db.properties")));
		
		Iterator i=properties.entrySet().iterator();
		for (Iterator iterator = properties.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
		}
		
		System.out.println(properties.getProperty("username", "som"));
		
		
		properties.setProperty("user", "som");
		properties.setProperty("password", "SKALE");
		properties.setProperty("mail", "skale1990@gmail.com");
		
		
		FileWriter fileWriter = new FileWriter(new File("G:\\Eclipse\\MyJavaWork\\Training\\src\\com\\sample\\my_db.properties"));
		
		properties.store(fileWriter, "my database properties");
		properties.storeToXML(new FileOutputStream(new File("G:\\Eclipse\\MyJavaWork\\Training\\src\\com\\sample\\my_hdfs.xml")), "hdfs properties");
		
		
		
	}

}
