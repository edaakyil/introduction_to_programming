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
        
        
}
