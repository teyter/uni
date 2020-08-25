public class Div7 {
	public static void main(String[] args) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			boolean seven = (a % 7 == 0);
			boolean alsoseven = (b % 7 == 0);
			System.out.println(seven);
			System.out.println(alsoseven);
	}
}
