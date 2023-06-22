/* June 22 2023 */

public class Main
{
  
        public static void main(String[] args) { }
  
        // Soru _ Klavyeden girilen sayıdan küçük dizi elemanlarını ekrana yazdıran program
	public static void soru1() {
	        java.util.Scanner kb = new java.util.Scanner(System.in);
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i, x, size;
	        size = 10;
	        
	        System.out.print("x = ");
	        x = kb.nextInt();
	         
	        for(i = 0; i < size; i++)
	                if(a[i] < x)
                                System.out.print(a[i] + " ");
	        
	}
        
        // Soru _ Klavyeden girilen sayıdan küçük ve tek olan dizi elemanlarını ekrana yazdıran program
	public static void soru2() {
	        java.util.Scanner kb = new java.util.Scanner(System.in);
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i, x, size;
	        size = 10;
	        
	        System.out.print("x = ");
	        x = kb.nextInt();
	        
	        for(i = 0; i < size; i++)
	                if(a[i] < x)
        	                if(a[i] % 2 != 0)
                                        System.out.print(a[i] + " ");
	        
	}
        
        // Soru _ Klavyeden girilen sayıdan küçük ve tek ve çift dizi elemanlarının toplamlarını ve adetlerini ekrana yazdıran program
	public static void soru3() {
	        java.util.Scanner kb = new java.util.Scanner(System.in);
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i, x, size, countOdd, countEven, sumOdd, sumEven;
	        size = 10;
	        countOdd = 0;
	        countEven = 0;
	        sumOdd = 0;
	        sumEven = 0;
	        
	        System.out.print("x = ");
	        x = kb.nextInt();
	        
	        for(i = 0; i < size; i++) 
	                if(a[i] < x) 
        	                if(a[i] % 2 != 0){
                                        countOdd++;
                                        sumOdd += a[i];
                                } else {
                                        countEven++;
                                        sumEven += a[i];
                                }
                                
                System.out.println("\nTek sayıların adedi: " + countOdd);
                System.out.println("Tek sayıların toplamı " + sumOdd);
                System.out.println("Çift sayıların adedi: " + countEven);
                System.out.println("Çift sayıların toplamı " + sumEven);
	    
	}
	
	// Soru _ Dizinin ortalamasından küçük olan dizi elemanlarını ekrana yazdıran program
	public static void soru4() {
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i, size, sum, avg;
	        size = 10;
	        sum = 0;
	        avg = 0;
	        
	        for(i = 0; i < size; i++) 
	                sum += a[i];
	                
                avg = sum / size;
	        
	        for(i = 0; i < size; i++) 
	                if(a[i] < avg) 
                                System.out.print(a[i] + " ");
	}
        
       // Soru _ Dizinin ilk yarısı ile ikinci yarısının toplamını ekrana yazdıran program
	public static void soru5() {
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i, size, sumFirst, sumSecond;
	        size = 10;
	        sum = 0;
	        sumFirst = 0;
	        sumSecond = 0;
	        
	        for(i = 0; i < size / 2; i++) {
                        sumFirst += a[i];
                        sumSecond += a[i + size / 2];
                }  
                
                System.out.println("İlk yarının toplamı: " + sumFirst);
                System.out.println("İkinci yarının toplamı: " + sumSecond);
                
	}
	
	// Soru _ Klavyeden girilen n adedi kadar Dizinin ilk elemanlarını ekrana yazdıran program
	public static void soru6() {
	        java.util.Scanner kb = new java.util.Scanner(System.in);
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i, n;
	        
	        System.out.print("n = ");
	        n = kb.nextInt();
	        
	        for(i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                }  
                
	}
	
	// Soru _ Dizinin son n adet elemanını baştan sona doğru yazdıran program
	public static void soru7() {
	        java.util.Scanner kb = new java.util.Scanner(System.in);
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i, n, size;
	        size = 10;
	        
	        System.out.print("n = ");
	        n = kb.nextInt();
	        
	        for(i = size - n; i < size; i++) 
                        System.out.print(a[i] + " ");
                
	}
	
	// Soru _ Dizinin son n adet elemanını sondan başa doğru yazdıran program
	public static void soru8() {
	        java.util.Scanner kb = new java.util.Scanner(System.in);
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i, n, size;
	        size = 10;
	        
	        System.out.print("n = ");
	        n = kb.nextInt();
	        
	        for(i = size - 1; i >= size - n; i--) 
                        System.out.print(a[i] + " ");
                
	}
        
}
