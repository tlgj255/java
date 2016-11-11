import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class read_file {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new FileReader("c:/input.txt"));
	while(true){
		int a = 1,b = 1;
		String line[][] = new String[a][b],c = br.readLine();
	if(c == null)break;
	line[a-1][b-1] = c;
	System.out.println(line[a-1][b-1]);
	b++;
	if(c.equals("\r")){
		a++;
	System.out.println();
	}
	}
	br.close();
}
}
