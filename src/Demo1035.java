import java.util.Scanner;

public class Demo1035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		if(k<0)
			return;
		String[][] pwd = new String[k][2];
		for (int i = 0; i < k; i++) {
			pwd[i][0] = sc.next();
			pwd[i][1] = sc.next();
		}
		sc.close();
		boolean[] flag = new boolean[k];
		int number = 0;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < pwd[i][1].length(); j++) {
				char c = pwd[i][1].charAt(j);
				if (c == 'l') {
					pwd[i][1]=pwd[i][1].replace("l", "L");
					flag[i] = true;
				} else if (c == 'O') {
					pwd[i][1] = pwd[i][1].replace("O", "o");
					flag[i] = true;
				} else if (c == '1') {
					pwd[i][1] = pwd[i][1].replace("1", "@");
					flag[i] = true;
				} else if (c == '0') {
					pwd[i][1] = pwd[i][1].replace("0", "%");
					flag[i] = true;
				}
			}
			if (flag[i])
				number++;
		}
		if (number == 0) {
			System.out.println("There is " + k + " account and no account is modified");
			return;
		}
		System.out.println(number);
		for (int i = 0; i < k; i++) {
			if (flag[i]) {
				System.out.println(pwd[i][0] + " " + pwd[i][1]);
			}
		}

	}

}