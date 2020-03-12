package KEYWORD;

import java.io.IOException;
import java.io.NullPointerException;
import org.testng.annotations.Test;

public class LOGIN {

	Keywordengine engine;
	@Test
	public void LOGIN() throws IOException{
		try {
			engine.startExcution("login");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
