package simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class algoritmo5 {
	
	public static void main(String[] args) {
	List<Integer> listaaleatorios = new ArrayList();
	
	for(int i=0;i<=800 // cantidad de elementos ;i++){
		listaaleatorios.add(i);
		
	
	}
	
	long seed = System.nanoTime();
	Collections.shuffle(listaaleatorios, new Random(seed));
	System.out.println(listaaleatorios);
	
	}
	
}
