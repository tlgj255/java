import java.util.Scanner;
public class j {
public static void main(String[] args) {
	int a [][] = new int [11][11],hint,row,col;
	Scanner sc = new Scanner(System.in);
	for(int i = 1; i < 10; i++)
		for(int j = 1; j < 10; j++)
		a[i][j] = sc.nextInt();	
	row = sc.nextInt();
	col = sc.nextInt();
	hint = a[row-1][col-1]+a[row][col-1]+a[row-1][col]+a[row+1][col]+a[row][col+1]+a[row-1][col+1]+a[row+1][col+1]+a[row+1][col-1];
	if(a[row][col] == 1)
		hint = -1;
	System.out.println(hint);
}
}
