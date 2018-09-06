package login;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileio {
	
	public static void main(String[] args) throws IOException {
		int c;
		FileInputStream fis=new FileInputStream("d:/chinky.txt");
		/*byte[] buffer=new byte[fis.available()];
		fis.read(buffer);
		String data=new String(buffer);
		System.out.println(data);*/
		FileOutputStream fos=new FileOutputStream("d:/copy2.txt");
      /* while((c=fis.read())!=-1)
       {
    	   System.out.print((char)c);
    	   fos.write(c);
       }*/
		/*byte[] buffer=new byte[fis.available()];
		fis.read(buffer);
		fos.write(buffer);*/
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		while((c=bis.read())!=-1){
			bos.write(c);
		}
       System.out.println("file copied successfully");
    //   fis.close();
      // fos.close();
	}

}
