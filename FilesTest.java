import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FilesTest{
	public static void main(String[] args){
		try{
			String jsonInString = "hello,world.事实上";
			Files.write(Paths.get("result.json"), jsonInString.getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND);
		}catch(Exception e){
			System.out.println("IO error occur");
		}

	}
}
