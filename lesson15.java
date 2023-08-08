/* July 05 2023 */

public class Main
{
	public static void main(String[] args) { }

        // Soru _ Dizinin ilk n elemanını dizinin sonuna atayan, baştaki elemanları sıfırlayan program.
        // n -> klavyeden girilen bir değerdir
	public static void soru1() {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i,  n, size;
		size = 10;
		
		System.out.print("n = ");
		n = kb.nextInt();
		
		for(i = 0; i < n; i++)
		        a[(size - 1) - i] = a[(n - 1) - i];

		// my comment
		// for(i = 0; i < n; i++) 
		//         a[i + size - n] = a[i];
		
		for(i = 0; i < size - n; i++)
		        a[i] = 0;
		
		for(i = 0; i < size; i++) 
		        System.out.print(a[i] + " ");
		
	}

        // Soru _ Dizinin elemanlarınnı bir öne (bir basamak sola) kaydıran ve dizinin ilk elemanını dizinin sonuna atayan program.
	public static void soru2() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i,  n, size, temp;
		size = 10;
		temp = a[0];
		
		for(i = 1; i < size; i++)
		        a[i - 1] = a[i];
		
		a[size - 1] = temp;
		
		for(i = 0; i < size; i++) 
		        System.out.print(a[i] + " ");
		
	}

        // Soru _ Dizinin elemanlarınnı n defa öne (bir basamak sola) kaydıran ve dizinin ilk elemanını dizinin sonuna atayan program.
        // n -> klavyeden girilen bir değerdir
	public static void soru3() {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, k,  n, size, temp;
		size = 10;
		
		System.out.print("n = ");
		n = kb.nextInt();
		
		for(k = 1; k <= n; k++) {
        		temp = a[0];
        		for(i = 1; i < size; i++)
        		        a[i - 1] = a[i];
        		a[size - 1] = temp;
		}
		
		for(i = 0; i < size; i++) 
		        System.out.print(a[i] + " ");
		
	}

        // ---- !!!! CLEAN CODE -----
        //!! diziyi mod alarak n defa sola doğru kaydırır böylelikle bilgisayarı gereksiz yere çalıştırmamış oluyorsun
        // Soru _ Dizinin elemanlarınnı n defa öne (bir basamak sola) kaydıran ve dizinin ilk elemanını dizinin sonuna atayan program.
        // n -> klavyeden girilen bir değerdir
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, k,  n, size, temp;
		size = 10;
		
		System.out.print("n = ");
		n = kb.nextInt();
		
		for(k = 1; k <= n % size; k++) {
        		temp = a[0];
        		for(i = 1; i < size; i++)
        		        a[i - 1] = a[i];
        		a[size - 1] = temp;
		}
		
		for(i = 0; i < size; i++) 
		        System.out.print(a[i] + " ");
		
	}
}
