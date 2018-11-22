import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
 
public class extract {
       
	public static void main(String args[])
	{	   
		String sourceZipFile = "C:/FileIO/HTML5.zip";
	   
		try
		{
				//create FileInputStream from the source zip file
				FileInputStream fin = new FileInputStream(sourceZipFile);
			   
				//create ZipInputStream from FileInputStream object
				ZipInputStream zin = new ZipInputStream(fin);
			   
				//get the first entry from the source zip file
				ZipEntry entry = zin.getNextEntry();
			   
				//create OutputStream to extract the entry from zip file
				OutputStream os = new FileOutputStream("c:/extractedFile.css");
			   
			   
				byte[] buffer = new byte[1024];
				int length;
			   
				//read the entry from zip file and extract it to disk
				while( (length = zin.read(buffer)) > 0)
				{
						os.write(buffer, 0, length);
				}
			   
				//close the streams
				os.close();
			   
				//close the zip file
				zin.close();
			   
				System.out.println("File Extracted from zip file");
		}
		catch(IOException e)
		{
				System.out.println("IOException :" + e);
		}
		   
	}
 
}