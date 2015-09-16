import java.io.File;
import java.io.IOException;

public class AlphabetNumberConverter {
	
	public AlphabetNumberConverter() throws IOException{
		File newFile = new File("newfile.txt");
		startFile(newFile);
	}

	private void startFile(File newFile) throws IOException{
		newFile.createNewFile();		
	}
}
