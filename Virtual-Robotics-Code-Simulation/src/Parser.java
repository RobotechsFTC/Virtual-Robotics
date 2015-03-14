import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Parser {
	public static String output = "";
	public static long tokenNum = 0;

	public static void tokenizer(String s) {
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			generateOutput(st.nextToken());
		}
	}

	public static void generateOutput(String token) {
		tokenNum++;
		String nol = "";// next output line
		if (token.startsWith("moveFwd(") && token.endsWith(");")) {
			String amount = "";
			for (int i = 8; i < token.length() - 2; i++) {
				amount += token.toCharArray()[i];
			}
			nol += "Move forward " + amount + " units.\n";
		} else if (token.startsWith("moveBck(") && token.endsWith(");")) {
			String amount = "";
			for (int i = 8; i < token.length() - 2; i++) {
				amount += token.toCharArray()[i];
			}
			nol += "Move backward " + amount + " units.\n";
		} else if (token.startsWith("turnRt(") && token.endsWith(");")) {
			String amount = "";
			for (int i = 7; i < token.length() - 2; i++) {
				amount += token.toCharArray()[i];
			}
			nol += "Turn right " + amount + " degrees.\n";
		} else if (token.startsWith("turnLt(") && token.endsWith(");")) {
			String amount = "";
			for (int i = 7; i < token.length() - 2; i++) {
				amount += token.toCharArray()[i];
			}
			nol += "Turn left " + amount + " degrees.\n";
		} else {
			JOptionPane
					.showMessageDialog(
							null,
							"Error on token "
									+ tokenNum
									+ "\n'"
									+ token
									+ "' does not fit the list of commands.\n Make sure you have a semi-colon at the end of the line.",
							"Error", JOptionPane.ERROR_MESSAGE);
		}
		System.out.println(nol);
	}

	public static void main(String[] args) {
		tokenizer("moveFwd(69); turnRt(72); turnLt(72);");
	}
}
