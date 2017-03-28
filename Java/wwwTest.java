import java.net.*;
import java.io.*;


class readWebsite{
	
	public static void main(String[] arg) throws Exception{

		URL url = new URL("http://www.google.com");
		InputStream ins = url.openStream();
		InputStreamReader isr = new InputStreamReader(ins);
		BufferedReader web = new BufferedReader(isr);
		
		String sCur;

		while((web.readLine()) != null){
			System.out.println(web.readLine());
		}

	}	
}