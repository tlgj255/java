package encapsulation;
import java.util.Scanner;
public class input {
		public static void main(String[] args) {
			Scanner next = new Scanner(System.in);
			false_ fa = new false_();
			true_ tr = new true_();
			String ch;
			System.out.println("���� �Ͻ÷��� true ���߿� �Ͻ÷��� false\n�߰����� �����Ͻ÷��� enter�� �����ֽø� �ǿ�");
			ch = next.nextLine();
			if (ch.equals("true")) 
				tr.youFir();
			else if (ch.equals("false")) 	
				fa.comFir();
	}
}
