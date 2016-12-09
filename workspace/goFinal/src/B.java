import java.util.Scanner;
public class B {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
int a[][] = new int [10][10],b[] = new int [10];
int i = 0,j = 0,c = 0;
for(i = 0; i< 10; i++){
	for(j = 0; j<10; j++){
	a[i][j] = sc.nextInt();
	}
}
for(i = 0; i<10; i++)
	b[i] = sc.nextInt();
for(j = 0; j<10; j++){
	if(b[j] == 1){
		for(i = 9; i>=0; i--){
			if(a[i][j] > 0){
				c = 1;
			break;}
			else if(a[i][j] < 0){
				System.out.println("aa");
				c = 2;
				break;}
			}
	if(c == 1)
		System.out.println((j+1)+" crash");
	else if(c == 2)
		System.out.println((j+1)+" fall");
	else if(c == 0)
		System.out.println((j+1)+" safe");
	}
	c = 0;
	}
}
}