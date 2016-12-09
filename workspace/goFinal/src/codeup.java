import java.util.Scanner;
public class codeup {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a,c,d = 0;
while(true){
a = sc.nextInt();
if(a>=2 && a<=20)break;
}
int b[][] = new int [a][a],e[][] = new int [a][a];
for(int i = 0; i < a; i++){
	c = sc.nextInt();
	for(int j = 0; j <=i; j++){
		b[i][j] = c;
	if(d > 0&&j == 1){
		b[i][j] = c-d;
	}
	else if(j>1){
		b[i][j] = b[i][j-1]-e[i-1][j-2];
		e[i][j-1] = b[i][j-1]-e[i-1][j-2];
		}
}
e[i][0] = c-d;
d = c;	
}
for(int i = 0; i < a; i++){
	for(int j = 0; j <=i; j++){
		System.out.print(b[i][j]+" ");
	}
	System.out.println();
}
}
}