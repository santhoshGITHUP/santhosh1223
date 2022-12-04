package fileOpertaion;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\fileHandling\\samble.txt");
		// create a new folder
		//  boolean mkdir = f.mkdir();
		//  System.out.println(mkdir);
		// create a new file
//		boolean createNewFile = f.createNewFile();
//		System.out.println(createNewFile);
//		//check file is readable,writeable,exits
//		boolean canRead = f.canRead();
//		System.out.println("File reading status: "+canRead);
//		boolean canWrite = f.canWrite();
//		System.out.println("File Writting status: "+canWrite);
//		boolean exists = f.exists();
//		System.out.println("file exits status: "+exists);
//		// print the list of the file
//		System.out.println("===== list of the file===============");
//		String[] list = f.list();
//		for (String string : list) {
//			System.out.println(string);

//		}
//		System.out.println("===========list of the file with location===========");
//		File[] listFiles = f.listFiles();
//		for (File file : listFiles) {
//			System.out.println(file);
//
//		}

		// read the data form the file
		List<String> readLines = FileUtils.readLines(f);
		System.out.println(readLines);
		// write the data from file
		FileUtils.write(f, "oommm nama sivaaaayeaaaaa",true);
	}

}
