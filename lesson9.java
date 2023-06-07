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
        
    if(0 < a) 
      if(a < 100) 
        System.out.println("Sayı 0 ile 100 arasındadır.");
      else
        System.out.println("Sayı 0 ile 100 arasında değildir.");
    else 
      System.out.println("Sayı 0 ile 100 arasında değildir.");
	}
	
}
