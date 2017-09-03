package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class FtpTest {

	@Test
	public void test(){
		FTPClient client = new FTPClient();
		try {
			client.connect("192.168.222.181",21);
			client.login("ftpuser", "dhw88763186");
			client.setFileType(FTP.BINARY_FILE_TYPE);
			FileInputStream fis = new FileInputStream(new File("‪C:/Users/dfw19/Desktop/timg1.jpg"));
			client.changeWorkingDirectory("/var/www/html");
			client.storeFile("test.jpg", fis);
			client.logout();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
