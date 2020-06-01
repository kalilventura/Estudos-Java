package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 10;

		System.out.println(monstro.vida);
		System.out.println(heroi.vida);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
	}
}
