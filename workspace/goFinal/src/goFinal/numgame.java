package goFinal;
import java.util.Scanner;
import java.util.Random;
public class numgame {
public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	Random b = new Random();
int c [] = new int [2],p = 0;
char d ;
	while(true){
		
		for(int i = 0; i < 2; i++){
c[i] = b.nextInt(100)+1;
		}
		System.out.println(c[0]+"            "+c[1]);
		System.out.println("´ÙÀ½ Áß ¿ÇÀº °ÍÀ» °í¸£½Ã¿À");
		System.out.println(">      =       <");
		d = a.next().charAt(0);
	if(d == '<'&&c[0] < c[1])
		System.out.println("1Á¡ È¹µæ");
	else if(d == '>'&&c[0] > c[1])
		System.out.println("1Á¡ È¹µæ");
	else if(d == '='&&c[0] == c[1])
		System.out.println("1Á¡ È¹µæ");
	else{ 
		System.out.println("³¡ È¹µæ Á¡¼ö´Â" + p +"Á¡");
	break;
	}
	p++;
	}	
}
}
