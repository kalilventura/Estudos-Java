package fundamentos;

public class ConversaoTipos {
	public static void main(String[] args) {
		// Obs: Pode ocorrer perda de dados
		double a = 1;
		float b = (float) 1.646523232332;
		int c = 130;
		byte d = (byte) c;
		double e = 1.98656;
		int f = (int) e;
		
		// Conversao para string
		String g = Integer.toString(c);
		
		// Conversao de string para numero
		String h = "123456";
		int p = Integer.parseInt(h);
	}
}
