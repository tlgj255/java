package goFinal;
import java.util.Scanner;	
public class _1 {
public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	
	String b = a.nextLine();
	
	int c = 0,same[] = new int [b.length()],d = 0,i = 0,f = 0;
	
	char ch[] = new char [b.length()];
	
	for(c = 0; c<b.length(); c++){
		
	ch = b.toCharArray();
	
	System.out.print(ch[c]+" ");
	
	}
	
	same[d] = 1;
	
	System.out.println(b.length());
	
	for(i = 0; i < b.length()-1; i++){
		
		System.out.println(""+ch[i]+ch[i+1]);
		
		if(ch[i] ==ch[i+1]){
			
		same[d] +=1;
		
		System.out.println("d++"+same[d]);
	
	}else if(ch[i] !=ch[i+1]){
		
		d++;
		
		same[d] = 1;
		System.out.println(d);
		
	}
	}
	f = d+1;
	d = 0 ;
	System.out.println("");
	i = 0;
	for(d = 0; d<f;d++){
				System.out.print(""+ch[i]+same[d]);
			i += same[d];
	
	}
	}
}
