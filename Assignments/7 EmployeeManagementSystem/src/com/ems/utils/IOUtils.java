package com.ems.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import com.ems.core.Employee;
import com.ems.exceptions.EMSException;

public class IOUtils {
	// TO STORE DATA INTO FILE 
	public static void storeEmployeeData(Map<Integer, Employee> employeeMap, String fileName) throws FileNotFoundException, IOException, EMSException{
		// CHECK IF FILE EXISTS AND IS WRITABLE
		File file = new File(fileName);
		if(file.isFile() == false)
			throw new EMSException("Invalid file input");
		if(file.canWrite() == false)
			throw new EMSException("Write permission denied, can not write file. ");
		
		// PERFORM SERIALIZATION
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
			out.writeObject(employeeMap);
			
			// SUCCESS MESSAGE
			System.out.println("Data stored successfully");
		}
	}
	
	// TO RESTORE DATA FROM FILE
	@SuppressWarnings("unchecked")
	public static Map<Integer, Employee> restoreEmployeeData(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException, EMSException{
		// INITIALIZE AN EMPTY MAP
		Map<Integer, Employee> employeeMap = null;
		
		//CHECK IF FILE EXISTS AND IS READABLE
		File file = new File(fileName);
		if(file.isFile() == false)
			throw new EMSException("Invalid file input");
		if(file.canRead() == false)
			throw new EMSException("Read permission denied, can not read file.");
		if(file.length() == 0)
			throw new EMSException("Can not restore from empty file");
		
		// PERFORM DESERIALIZATION
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
			employeeMap = (Map<Integer, Employee>)in.readObject();
		}
		System.out.println("Data restored successfully!");
		
		// RETURN OBJECT
		return employeeMap;
	}
}
