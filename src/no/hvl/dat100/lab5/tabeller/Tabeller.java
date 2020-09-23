package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	
	
	//Oppg6a	
		public static void skrivUt (int[] tabell) {
			for (int i=0; i<tabell.length;i++) {
			System.out.println(tabell[i]);
			}		
			}
		
		
		//Oppg6b
		public static String tilStreng (int[] tabell) {
			System.out.print("[");
			String s = Integer.toString(tabell[0]) + "," + tabell[1] + "," + tabell[2];
			System.out.print(s);
			System.out.print("]");
			return null;
			}
		
		
		//Oppg6c
		public static int summer(int[] tabell) {
			// Vanlig for løkke
			int sum = 0;
			for(int i = 0; i<tabell.length; i++) {
			sum+=tabell[i];
			}
			return sum;
			// Utvidet for løkke
				sum = 0;
				for(int i : tabell) {
				sum+= i;
				}
				return sum;
			// While løkke
				int i = 0;
				sum = 0;
				while (i < tabell.length) {
				sum += tabell[i];
				i++;
				}
				return sum;
			}
		
		
		//Oppg6d
		public static boolean finnesTall(int[] tabell, int tall) {
			boolean funnet = false;
			for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
			funnet = true;
			}
			}
			return funnet;
			}
		
		
		//Oppg6e
		public static int posisjonTall(int[] tabell, int tall) {
			int pos = -1;
			for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
			pos = i;
			break;
			}
			}
			return pos;
			}
		
		
		//Oppg6f
		public static int [] reverser(int[] tabell) {
			int v = 0;
			int h = tabell.length-1;
			while(v<h) {
				int r = tabell[v];
				tabell[v]=tabell[h];
				tabell[h]=r;
				v++;
				h--;
			}
			return tabell;
			}
			
		
		//Oppg6g
		public static boolean erSortert (int[] tabell) {
			boolean sortert = true;
			int i = 1;
			while (sortert && i<tabell.length) {
			if (tabell[i-1] <= tabell[i])
			i++;
			else
			sortert = false;
			}
			return sortert;
		}
		
		
		//Oppg6h
		public static int [] samle(int[] tabA, int[] tabB) {
			int nyLengde = tabA.length + tabB.length;
			int[] nyTab = new  int[nyLengde];
			for (int i=0; i<tabA.length; i++) {
			nyTab[i] = tabA[i];
			}
			for (int j=0; j<tabB.length; j++) {
			nyTab[tabA.length+j] = tabB[j];
			}
			return nyTab;
		}		
		}
