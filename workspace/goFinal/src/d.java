import java.util.Scanner;
public class d {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int d = sc.nextInt();
	int q = 0,i = 0,k = 0,n = 0,e = 1,a[][] = new int [d][d],j = 0;
	for(i = 0; i < d; i++){
		for(j = 0; j < d; j++){
			a[i][j] = e;
			e++;
		}
	}  
	for(i = 0; i < d; i++){
		for(j = 0; j < d; j++){
			if(j == 0||j == d-1||i==0||i==d-1)
				q += a[i][j];
		}
	}
System.out.print(q);
}
}
