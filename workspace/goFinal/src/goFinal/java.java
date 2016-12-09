package goFinal;
import java.util.Scanner;
public class java {
public static void main(String[] args){
	Scanner a = new Scanner(System.in);
	int b[] = new int[10],c = 0,temp = 0,temp_;
	String d = "",e = "";
	for(int i = 0; i <10; i++){
		b[i] = a.nextInt();
			temp_ = i;
        for (int j = i; j >=0; j--) {
            if (b[temp_] < b[j]) {
                temp = b[temp_];
                b[temp_] = b[j];
                b[j] = temp;
                temp_--;
            }
        }
        for (int j = i; j >=0; j--)
            e += "" + b[j] + ",";
        for (int j = 0; j <=i; j++)
            d += "" + b[j] + ",";
        System.out.print(e);
        System.out.println();
        System.out.print(d);
        e = "";
        d = "";
	}
	}
}
