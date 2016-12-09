import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = 0, i = 0, j = 0, c = 0, a = sc.nextInt(), b[][] = new int[a][a];
		for (i = 0; i < a; i++) {
			for (j = 0; j < a; j++) {
				b[i][j] = 0;
			}
		}
		i = a;
		j = -1;
		if(a == 1)
			b[0][0] = 1;
		while (true) {
			if (v == a-1)
				break;
			while (true) {
				i--;
				j++;
				c++;
				b[i][j] = c;
				if (i == 0||j == a-1)
					break;
			}
			v++;
			c++;
			i++;
			b[i][j] = c;
			if (v == a-1)
				break;
			while (true) {
				i++;
				j--;
				c++;
				b[i][j] = c;
				if (i == a - 1|| j == 0)
					break;
			}
			v++;
			j++;
			c++;
			b[i][j] = c;
			if (v == a-1)
				break;
		}
		for (i = 0; i < a; i++) {
			for (j = 0; j < a; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
}