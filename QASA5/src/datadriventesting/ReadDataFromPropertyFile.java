package datadriventesting;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws Throwable {
		//create the fileInputStream Object
		FileInputStream fis = new FileInputStream("./testdata/actitimecommondata.properties");
		// create the properties object
		Properties pobj = new Properties();
		//load the data to the properties object 
		pobj.load(fis);
		//read the data interms of Key and Value
		String url = pobj.getProperty("url");
		System.out.println(pobj.getProperty("url"));
		String username = pobj.getProperty("username");
		System.out.println(username);
	}

}
