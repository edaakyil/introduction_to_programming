/* May 25 2023 */
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
	// Soru _ Klavyeden girilen iki basamaklı bir sayının basamaklarının karelerinin değerlerinin toplamını ekrana yazdıran bir program
	public static void soru1() {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
      int number, a, b, result;

      System.out.print("İki basamklı bir sayı giriniz giriniz: ");
      number = kb.nextInt();

      a = number / 10;
      b = number % 10;
      result = a * a + b * b;

      System.out.println(a);
      System.out.println(b);
      System.out.println("Sayının basamaklarının karelerinin toplamı = " + result);
	}
}
