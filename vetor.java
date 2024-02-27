package tpa;
import java.util.Scanner;
public class vetor {
    public static void main(String[] args) {
    	
		Scanner in= new Scanner (System.in);
		 int[] vetor = {3,2,8,7,5,4};
		 
	        System.out.println("Itens no vetor e suas posições:");
	 
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.println("item " + "" + vetor[i] + " na Posição: " + i);
	        }
	    }
	}
