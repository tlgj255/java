import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;
import java.util.Scanner;
public class read_file {
public static void main(String[] args) throws IOException{
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new FileReader("c:/input.txt"));
	int a = 0,b = 0,d = 0,f;
	String arr = br.readLine();
	char input [][] = new char[arr.length()][arr.length()],e,g;
	while(true){
		int c = br.read();
		e = (char)c;
		if(e=='0'||e == '1'){
		input[a][b] = (char)c;
		System.out.print(input[a][b]);
		a++;
		}
		else if(e =='\n'){
		System.out.println();
b++;		
a = 0;
	}	
		else if(c == -1){
			System.out.println();
			BufferedWriter in = new BufferedWriter(new FileWriter("c:/input.txt"));
			while(true){
			System.out.println("바꿀곳이 있나요?\n있으면 y 없으면 n");
			g = sc.next().charAt(0);
			if(g == 'y'){
			System.out.println("몇번쨰 줄을 바꾸시겠습니까?(최대 "+(b+1)+"번쪠줄)");
			d = sc.nextInt();
			System.out.println(d+"번쨰줄 몇번을 바꾸시겠습니까?(최대"+a+"번까지)");
			f = sc.nextInt();
			if(input[f][d] == '1'){
				System.out.println("현재숫자 1, 0으로 바뀌었습니다");
				input[f][d] = '0';
			}else if(input[f][d] == '0'){
				System.out.println("현재숫자 0, 1으로 바뀌었습니다");
				input[f][d] = '1';
				
			}}else{ 
			for(int i = 0; i <= b; i++){
				for(int j = 0; j < a-1; j++){
					in.write(input[i][j]);
				}
				in.write("\r\n");
				}
			in.close();
			break;
		}
			}
			break;
			}

	}

	br.close();
	
}
}

