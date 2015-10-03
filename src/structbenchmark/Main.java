package sort;

public class Main {

	public static void main(String[] args) {
		
		{int []arreglo = {5, 4, 2,67, 988, 67, 45, 345, 8764, 223, 9887};
		BubbleSort x = new BubbleSort();
		x.OrdenarBurbuja(arreglo);
		long t1 = System.nanoTime(); 
		for(int i=0; i<arreglo.length; i++){
			//System.out.println(arreglo[i]);
			
		}
		long t2 = System.nanoTime(); 
		System.out.println ("N: " + arreglo.length + "  " + "Ha tardado " + (t2-t1) + "nanosegundos	");}
		
		{int []arreglo2 = {5, 11, 12,7, 67, 87, 45, 12, 3, 4, 2,67, 988, 67, 45, 345, 8764, 223, 9887, 6, 7, 8, 5, 23, 2,43, 54, 65, 76, 45, 34, 56, 6};
		BubbleSort x2 = new BubbleSort();
		x2.OrdenarBurbuja(arreglo2);
		long t3 = System.nanoTime(); 
		for(int i=0; i<arreglo2.length; i++){
			//System.out.println(arreglo2[i]);
			
		}
		long t4 = System.nanoTime(); 
		
		System.out.println ("N: "+ arreglo2.length + "  " + "Ha tardado " + (t4-t3) + "nanosegundos	");}
		
		{int []arreglo3 = {5, 11, 12,7, 67, 87, 45, 12, 3, 4, 2,67, 988, 67, 45, 345, 8764, 223, 9887, 6, 7, 8, 5, 23, 2,43, 54, 65, 76, 54776, 344567, 12, 664, 8956, 2323, 45, 34, 56, 6};
		BubbleSort x3 = new BubbleSort();
		x3.OrdenarBurbuja(arreglo3);
		long t5 = System.nanoTime(); 
		for(int i=0; i<arreglo3.length; i++){
			//System.out.println(arreglo2[i]);
			
		}
		long t6 = System.nanoTime(); 
		
		System.out.println ("N: "+ arreglo3.length + "  " + "Ha tardado " + (t6-t5) + "nanosegundos	");}
		
		{int []arreglo4 = {5, 11, 12,7, 67, 87, 45, 12, 67, 34, 56, 867, 23213, 67878, 3434, 76, 9, 1, 90, 54, 13, 87, 3, 4, 2,67, 988, 67, 45, 345, 8764, 223, 9887, 6, 7, 8, 5, 23, 2,43, 54, 65, 76, 54776, 344567, 12, 664, 8956, 2323, 45, 34, 56, 6};
		BubbleSort x4 = new BubbleSort();
		x4.OrdenarBurbuja(arreglo4);
		long t7 = System.nanoTime(); 
		for(int i=0; i<arreglo4.length; i++){
			//System.out.println(arreglo2[i]);
			
		}
		long t8 = System.nanoTime(); 
		
		System.out.println ("N: "+ arreglo4.length + "  " + "Ha tardado " + (t8-t7) + "nanosegundos	");}
		
		{int []arreglo5 = {5, 11, 12,7, 67, 87, 45, 12, 67, 34, 56, 867, 23213, 435, 734323, 7655634, 877856, 23425, 67878, 3434, 76, 9, 1, 90, 54, 13, 87, 3, 4, 2,67, 988, 67, 45, 345, 8764, 223, 9887, 6, 7, 8, 5, 23, 2,43, 54, 65, 76, 54776, 344567, 12, 664, 8956, 2323, 45, 34, 56, 6};
		BubbleSort x5 = new BubbleSort();
		x5.OrdenarBurbuja(arreglo5);
		long t9 = System.nanoTime(); 
		for(int i=0; i<arreglo5.length; i++){
			//System.out.println(arreglo2[i]);
			
		}
		long t10 = System.nanoTime(); 
		
		System.out.println ("N: "+ arreglo5.length + "  " + "Ha tardado " + (t10-t9) + "nanosegundos	");}
		
	}

}


