package javaprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.rmi.AccessException;
import java.util.Scanner;

public class FiletoAnotherFile {
	public static void copyContent(File a,File b)
	throws Exception
	{
		FileInputStream in=new FileInputStream(a);
		FileOutputStream out=new FileOutputStream(b);
		try {
			int n;
			while((n=in.read()) !=-1){
				out.write(n);
				
			}
		}
		finally {
			if(in!=null) {
				in.close();
			}
		}
		System.out.println("file copied");
	}
	

	public static void main(String[] args)  throws Exception 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the source filename from where you have to read/copy:");
		java.lang.String a=sc.nextLine();
		
		
		File x=new File (a);
		System.out.println("enter the destination filename where you have to write /paste:");
		java.lang.String b=sc.nextLine();
		File y=new File(b);
		copyContent(x,y);

	}
	
	
	/*public static void copyContent(File a,File b) throws Exception
	
	{
	FileInputStream in=new FileInputStream(a);
	FileOutputStream out=new FileOutputStream(b);
	
	
	try {
		int n;
		while((n=in.read()) !=-1){
			out.write(n);
		}
	}
	finally {
		if(in!=null) {
			in.close();
		}
	}
	System.out.println("file copied");
}

			
	
	
	
	
	
	
	public static void main(String[] args) throws Exception 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the source filename from where you have to read/copy:");
		java.lang.String a=sc.nextLine();
		
		
		File x=new File (a);
		System.out.println("enter the destination filename where you have to write /paste:");
		java.lang.String b=sc.nextLine();
		File y=new File(b);
		copyContent(x,y);
}
	}*/