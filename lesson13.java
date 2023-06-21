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
	        int i , sum, av;
	        
	        sum = 0;
	        for(i = 0; i < 10; i++)
	                sum += a[i];
	                
	         av = sum / i ;
	         
                System.out.println("Toplam = " + sum);
                System.out.println("Ortalama = " + av);
	}
	
}
