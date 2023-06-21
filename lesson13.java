/* June 21 2023 */

public class Main
{
        
	public static void main(String[] args) {
	        
                // Dizi oluşturma _ Yöntem 1
	        // Dizi tanımlama 
	        int a[] = new int[5];  // veri tipi `int` olan `5` elemanlı bir dizi. Bu dizi için bellekte 20 (4 bytee * 5) byte'lık yer tutulur
                
                // Dizinin elemanlarına değer atama:
                a[0] = 7;
                a[1] = 8;
                a[4] = a[0] + a[1];
                
                int n = 2;
                a[n] = 12;
                a[n + 1] = 14;
                
                // Örnek
                int b[] = new int[7];
                int i;
                
                for (i = 0; i < 7; i++) 
                        b[i] = 7;
                        
                for(i = 0; i < 7; i++)
                        System.out.print(b[i] + " ");
                
                // Dizi oluşturma _ Yöntem 2
	        int c[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        
	}
        
        // Soru _ 5 elemanlı a[] dizisini 2 den başlayan çift sayıları değer olarak atlayan program
        // Açıklama _ 2 4 6 8 10
	public static void soru1() {
	        
	      int a[] = new int[5];  
              int i;
                
                for (i = 0; i < 5; i++) 
                        a[i] = (i + 1) * 2;  
                
                for(i = 0; i < 5; i++)
                        System.out.print(a[i] + " ");
	        
	}
        
        // Soru _ Dizinin elemanlarının toplamını ekrana yazdıran program
	public static void soru2() {
	        
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i , sum;
	        
	        sum = 0;
	        for(i = 0; i < 10; i++)
	                sum += a[i];
	                
                System.out.print("Toplam: " + sum);
	}
	
	// Soru _ Dizinin elemanlarının toplamını ve ortalamasını ekrana yazdıran program
	public static void soru3() {
	        
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i , sum, avg, size;
		
		size = 10;
	        sum = 0;

	        for(i = 0; i < 10; i++)
	                sum += a[i];
	                
	         av = sum / i ;  
		// av = sum / size;
	         
                System.out.println("Toplam = " + sum);
                System.out.println("Ortalama = " + av);
	}
	
	// Soru _ Dizindeki tek sayıları ekrana yazdıran program
	public static void soru4() {
	        
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i, size;
	        size = 10;
	        
	        for(i = 0; i < size; i++)
        	        if(a[i] % 2 != 0)
                                System.out.println(a[i] + " ");
	                
	}
	
	// Soru _ Dizindeki tek sayıları ve tek sayıların adedini ekrana yazdıran program
	public static void soru5() {
	        
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i, size, m;
	        size = 10;
	        
	        m = 0;
	        for(i = 0; i < size; i++)
        	        if(a[i] % 2 != 0) {
                                System.out.print(a[i] + " ");
                                m ++;
	                }
                System.out.println( "\nTek sayıların adedi: " + m);
	}
	
	// Soru _ Dizindeki tek sayıları, tek sayıların adedini, toplamını ve ortalamasını ekrana yazdıran program
	public static void soru6() {
	        
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i, size, count, sum, avg;
	        
	        size = 10;
	        count = 0;
	        sum = 0;
	        
	        for(i = 0; i < size; i++)
        	        if(a[i] % 2 != 0) {
                                System.out.print(a[i] + " ");
                                sum += a[i];
                                count++;
	                }
	                
                avg = sum / count;
                
                System.out.println( "\nTek sayıların adedi: " + count);
                System.out.println( "Tek sayıların toplamı: " + sum);
                System.out.println( "Tek sayıların otalaması: " + avg);
	}
	
	        // Soru _ Klavyeden x ve y giriliyor. x < y olduğu kabul ediliyor. x'ten küçük y'den büyük dizi elemanlarını ekrana yazdıran program
	public static void soru7() {
	        java.util.Scanner kb = new java.util.Scanner(System.in);
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i, x, y, size;
	        size = 10;
	        
	        System.out.print("x = ");
	        x = kb.nextInt();
	        
	        System.out.print("y = ");
	        y = kb.nextInt();
	        
	         
	        for(i = 0; i < size; i++) 
	                if(a[i] > x)
	                        if(a[i] < y)
                                System.out.print(a[i] + " ");
	        
	}
	
        // Soru _ Klavyeden x ve y giriliyor. x < y olduğu kabul ediliyor. 
        // x'ten küçük dizi elemanları ile y'den büyük dizi elemanlarını ekrana yazdıran program
	public static void soru8() {
	        java.util.Scanner kb = new java.util.Scanner(System.in);
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int i, x, y, size;
	        size = 10;
	        
	        System.out.print("x = ");
	        x = kb.nextInt();
	        
	        System.out.print("y = ");
	        y = kb.nextInt();
	        
	         
	        for(i = 0; i < size; i++) {
	                if(a[i] < x)
                                System.out.print(a[i] + " ");
                        else if(a[i] > y)
                                System.out.print(a[i] + " ");
	        }
	}
	
}
