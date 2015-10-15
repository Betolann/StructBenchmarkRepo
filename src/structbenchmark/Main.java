package sort;
/**
 * Creacion clase Main
 * @author Roberto y Antony 
 * @version 08.10.2015
 */

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Atributos del array aleatorio y las busquedas
		int inicio = 1;
		int fin = 100;
		int tamaño = 100;
		
		
		// Prueba de QuickSort
		int arreglo[] = arrayAleatorio.llenarArrayAleatorio(inicio, fin, tamaño);
		long inicialQS = System.nanoTime();
		QuickSort.quicksort(arreglo, 0, tamaño - 1);
		long finalQS = System.nanoTime();
		long duracionQS = (finalQS - inicialQS);
		System.out.println("QuickSort: "+ Arrays.toString(arreglo)+ "; Duracion: "+ duracionQS);

		//Prueba de InsertionSort
		int arreglo2[] = arrayAleatorio.llenarArrayAleatorio(inicio, fin, tamaño);
		long inicialIS = System.nanoTime();
		InsertionSort.insertionsort(arreglo2);
		long finalIS = System.nanoTime();
		long duracionIS = (finalIS - inicialIS);
		System.out.println("InsertionSort: "+ Arrays.toString(arreglo2)+ "; Duracion: "+ duracionIS);

		//Prueba de MergeSort
		int arreglo3[] = arrayAleatorio.llenarArrayAleatorio(inicio, fin, tamaño);
		long inicialMS = System.nanoTime();
		int[] mergesort = MergeSort.mergesort(arreglo3);
		long finalMS = System.nanoTime();
		long duracionMS = (finalMS - inicialMS);
		System.out.println("MergeSort: "+ Arrays.toString(mergesort)+ "; Duracion: "+ duracionMS);
		
		//Prueba de BubbleSort
		int arreglo4[] = arrayAleatorio.llenarArrayAleatorio(inicio, fin, tamaño);
		long inicialBS = System.nanoTime();
		BubbleSort.bubblesort(arreglo4);
		long finalBS = System.nanoTime();
		long duracionBS = (finalBS - inicialBS);
		System.out.println("BubbleSort: "+ Arrays.toString(arreglo4)+ "; Duracion: "+ duracionBS);
		
		//Prueba de SelectionSort
		int arreglo5[] = arrayAleatorio.llenarArrayAleatorio(inicio, fin, tamaño);
		long inicialSS = System.nanoTime();
		BubbleSort.bubblesort(arreglo5);
		long finalSS = System.nanoTime();
		long duracionSS = (finalSS - inicialSS);
		System.out.println("SelectionSort: "+ Arrays.toString(arreglo5)+ "; Duracion: "+ duracionSS);
		
		// Prueba de HeapSort
		int arreglo6[] = arrayAleatorio.llenarArrayAleatorio(inicio, fin, tamaño);
		long inicialHS = System.nanoTime();
        HeapSort.HeapSort(arreglo6);
		long finalHS = System.nanoTime();
		long duracionHS = (finalHS - inicialHS);
		System.out.println("HeapSort | Duracion: "+ duracionHS +"; "+ Arrays.toString(arreglo6));
		
		
		//Arreglo para algoritmo LinearSearch 
		int arreglo7[] = arrayAleatorio.llenarArrayAleatorio(inicio, fin - 1, tamaño);
		//Los casos para LinearSearch
		int mejorCL = 0;
		int peorCL = fin - 1;
		int promedioCL = fin/2;
		int busqueda = fin;
		arreglo7[promedioCL] = fin;
		//Prueba del LinearSearch
		long inicialLS = System.nanoTime();
		int busquedaLineal = LinearSearch.linearsearch(arreglo7, busqueda);
		long finalLS = System.nanoTime();
		long duracionLS = (finalLS - inicialLS);
		System.out.println("LinearSearch: El numero "+ busqueda +" se encuentra en la posicion "+ busquedaLineal + " ; Duracion: "+ duracionLS);
		
		//Los casos para BinarySearch
		int mejorCB = fin/2;
		int peorCB = fin - 1;
		int promedioCB = fin/4;
		int valor = (arreglo[promedioCB] + 1);
		arreglo[promedioCB] = valor;
		// Prueba del BinarySearch
		long inicialBiS = System.nanoTime();
		int busquedaBinaria = BinarySearch.binarysearch(arreglo, valor);
		long finalBiS = System.nanoTime();
		long duracionBiS = (finalBiS - inicialBiS);
		System.out.println("BinarySearch: El numero "+ valor +" se encuentra en la posicion "+ busquedaBinaria + " ; Duracion: "+ duracionBiS);

		
	}
	
}

