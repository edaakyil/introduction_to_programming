/* June 07 2023 */

public class Main
{
    
	public static void main(String[] args) {
		soru1();
	}
	
  // Soru _ Klavyeden girilen sayının 0 ile 100 arasında olup olmadığını ekrana yazdıran program.
  // 0 ile 100 dahil değil
	public static void soru1() {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int a;
    
    System.out.print("Bir sayı giriniz: ");
    a = kb.nextInt();
        
		// Bir else bir if'e aittir, ortak else diye bir şey yoktur.
		// Derleyici bir else ile karşılaştığında onu en son if ile eşleştirir.
    if(0 < a) 
      if(a < 100) 
        System.out.println("Sayı 0 ile 100 arasındadır.");
      else
        System.out.println("Sayı 0 ile 100 arasında değildir.");
    else 
      System.out.println("Sayı 0 ile 100 arasında değildir.");
	}
	
	// Soru _ Klavyeden girilen x'e göre y'nin değerini ekrana yazdıran program.
  // y = k * x + t
  // x < 0 --> k = 2 && t = 0
  // 0 <= x <= 5 --> k = -1 && t = 10
  // x > 5 --> k = 3 && t = -20
	public static void soru2() {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int x, y, k, t;
    
    System.out.print("x = ");
    x = kb.nextInt();
        
    if(x < 0) {
      k = 2;
      t = 0;
    } else 
      if(x <= 5) {
        k = -1;
        t = 10;
      } else {
        k = 3;
        t = -20; 
      }
        
    y = k * x + t;
    
    System.out.print("y = " + y);
	}
	
}
