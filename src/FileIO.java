import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
public static void main(String[] args) throws IOException {
	
	BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
	writer.write("Writing to a file");
	writer.write("\nWriting to a file again");
	writer.close();
}
	
}
