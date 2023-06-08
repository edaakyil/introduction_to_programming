/* June 01 2023 */
public class Main
{
  
  public static void main(String[] args) {
    soru1();
    soru2();
    soru3();
  }

  // Soru _ Klavyeden a ve b giriniz. a nin b nin tam katı olup olmadığını ekrana yazdıran program
  public static void soru1() {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int a, b;

    System.out.print("a = ");
    a = kb.nextInt();

    System.out.print("b = ");
    b = kb.nextInt();

    if(a % b == 0)
      System.out.println("a, b'nin tam katıdır.");
    else
      System.out.println("a, b'nin tam katı değildir.");
  }
	
  // Soru _ Klavyeden girilen sayının mutlak değerini alan program
  public static void soru2() {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int a;

    System.out.print("Bir sayı giriniz: ");
    a = kb.nextInt();

    if(a < 0)
        a = -a;  // a = a * -1;

    System.out.println("|a| = " + a);
  }

  // Soru _ Klavyeden girilen x e göre y nin ve z nin değerini ekrana yazdıran program
  // x < 0 -->  y = x * x + 2 * x; z = 3 * x;
  // x >= 0 --> y = x; z = x * x + 10;
  public static void soru3() {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int x, y, z;

    System.out.print("x = ");
    x = kb.nextInt();

    if(x < 0){
        y = x * x + 2 * x; 
        z = 3 * x;
    } else {
        y = x; 
        z = x * x + 10;
    }
    
    System.out.println("y = " + y);
    System.out.println("z = " + z);
  }
  
  // Soru _ Klavyeden a ve b giriliyor. 
  // a > b && a == b && a < b olabilir. 
  // a ile b arasındaki büyüklük ilişkisini ekrana yazdıran program
  public static void soru4() {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int a, b;

    System.out.print("a = ");
    a = kb.nextInt();

    System.out.print("b = ");
    b = kb.nextInt();

    if(a > b) 
      System.out.println("a > b");
    else 
      if(a == b) 
        System.out.println("a = b");
      else 
        System.out.println("a < b");  
  }
  
  // Soru _ Klavyeden girilen 0 ile 1000 arasındaki sayının basamak sayısını ekrana yazdıran program 
  public static void soru5() {

    java.util.Scanner kb = new java.util.Scanner(System.in);
    int a;

    System.out.print("Bir sayı giriniz: ");
    a = kb.nextInt();

    if(a < 10) 
      System.out.println("1 basamaklı");
    else 
      if(a < 100) 
        System.out.println("2 basamaklı");
      else 
        System.out.println("3 basamaklı");
  }
	
}
