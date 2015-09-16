import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class AlphabetNumberConverter_Test {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void constructor_WithNoFileName_ShouldCreateNewFile(){
		try {
			new AlphabetNumberConverter();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void constructor_WithFileName_ShouldCreateNewFile(){
		try {
			new AlphabetNumberConverter("fileName");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
