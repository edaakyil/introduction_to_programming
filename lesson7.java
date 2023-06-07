/* May 31 2023 */
public class Main
{
  
  public static void main(String[] args) {
    part1();
    soru1();
    soru2();
  }
	
  public static void part1() {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n;

    System.out.print("Bir sayı giriniz: ");
    n = kb.nextInt();

    if(n < 0)
	System.out.println("Negatif");
    else
	System.out.println("Pozitif");
  }
	
  // Soru _ Klavyeden girilen sayının tek yada çift olduğunu ekrana yazdıran program
  public static void soru1() {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n;

    System.out.print("Bir sayı giriniz: ");
    n = kb.nextInt();

    if(n % 2 == 0)
      System.out.println("Çift");
    else
      System.out.println("Tek");
  }
  
  // Soru _ Klavyeden girilen iki farklı sayının büyüğünü ekrana yazdıran program
  public static void soru2() {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n, m;
	    
    System.out.print("1. sayı giriniz: ");
    n = kb.nextInt();

    System.out.print("2. sayı giriniz: ");
    m = kb.nextInt();

    if(m < n)
      System.out.println(n);
    else
      System.out.println(m);
  }
  
}
