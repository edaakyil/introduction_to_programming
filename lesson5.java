/* May 24 2023 */
public class Main 
{
    
    public static void main(String[] args) {
	    cylinderVolume();
		  cylinderSurfaceArea();
		  soru1();
		  soru2();
	}
	
    // Soru _ Yarıçapı ve yüksekliği klavyeden girilen bir silindirin hacmini hesaplayan program
    // V = pi * r * r * h
    public void cylinderVolume() 
    {
    	java.util.Scanner kb = new java.util.Scanner(System.in);
    	double volume, pi, r, h;
    	
    	pi = 3.14159;
    	
    	System.out.print("Yarıçapı giriniz: ");
    	r = kb.nextDouble();
    	
    	
    	System.out.print("Yüksekliği giriniz: ");
    	h = kb.nextDouble();
    	
    	area = pi * r * r * h;
    	
    	System.out.println("Silindirin hacmi: " + value);
    }
    
    // Soru _ Yarıçapı ve yüksekliği klavyeden girilen bir silindirin yüzey alanını hesaplayan program
    // 2πrr + 2πrh
    public static void cylinderSurfaceArea() 
    {
    	java.util.Scanner kb = new java.util.Scanner(System.in);
    	double surfaceArea, pi, r, h;
    	
    	pi = 3.14159;
    	
    	System.out.print("Yarıçapı giriniz: ");
    	r = kb.nextDouble();
    	
    	
    	System.out.print("Yüksekliği giriniz: ");
    	h = kb.nextDouble();
    	
    	surfaceArea = 2 * pi * r * r + 2 * pi * r * h;  
    	
    	System.out.println("Silindirin yüzey alanı: " + surfaceArea);
    }
    
    // Soru _  klavyeden girilen a ve b ye göre c ile d nin değerini ekrana yazdıran program
    public static void soru1() 
    {
      java.util.Scanner kb = new java.util.Scanner(System.in);
      double a, b, c, d;

      System.out.print("a = ");
      a = kb.nextDouble();

      System.out.print("b = ");
      b = kb.nextDouble();

          c = 2 * a * a + 4 * a * b + 8;
      d = c * c + a + b;

      System.out.println("c = " + c);
      System.out.println("d = " + d);
    }
    
    // Soru _   Klayyeden a ve b giriliyor. a ile b nin değerlerini yer değiştiren program
    public static void soru2() 
    {
      java.util.Scanner kb = new java.util.Scanner(System.in);
      int a, b, c;

      System.out.print("a = ");
      a = kb.nextInt();

      System.out.print("b = ");
      b = kb.nextInt();

          c = a;
          a = b;
          b = c;

      System.out.println("a = " + a);
      System.out.println("b = " + b);
    }
        
}
