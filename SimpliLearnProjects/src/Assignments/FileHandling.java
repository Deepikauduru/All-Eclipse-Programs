package Assignments;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileHandling {
	
	
	
	static void createFileUsingFileClass() throws IOException {
		
		
		
		//create a file
			

//				if(file.createNewFile())
//				{
//				System.out.println("Created File");	
//				}
//				else {
//					System.out.println("File already exist");
//				}
				
							
				//write data to file
				
//				String data ="Deepika,AP,Gudur";
//				FileWriter writer =new FileWriter("D:\\Deepika\\testfile.txt");
//				writer.write(data);
//				writer.close();
//				
				
                //Read a File
				
				
				
				
//				//Append the file
//				FileWriter write=new FileWriter(file);
//				writer.write("hello");
//				writer.close();

	}

	public static void main(String[] args) {
		
		//create file
		File file=new File("D:\\Deepika\\testfile.txt");
		try {
			if(file.createNewFile())
			{
			System.out.println("Created File");	
			}
			else {
				System.out.println("File already exist");
			}
			
		}
		catch(IOException e){
			System.out.println(e);
			
		}
		
		//write file
		
		try {
		String data ="Deepika,AP,Gudur";
		FileWriter writer =new FileWriter("D:\\Deepika\\testfile.txt");
		writer.write(data);
		writer.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		//read file
		try {
		char[] data= new char[100];
		
		FileReader fr =new FileReader("D:\\Deepika\\testfile.txt");
		fr.read(data);
		fr.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		//append file
		try {
		String data="India";
		
		FileWriter fw=new FileWriter("D:\\Deepika\\testfile.txt",true);
		fw.write(data);
		fw.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		
		
	}

}
