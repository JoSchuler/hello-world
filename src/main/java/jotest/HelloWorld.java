package jotest;

import org.apache.commons.io.IOUtils;

public class HelloWorld {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello World!");
		IOUtils.write("Blah blah blah!".getBytes("UTF-8"), System.out);
	}

}
