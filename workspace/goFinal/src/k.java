import java.text.DecimalFormat;
import java.util.Scanner;
public class k {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a[] = new double[5];
	for(int i = 0; i < 3; i++){
		a[i] = sc.nextInt();
	if(i > 0)
		for(int j = i; j > 0; j--)
			if(a[j]< a[j-1])
			a[j-1] = a[j];
	}
	for(int i = 3; i < 5; i++)
		a[i] = sc.nextInt();
	if(a[4]< a[3])
		a[3] = a[4];
	double per = Double.parseDouble(String.format("%.2f",(a[0]+a[3])*1.1));
	System.out.print(per);
}
}
