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
			System.out.println("���� ��ǻ�� ��ġ"+totcom);
			if(totcom >=100){
				System.out.println("��ǻ�� ��");
				break;
			}else if(rules[totcom-1] !=0 ){
				if(rules[totcom-1]<totcom)
					System.out.println(rules[totcom-1]+"(��)�� �̲��� ���ϴ�. ��!!");
				else 
					System.out.println(rules[totcom-1]+"(��)�� �ö󰩴ϴ�. ��!!");
				totcom = rules[totcom-1];
				System.out.println("���� ��ǻ���� ��ġ"+totcom);
			}
			ch = next.nextLine();
			b = a.nextInt(6)+1;
			y.setyou(b);
			totyou += y.getyou();
			System.out.println("���� ����� ��ġ"+totyou);
			if(totyou >=100){
				System.out.println("�÷��̾� ��");
				break;
			}else if(rules[totyou-1] !=0 ){
				if(rules[totyou-1]<totyou)
					System.out.println(rules[totyou-1]+"(��)�� �̲��� ���ϴ�. ��!!");
				else 
					System.out.println(rules[totyou-1]+"(��)�� �ö󰩴ϴ�. ��!!");
				totyou = rules[totyou-1];
				System.out.println("���� ����� ��ġ"+totyou);
			}
			ch = next.nextLine();
		}
	}
	}