package jinsu_ch;
import java.util.Scanner;
public class put {
public static void main(String[] args) {
	input i = new input();
	String b = "";
	Scanner sc = new Scanner(System.in);
	int a = 0,d = 1,ask;
	System.out.println("10������ �Է��� �ּ���");
	a = sc.nextInt();
	int c[] = new int[a];
	i.setj(a);
	System.out.println("ASCII�� 1 2������ 2 8������ 8 16������ 16 60������ 60�� �Է��� �ּ���");
	ask = sc.nextInt();
	 a = i.getj();
  switch(ask){
  case 1:
	  System.out.println((char)a);
	  break;
  case 2:
	System.out.println(chtwo(a));
	  break;
  case 8:
	  System.out.println(chegh(a));
	  break;
  case 16:
	  System.out.println(chess(a));
	  break;
  case 60:
	  System.out.println(site(a));
	  break;
	  default:
		  System.out.println("�ٽ� �Է��� �ּ���");
	  break;
  }
	
		
}
public static String chtwo(int a){
	String go = "";
	while(a != 0){
		go = a%2+" " +go;
		a /= 2;
	}
	return go;
	
}
public static String chegh(int a){
	String go = "";
	while(a != 0){
		
		go = a%8 +" "+ go;
		a /= 8;
	}
	return go;
}
public static String chess(int a){
	String go = "",temp;
	while(a != 0){
	switch(a % 16){
	case 10:
		temp = "A";
		break;
	case 11:
		temp = "B";
		break;
	case 12:
		temp = "C";
		break;
	case 13:
		temp = "D";
		break;
	case 14:
		temp = "E";
		break;
	case 15:
		temp = "F";
		break;
		default:
			temp = ""+a%16;
	}
	go = temp+" "+go;
	a/=16;
	}
return go;
}
public static String site(int a){
	String go = "";
	float b,c = 0;
	while(a != 0){
		b = a;
		b = b/100;
		if(a < 60){
			c +=b;
			break;
		}else
			c = a/60;
		a %=60;
	}
	return go = ""+c;
}
}

