package encapsulation;
import java.util.Scanner;
public class input {
		public static void main(String[] args) {
			Scanner next = new Scanner(System.in);
			false_ fa = new false_();
			true_ tr = new true_();
			String ch;
			System.out.println("먼저 하시려면 true 나중에 하시려면 false\n추가설명 진행하시려면 enter를 눌러주시면 되요");
			ch = next.nextLine();
			if (ch.equals("true")) 
				tr.youFir();
			else if (ch.equals("false")) 	
				fa.comFir();
	}
}
