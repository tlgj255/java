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
			System.out.println("�ٲܰ��� �ֳ���?\n������ y ������ n");
			g = sc.next().charAt(0);
			if(g == 'y'){
			System.out.println("����� ���� �ٲٽðڽ��ϱ�?(�ִ� "+(b+1)+"������)");
			d = sc.nextInt();
			System.out.println(d+"������ ����� �ٲٽðڽ��ϱ�?(�ִ�"+a+"������)");
			f = sc.nextInt();
			if(input[f][d] == '1'){
				System.out.println("������� 1, 0���� �ٲ�����ϴ�");
				input[f][d] = '0';
			}else if(input[f][d] == '0'){
				System.out.println("������� 0, 1���� �ٲ�����ϴ�");
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

