package encapsulation;

import java.util.Random;

public class main {
	private int num1, num2;

	public static void main(String[] args) {
		Random b = new Random();
		Random a = new Random();
		main main = new main();
		main.setnum1(b.nextInt(6) + 1);
		main.setnum2(a.nextInt(6) + 1);
		main.result();
	}
	private int getnum1() {
		return num1;
	}
	private void setnum1(int num1) {
		this.num1 = num1;
	}
	private int getnum2() {
		return num2;
	}
	private void setnum2(int num2) {
		this.num2 = num2;
	}
	private void result() {
		if (num1 == num2)
			System.out.println("鼠蝓睡 player1高 " + num1 + " player2高 " + num2);
		else if (num1 < num2)
			System.out.println("player2蝓 player1高 " + num1 + " player2高 " + num2);
		else if (num1 > num2)
			System.out.println("player1蝓 player1高 " + num1 + " player2高 " + num2);
	}
}