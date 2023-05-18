/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) 
	{
	    
	    calculateRectangleArea();

		// Soru 1 _ yarıçapı klavyeden girilen bir dairenin alanını hesaplayan program
		// area = π.r.r
		int radius;
		double pi, area;
		pi = 3.14;
		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Yarıçapı giriniz: ");
		radius = kb.nextInt();
		
		area = pi * radius * radius;
		System.out.println("Dairenin alanı = " + area);
		
	}
	
	public static void calculateRectangleArea() 
	{
	    java.util.Scanner kb = new java.util.Scanner(System.in);
		int height, width, area;
		
		System.out.print("Yüksekliği giriniz: ");
		height = kb.nextInt();
		
		System.out.print("Genişliği giriniz: ");
		width = kb.nextInt();
		
		area = height * width;
		System.out.println("Dikdörtgenin alanı = " + area);
	}

}

/*
1) soruyu yaz
2) açıklamayı takip et
3) soruyu gözden geçir
4) programı yaz
5) programı test et
6) programı hocaya gönder
*/


