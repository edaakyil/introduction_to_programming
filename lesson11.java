/* June 14 2023 */
public class Main
{
	public static void main(String[] args) {
		soru1();
	}
	
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
	public static void main(String[] args) {
                java.util.Scanner kb = new java.util.Scanner(System.in);
                int i, n;
                
                System.out.print("n = ");
                n = kb.nextInt();
                
                
                for(i = 1; i <= n; i++)
                        System.out.println(i);
		  
	}
	
        // Soru _ klavyeden a ve b degerleri giriliyor. a nın b den küçük girildiği kabuledeiliyor. a dan b ye kadar olan sayıları ekrana yazdıran program
	public static void main(String[] args) {
                java.util.Scanner kb = new java.util.Scanner(System.in);
                int i, a, b;
                
                System.out.print("a = ");
                a = kb.nextInt();
                
                System.out.print("b = ");
                b = kb.nextInt();
                
                for(i = a; i <= b; i++)
                        System.out.println(i);
                
        }
	
}
