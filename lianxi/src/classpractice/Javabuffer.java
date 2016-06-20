package classpractice;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Javabuffer {
/*
 * 使用缓冲流
 * 字节缓冲流
 * 
 * 
 * 
 * */
	public static void main(String[] args) throws IOException {
//		File file=new File ("F:\\wen\\新建文本文档.txt");
//		File file2=new File("F:\\wen\\新建日记文本文档.txt");
//		 FileInputStream file1=new FileInputStream("F:\\wen\\简历1.doc");
//		 FileOutputStream file2=new FileOutputStream("F:\\wen\\新建文本文档.txt");
//		 
//		byte[]len=new byte[1024];
//		
//		while(file1.read(len)!=0){
//			file2.write(len);
//		}
//		file1.close();
//		file2.close();
		FileOutputStream file=new FileOutputStream("F:\\wen\\新建文本文件");
		DataOutputStream fileout=new DataOutputStream(file);
		fileout.writeInt(12345);
		byte []bytearry={1,2,3};
		fileout.write(bytearry);
		fileout.writeLong(123456789);
		fileout.writeBoolean(true);
		fileout.writeUTF("hello");
		
	}
	
	
}
