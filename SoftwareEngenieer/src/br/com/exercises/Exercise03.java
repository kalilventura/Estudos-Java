package br.com.exercises;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise03 {

	public static void main(String[] args) {
		int numeroMeiasParaLimpar = 2;
		ArrayList<Integer> meiasLimpar = popularMeiasLimpas();		
		ArrayList<Integer> meiasSujas = popularMeiasSujas();
		
		int resultado = paresDeMeias(numeroMeiasParaLimpar, meiasLimpar, meiasSujas);
		System.out.println(resultado);
	}

	public static int paresDeMeias(int numeroMeiasParaLavar, 
								   ArrayList<Integer> meiasLimpas, 
								   ArrayList<Integer> meiasSujas) {		
		
		ArrayList<Integer> meiasLavadas = new ArrayList<Integer>();

		ArrayList<Integer> meiasParaViagem = new ArrayList<Integer>();
		
		for (int i = 0; i < meiasSujas.size(); i++) {
			int meia = meiasSujas.get(i);
			
			if(meiasLimpas.contains(meia) && numeroMeiasParaLavar > 0)
			{
				meiasLavadas.add(new Integer(meia));
				numeroMeiasParaLavar--;
			}
		}
		
		Iterator<Integer> itr = meiasLimpas.iterator();
		while(itr.hasNext()) {
			Integer meia = itr.next();
			if(meiasLavadas.size() > 0 && meiasLavadas.contains(meia))
			{
				meiasParaViagem.add(new Integer(meia));
				
				meiasLavadas.remove(meia);
				itr.remove();
			}
		}
		
		for (int i = 0; i < meiasLimpas.size(); i++) {
			for (int j = i+1; j < meiasLimpas.size(); j++) {
				int a = meiasLimpas.get(i);
				int b = meiasLimpas.get(j);
				if(a == b)
				{
					meiasParaViagem.add(a);
					meiasLimpas.remove(new Integer(i));
					meiasLimpas.remove(new Integer(j));
				}
			}
		}
		
		return meiasParaViagem.size();
	}
	
	public static ArrayList<Integer> popularMeiasLimpas(){
		ArrayList<Integer> meiasLimpas = new ArrayList<Integer>();
		
		meiasLimpas.add(1);
		meiasLimpas.add(2);
		meiasLimpas.add(1);
		meiasLimpas.add(1);
		
		return meiasLimpas;
	}
	
	public static ArrayList<Integer> popularMeiasSujas(){
		ArrayList<Integer> meiasSujas = new ArrayList<Integer>();
		
		meiasSujas.add(1);
		meiasSujas.add(4);
		meiasSujas.add(3);
		meiasSujas.add(2);
		meiasSujas.add(4);
		
		return meiasSujas;
	}

}

