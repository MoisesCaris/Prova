package prova;

public class e2 {
	public static void main(String[] args) {
		double salario = 1000, salario2 = salario + (0.015 * salario);
		int ano = 1997;
		float por = (float) 0.015;
		while (ano != 2023){
			por = por * 2;
			salario2 = salario2 + (por * salario2);
			ano++;

		}
		System.out.println("O salario final foi de:" + salario2);
	}
}