/* June 08 2023 */

public class Main
{
  
	public static void main(String[] args) {}
	
  // Soru _ Klaveden girilen üç farklı sayının en büyüğünü ekrana yazdıran program
	public static void soru1() {
	  java.util.Scanner kb = new java.util.Scanner(System.in);
    int a, b, c;
    
    System.out.print("a = ");
    a = kb.nextInt();
    
    System.out.print("b = ");
    b = kb.nextInt();
    
    System.out.print("c = ");
    c = kb.nextInt();
        
    if(a > b)
      if(a > c)
        System.out.print("En büyük sayı: " + a);
      else
        System.out.print("En büyük sayı: " + c);
    else 
      if(b > c)
        System.out.print("En büyük sayı: " + b);
      else 
        System.out.print("En büyük sayı: " + c);
	}
	
  // Soru _ Klaveden girilen üç farklı sayının en büyüğünü ekrana yazdıran program
	public static void soru1Kisayol() {
  	java.util.Scanner kb = new java.util.Scanner(System.in);
    int a, b, c, max;
    
    System.out.print("a = ");
    a = kb.nextInt();
    
    System.out.print("b = ");
    b = kb.nextInt();
    
    System.out.print("c = ");
    c = kb.nextInt();
    
    max = a;
        
    if(b > max)
      max = b;
        
    if(c > max)
      max = c;

    System.out.print("En büyük sayı: " + max);
	}
	
  // Soru _ Klaveden girilen üç farklı sayının ortancasını ekrana yazdıran program.
	public static void soru2() {
	 java.util.Scanner kb = new java.util.Scanner(System.in);
    int a, b, c;
    
    System.out.print("a = ");
    a = kb.nextInt();
    
    System.out.print("b = ");
    b = kb.nextInt();
    
    System.out.print("c = ");
    c = kb.nextInt();
    
    if(a > b)
      if(b > c)
        System.out.print("Ortanca sayı: " + b);
      else
        if(a > c)
          System.out.print("Ortanca sayı: " + c);
        else
          System.out.print("Ortanca sayı: " + a);
    else 
      if(a > c)
        System.out.print("Ortanca sayı: " + a);
      else
        if(b > c)
          System.out.print("Ortanca sayı: " + c);
        else
          System.out.print("Ortanca sayı: " + b);
    
	}
	
  // Soru _ Klaveden girilen üç farklı sayının ortancasını ekrana yazdıran program.
  // (a - b) * (a - c)
  // (b - a) * (b - c)
  // (c - a) * (c - b)
	public static void soru2Kisayol() {
  	java.util.Scanner kb = new java.util.Scanner(System.in);
    int a, b, c;
    
    System.out.print("a = ");
    a = kb.nextInt();
    
    System.out.print("b = ");
    b = kb.nextInt();
    
    System.out.print("c = ");
    c = kb.nextInt();
    
        
    if((a - b) * (a - c) < 0)
      System.out.print("Ortanca sayı: " + a);
    else 
      if((b - a) * (b - c) < 0)
        System.out.print("Ortanca sayı: " + b);
      else
        System.out.print("Ortanca sayı: " + c);
    
	}
	
	// Soru _ Klaveden girilen notun harf karşılığını ekrana yazdıran program.
  // 80 < n <= 100 _ A
  // 60 < n <= 80 _ B
  // 40 < n <= 60 _ C
  // 20 < n <= 40 _ D
  // 0 <= n <= 20 _ E
	public static void soru3() {
    
  	java.util.Scanner kb = new java.util.Scanner(System.in);
    int a;
    
    System.out.print("Puanınız: ");
    a = kb.nextInt();
    
    if(a <= 20)
      System.out.print("E");
    else if(a <= 40)
      System.out.print("D");
    else if(a <= 60)
      System.out.print("C");
    else if(a <= 80)
      System.out.print("B");
    else
      System.out.print("A");
    
	}
	
}
