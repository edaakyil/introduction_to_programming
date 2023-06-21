/*  June 15 2023 */

public class Main
{
	
	public static void main(String[] args) { }
  
	// Soru _ 1 ile 100 rasındaki 3'ün 4'ün ve 5'in katlarını ekrana iç içe yazdıran program
	// Açıklama _ 3 4 5 6 8 9 10 12 12 15 15 16 18 20 20 21 24 24 25 27 28 30 30 32 33 ...
        public static void soru1() {
                int i;
                
                for(i = 1; i <= 100; i++){
                        if(i % 3 == 0) 
                                System.out.print(i + " ");
                        if(i % 4 == 0) 
                                System.out.print(i + " ");
                        if(i % 5 == 0) 
                                System.out.print(i + " ");
                }
                
                // Aşağıdaki gibi sırası değiştirildiğnde Sonuç değişmez
                for(i = 1; i <= 100; i++){
                        if(i % 5 == 0) 
                                System.out.print(i + " ");
                        if(i % 4 == 0) 
                                System.out.print(i + " ");
                        if(i % 3 == 0) 
                                System.out.print(i + " ");
                }
        }
	
	// Soru _ 1 ile 100 rasındaki 3'ün 4'ün ve 5'in katlarını ekrana iç içe yazdıran program Ama sayı tekrarı olmayacak
	// Açıklama _ 3 4 5 6 8 9 10 12 15 16 18 20 21 24 25 27 28 30 32 33 ...
        public static void soru2() {
                int i;
                
                for(i = 1; i <= 100; i++)
                        if(i % 3 == 0) 
                                System.out.print(i + " ");  
                        else if(i % 4 == 0) 
                                System.out.print(i + " ");
                        else if(i % 5 == 0) 
                                System.out.print(i + " ");
                
                // Sonuç değişmez		
                for(i = 1; i <= 100; i++)
                        if(i % 5 == 0) 
                                System.out.print(i + " ");  
                        else if(i % 4 == 0) 
                                System.out.print(i + " ");
                        else if(i % 3 == 0) 
                                System.out.print(i + " ");
        }
		
	// Soru _ Fahrenheit cinsinden girilen sıcaklık değerinin Celcius karşılığını ekrana yazdıran program
        // C = 5 / 9 * (F - 32)
        public static void soru3() {
                java.util.Scanner kb = new java.util.Scanner(System.in);
                double f, c;
                
                System.out.print("Fahrenheit: ");
                f = kb.nextDouble();
                
                c = 5.0 / 9 * (f - 32);  // c = 5.0 / 9.0 * (f - 32);    // Tür dönüşümü
                System.out.print("Celcius:" + c); 
        }	
	
	// Soru _ n klavyeden girilen pozitif bir sayıdır. 1 den n ye kadar olan sayıların toplamını ekrana yazdıran program
        public static void soru4() {
                java.util.Scanner kb = new java.util.Scanner(System.in);
                int i, n, sum;
                
                System.out.print("n = ");
                n = kb.nextInt();
                
                sum = 0;
                
                for(i = 1; i <= n; i++)
                        sum += i;
                
                System.out.print("Toplam: " + sum); 
        }
		
	// Soru _ klavyeden girilen 5 sayıyı toplayan pogram
        public static void soru5() {
                java.util.Scanner kb = new java.util.Scanner(System.in);
                int i, n, sum;
                
                sum = 0;
                
                for(i = 0; i < 5; i++) {
                        System.out.print(i + ". sayı: ");
                        n = kb.nextInt();
                        sum += n;
                }
                
                System.out.print("Toplam: " + sum); 
        }


}

/*	a ile b arasındaki n'nin katlarını yazdırma:
		for(i = a + (5 - a % 5); i < b; i += 5)
      System.out.print(i + " ");
*/
