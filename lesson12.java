/*  June 15 2023 */

public class Main
{
	
	public static void main(String[] args) { }
  
  // Soru _ 1 ile 100 rasındaki 3'ün 4'ün ve 5'in katlarını ekrana iç içe yazdıran program
	public static void soru1() {
		int i;
		
		for(i = 1; i <= 100; i++){
		  if(i % 3 == 0) 
		    System.out.print(i + " ");
	    if(i % 4 == 0) 
		    System.out.print(i + " ");
	    if(i % 5 == 0) 
		    System.out.print(i + " ");
			
			// Sonuç değişmez
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
                
                c = 5.0 / 9 * (f - 32);  // c = 5.0 / 9.0 * (f - 32);
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


}

/*	a ile b arasındaki n'nin katlarını yazdırma:
		for(i = a + (5 - a % 5); i < b; i += 5)
      System.out.print(i + " ");
*/
