/* July 06 2023 */

public class Main
{

	public static void main(String[] args) { }
        
        // Soru _ Dizinin ilk n elemanını dizinin sonuna olduğu gibi yerleştiren ve dizinin diğer elemanlarını dizinin n kadar dizinin başına kaydıran program
        // n _ Klavyeden girilen bir değerdir
	public static void soru1() {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i,  n, size;
		size = 10;
		
		System.out.print("n = ");
		n = kb.nextInt();
		
		int b[] = new int[n];
		
		for(i = 0; i < n; i++)
		        b[i] = a[i];
		
		for(i = n; i < size; i++)
		        a[i - n] = a[i];
		        
		for(i = 0; i < n; i++)
		        a[size - n + i] = b[i];
		
		for(i = 0; i < size; i++) 
		        System.out.print(a[i] + " ");
		
	}

        // Soru _ Klavyeden p ve n giriliyor. Dizinin p nolu elemanından başlayarak n adet elemanını kendi içinde bir öne kaydıran program
	public static void soru2() {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, s,  n, temp, size;
		size = 10;
		
		System.out.print("s = ");
		s = kb.nextInt();
		
		System.out.print("n = ");
		n = kb.nextInt();
		
	        temp = a[s];
		        
		for(i = s + 1; i < s + n; i++)
		        a[i - 1] = a[i];

	        a[s + n - 1] = temp;
	        
		for(i = 0; i < size; i++) 
		        System.out.print(a[i] + " ");
		
	}

        // Soru _ a dizisini b dizisine ters atayan program
	public static void soru3() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int b[] = new int[10];
		int i, size;
		size = 10;
		
		for(i = 0; i < size; i++)
		        b[i] = a[size - 1 - i];
		        
		for(i = 0; i < size; i++) 
		        System.out.print(b[i] + " ");
		
	}

        // Soru _ a dizisini kendi içinde tersine çeviren program
	public static void soru4() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, temp, size;
		size = 10;
		
		for(i = 0; i < size / 2; i++) {
	        	temp = a[i];
		        a[i] = a[size - 1 - i];
		        a[size - 1 - i] = temp;
		 }      
		 
		for(i = 0; i < size; i++) 
		        System.out.print(a[i] + " ");
		
	}

        // ✨💯 Soru _ klavyeden s ve n giriliyor. Dizinin s nolu elemanından başlayarak n adet elemanı kendi içinde tersine çeviren program.
	public static void soru5() {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, s, n, temp, size;
		size = 10;
		
		System.out.print("s = ");
		s = kb.nextInt();
		
		System.out.print("n = ");
		n = kb.nextInt();
		
		for(i = 0; i < n / 2; i++) {
	        	temp = a[s + i];
		        a[s + i] = a[s + n - 1 - i];
		        a[s + n - 1 - i] = temp;
		 }      
		 
		for(i = 0; i < size; i++) 
		        System.out.print(a[i] + " ");
		
	}
	
}
