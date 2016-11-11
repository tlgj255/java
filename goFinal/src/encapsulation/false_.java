package encapsulation;

import java.util.Random;
import java.util.Scanner;

class false_{
	final static int FINAL = 100;
	public void comFir(){
		you y = new you();
		com c = new com();
		Scanner next = new Scanner(System.in);
		Random a = new Random();
		int b = a.nextInt(6)+1,totyou = 0,totcom = 0,d = 1,e = 1,rules[] = new int [FINAL];
		rules[0] = 38; rules[3] = 14; rules[10] = 31; rules[15] = 6; rules[20] = 42; rules[27] = 84;
		rules[35] = 44; rules[46] = 26; rules[48] = 11; rules[50] = 67; rules[55] = 53; rules[61] = 19;
		rules[63] = 60; rules[70] = 91; rules[79] = 100; rules[92] = 73; rules[93] = 75; rules[97] = 78;
		String ch;
		while(true){
			b = a.nextInt(6)+1;
			c.setcom(b);
			totcom += c.getcom();
			System.out.println("현재 컴퓨터 위치"+totcom);
			if(totcom >=100){
				System.out.println("컴퓨터 승");
				break;
			}else if(rules[totcom-1] !=0 ){
				if(rules[totcom-1]<totcom)
					System.out.println(rules[totcom-1]+"(으)로 미끌어 집니다. 쿵!!");
				else 
					System.out.println(rules[totcom-1]+"(으)로 올라갑니다. 슝!!");
				totcom = rules[totcom-1];
				System.out.println("현재 컴퓨터의 위치"+totcom);
			}
			ch = next.nextLine();
			b = a.nextInt(6)+1;
			y.setyou(b);
			totyou += y.getyou();
			System.out.println("현재 당신의 위치"+totyou);
			if(totyou >=100){
				System.out.println("플레이어 승");
				break;
			}else if(rules[totyou-1] !=0 ){
				if(rules[totyou-1]<totyou)
					System.out.println(rules[totyou-1]+"(으)로 미끌어 집니다. 쿵!!");
				else 
					System.out.println(rules[totyou-1]+"(으)로 올라갑니다. 슝!!");
				totyou = rules[totyou-1];
				System.out.println("현재 당신의 위치"+totyou);
			}
			ch = next.nextLine();
		}
	}
	}