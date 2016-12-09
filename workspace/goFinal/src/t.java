import java.util.Scanner;
public class t {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	String a = sc.nextLine();
	char b[] = a.toCharArray();
	String c [] = new String [a.length()];
	String[] han1 = {"","일","이","삼","사","오","육","칠","팔","구"};
	String[] han2 = {"","십","백","천","","십","백","천","","십","백","천","","십","백","천","","십","백","천","","십","백","천","","십","백","천"};
	String[] han3 = {"","만","억","조","경"};
	int d = a.length(),z = 0;
	for(int i = 0; i <a.length(); i++){
		d--;
	switch(b[i]){
	case '0':
		if(a.length() == 1){
			System.out.println("영");
		}
		if(d%4 == 0&&z<3)
			c[i] = han3[d/4];
		else{
		c[i] = han1[0];
		z++;}
		break;
	case '1':
		if(d == -1)
			c[i] = han1[1];
		else if(d == a.length())
			if(d%4 == 0)
				c[i] = han2[d]+han3[d/4];
				else
					c[i] = han2[d];
		else 
			if(d%4 == 0)
				c[i] = han1[1]+han2[d]+han3[d/4];
				else
					c[i] = han1[1]+han2[d];
		z = 0;
		break;
	case '2':
		if(d%4 == 0)
		c[i] = han1[2]+han2[d]+han3[d/4];
		else
			c[i] = han1[2]+han2[d];z = 0;
		break;
	case '3':
		if(d%4 == 0)
			c[i] = han1[3]+han2[d]+han3[d/4];
			else
				c[i] = han1[3]+han2[d];z = 0;
		break;
	case '4':
		if(d%4 == 0)
			c[i] = han1[4]+han2[d]+han3[d/4];
			else
				c[i] = han1[4]+han2[d];z = 0;
		break;
	case '5':
		if(d%4 == 0)
			c[i] = han1[5]+han2[d]+han3[d/4];
			else
				c[i] = han1[5]+han2[d];z = 0;
		break;
	case '6':
		if(d%4 == 0)
			c[i] = han1[6]+han2[d]+han3[d/4];
			else
				c[i] = han1[6]+han2[d];z = 0;
		break;
	case '7':
		if(d%4 == 0)
			c[i] = han1[7]+han2[d]+han3[d/4];
			else
				c[i] = han1[7]+han2[d];z = 0;
		break;
	case '8':
		if(d%4 == 0)
			c[i] = han1[8]+han2[d]+han3[d/4];
			else
				c[i] = han1[8]+han2[d];z = 0;
		break;
	case '9':
		if(d%4 == 0)
			c[i] = han1[9]+han2[d]+han3[d/4];
			else
				c[i] = han1[9]+han2[d];z = 0;
		break;
		
	}
	}
	for(int i = 0; i < a.length(); i++)
	System.out.print(c[i]);
	}
}
