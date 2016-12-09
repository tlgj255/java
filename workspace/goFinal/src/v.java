import java.util.Scanner;
public class v {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
String a = sc.nextLine();
char b[] = a.toCharArray();
int c[] = new int [a.length()];
for(int i = 0; i < a.length(); i++)
switch(b[i]){
case 'A':
	c[i] = 10;
	break;
case 'B':
	c[i] = 11;
	break;
case 'C':
	c[i] = 12;
	break;
case 'D':
	c[i] = 13;
	break;
case 'E':
	c[i] = 14;
	break;
case 'F':
	c[i] = 15;
	break;
	default:
		c[i] = (int)b[i]-48;
		break;
}
for(int i = 0; i < a.length(); i++){
	System.out.print(chtwo(c[i]));
	System.out.print(" ");
}
}
public static String chtwo(int a){
	String go = "";
	while(a != 0){
		go = a%2+""+go;
		a /= 2;
	
	}
	while(true){
		if(go.length() == 4)break;
			go = "0"+go;
	}
	return go;
	
}
}
