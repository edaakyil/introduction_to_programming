/* June 14 2023 */
public class Main
{
	public static void main(String[] args) { }
	
        // Soru _ 1 den 10 a kadar sayıları ekrana yazdıran program
	public static void soru1() {
	        int i;
	  
                for(i = 1; i <= 10; i++)
                        System.out.println(i);
		  
	}
	
        // Soru _ 20 den küçük pozitif tek sayıları ekrana yazıran pro
	public static void soru2() {
	  
                int i;
                
                for(i = 1; i < 20; i = i + 2)
                        System.out.println(i);
		  
	}
	
        // Soru _ 10 dan geriye dogru pozitif sayıları ekrana yazdıran program
	public static void soru3() {
	  
                int i;
                
                for(i = 10; i >= 0; i--)
                        System.out.println(i);
		  
	}
	
        // Soru _ n klavyeden girilen pozitif bir sayısıdr. 1 den n ye kadar olan sayıları ekran yazdıran program
	public static void soru4() {
                java.util.Scanner kb = new java.util.Scanner(System.in);
                int i, n;
                
                System.out.print("n = ");
                n = kb.nextInt();
                
                
                for(i = 1; i <= n; i++)
                        System.out.println(i);
		  
	}
	
        // Soru _ klavyeden a ve b degerleri giriliyor. a nın b den küçük girildiği kabuledeiliyor. a dan b ye kadar olan sayıları ekrana yazdıran program
	public static void soru5() {
                java.util.Scanner kb = new java.util.Scanner(System.in);
                int i, a, b;
                
                System.out.print("a = ");
                a = kb.nextInt();
                
                System.out.print("b = ");
                b = kb.nextInt();
                
                for(i = a; i <= b; i++)
                        System.out.println(i);
                
        }
        
        // Soru _ klavyeden a ve b degerleri giriliyor. a nın b den küçük girildiği kabuledeiliyor. a dan b ye kadar olan sayıları ekrana yazdıran program  --> a yazdırılmayazak (a dahil değil)
        public static void soru6() {
                java.util.Scanner kb = new java.util.Scanner(System.in);
                int i, a, b;
                
                System.out.print("a = ");
                a = kb.nextInt();
                
                System.out.print("b = ");
                b = kb.nextInt();
                
                for(i = a + 1; i <= b; i++)
                        System.out.println(i);
        
        }
        
        // Soru _ klavyeden a ve b degerleri giriliyor. a nın b den küçük girildiği kabuledeiliyor. a dan b ye kadar olan sayıları ekrana yazdıran program  --> a ve b yazdırılmayazak (a ve b dahil değil)
        public static void soru7() {
                java.util.Scanner kb = new java.util.Scanner(System.in);
                int i, a, b;
                
                System.out.print("a = ");
                a = kb.nextInt();
                
                System.out.print("b = ");
                b = kb.nextInt();
                
                for(i = a + 1; i < b; i++)
                        System.out.println(i);
        		  
        }
        
        // Soru _ klavyeden a ve b degerleri giriliyor. a < b, a == b, a > b olabilir. Her durumda a dan b ye kadar olan sayıları ekrana yazdıran program  
	public static void soru8() {
                java.util.Scanner kb = new java.util.Scanner(System.in);
                int i, a, b;
                
                System.out.print("a = ");
                a = kb.nextInt();
                
                System.out.print("b = ");
                b = kb.nextInt();
                
                if(a < b)
                        for(i = a; i <= b; i++)
                                System.out.print(i + " ");
                else 
                        for(i = a; i >= b; i--)
                                System.out.print(i + " ");
	}
	
	  // Soru _ n klavyeden girilen pozitif bir sayıdır. n çift ise 0 dan n ye kadar olan çift sayıları, n tek ise 1 den n ye kadar olan tek sayıları ekrana yazdıran program
	public static void soru9() {
                java.util.Scanner kb = new java.util.Scanner(System.in);
                int i, n;
                
                System.out.print("n = ");
                n = kb.nextInt();
                
                
                for(i = n % 2; i <= n; i += 2)
                        System.out.print(i + " ");
	}
	
	  
        // Soru _ Klavyeden a ve b degerleri giriliyor. a < b olduğu kabul ediliyor. a ile b arasındaki 5 in katlarını ekrana yazdıran program.
        public static void soru10() {
                java.util.Scanner kb = new java.util.Scanner(System.in);
                double i, a, b;
                
                System.out.print("a = ");
                a = kb.nextInt();
                
                System.out.print("b = ");
                b = kb.nextInt();
                
                for(i = (a / 5 + 1) * 5; i < b; i += 5)
                        System.out.print(i + " "); 
                
                // ikinci yöntem
                for(i = a + (5 - a % 5); i < b; i += 5)
                        System.out.print(i + " ");
        }


}

/*	a ile b arasındaki n'nin katlarını yazdırma:

	for(i = a + (5 - a % 5); i < b; i += 5)
      		System.out.print(i + " ");
*/
