package com.wran.ssm.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties pps = new Properties();
		try {
			String path = ClassLoader.getSystemClassLoader().getResource("").getPath();
			System.out.println(ClassLoader.getSystemClassLoader().getResource("").getPath());
			InputStream parh1 = PropertiesTest.class.getResourceAsStream("/jdbc.properties");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path+"jdbc.properties")));
//			pps.load(new FileInputStream(path+"jdbc.properties"));
			pps.load(parh1);
			 Enumeration enum1 = pps.propertyNames();//得到配置文件的名字
			 System.out.println(enum1);
			 while(enum1.hasMoreElements()) {
				 String key = (String) enum1.nextElement();
				 String value = pps.getProperty(key);
				 System.out.println(key+" = "+value);
			 }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
