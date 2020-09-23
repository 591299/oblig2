package no.hvl.dat100.lab6.matriser;

import static javax.swing.JOptionPane.showMessageDialog;

public class Matriser {

	
	
	//Oppg3a
	public static void main(String[] args) {
	    int[][] m = {{1,2,3},
	                {4,5,6},
	                {7,8,9}};
	    skrivUtv1(m);
	  }
public static void skrivUtv1(int[][] matrise) {
	    String svar = "";
	    for (int i=0; i<matrise.length; i++) {
	      for (int j=0; j<matrise.length; j++)
	        svar += matrise[i][j] + " ";
	        svar += "\n";
	    }
	    System.out.println(svar);
	  }
	}



//Oppg3b
public static String tilStreng(int[][] mat1) {
for (int i = 0; i < mat1.length; i++) {
for (int j = 0; j < mat1[i].length; j++) {
    System.out.print(mat1[i][j] + " ");
}
System.out.println();
}
return null;
}



//Oppg3c
private static int[][] skaler(int tall, int[][] matrise) {
int[][] nyMatrise = new int[matrise.length][];
for (int i = 0; i < matrise.length; i++) {
    nyMatrise[i] = new int[matrise[i].length];
    System.out.print("\n");
    for (int j = 0; j < matrise[i].length; j++) {
        nyMatrise[i][j] = matrise[i][j] * tall;
        System.out.print(nyMatrise[i][j] + "   ");
    }
}
return nyMatrise;
}




//Oppg3d
public static boolean erLik(int[][] mat1, int[][] mat2) {
boolean lik = true;
int rad1 = mat1.length;
int kol1 = mat1[0].length;
int rad2 = mat2.length;
int kol2 = mat2[0].length;
if (rad1 != rad2 || kol1 != kol2) {
lik = false;
}
else {
for (int i = 0; i < rad1; i++) {
	for (int j = 0; j < kol1; j++) {
		if (mat1[i][j] != mat2[i][j]) {
			lik = false;
			break;
		}
	}
}
}
return lik;
}



//Oppg3e
public static void main(String[] args) {
int[][] m = {{1,2,3},
    {4,5,6},
    {7,8,9}};

String utTxt = "Matrise:" + "\n" + skriv(m) + "\n";
speile(m);
utTxt += "Speilet matrise:" + "\n" + skriv(m);
showMessageDialog(null, utTxt);
}
public static int[][] speile(int [][] matrise) {
int x = 0;
for (int i=0; i<matrise.length; i++)
for (int j=0; j<i; j++) {
x = matrise[i][j];
matrise[i][j] = matrise[j][i];
matrise[j][i] = x;
}
return null;
}
public static String skriv(int[][] tab) {
String txt = "";
for (int i=0; i<tab.length; i++) {
for (int j=0; j<tab.length; j++)
txt += tab[i][j] + "  ";
txt += "\n";
}
return txt;
}
}
