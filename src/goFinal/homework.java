package goFinal;
import java.util.Random;
import java.util.Scanner;
public class homework {
public static void main(String[] args) {
	int num,inNum,p = 1;
	Random a = new Random();
	Scanner b = new Scanner(System.in);
	num = a.nextInt(100) + 1;
	while(true){
		inNum = b.nextInt();
	if(num > inNum)
	System.out.println("UP");
	if(num < inNum)
		System.out.println("DOWN");
	if(num == inNum){
		System.out.println("clear!\n"+p+"번 만에 클리어");
		break;
	}
	p++;
	}
}
}
