/* August 02c2023 */

public class Main {

        public static void main(String[] args) {}
                
        // Soru _ Klavyeden sürekli sayı giriliyor. 0 girildiğinde programdan çıkılıyor
	public static void soru1() {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int n;
                
		System.out.print("n = ");
                n = kb.nextInt();
		
		while(n != 0) {
        		System.out.print("n = ");
        		n = kb.nextInt();
		}
		
	        System.out.println("Döngü sonlandı");
	}

        	      // Soru _ Klavyeden sürekli sayı giriliyor. ve bu sayılar toplanıyor. Toplam 1000 ni geçince son toplam ekrana yazdırılıyor ve program sonlanıyor.
	public static void soru2(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int n, sum;
		sum = 0;
		
	        System.out.print("Tolanacak sayıları girin:");
		System.out.println();
		while(sum <= 1000) {
        		n = kb.nextInt();
		        sum += n;
		}
		
	        System.out.println("Toplam: " + sum);
	}

       // Soru _ Klavyeden girilen sayıyı basamaklarına ayıran program
	public static void soru3(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int n, digit;
		 
		System.out.print("Basamaklarına ayrılacak değeri girin: ");
		n = kb.nextInt();
		
		while(n != 0) {
		        digit = n % 10;
        		System.out.println(digit);
        		n /= 10;
        		
		}
		
	}

             // Soru _ Klavyeden girilen sayıyı basamaklarına ayıran ve bunları bir diziye atayan program
	public static void soru4(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int a[] = new int[10];
		int n, i, size, digit;
		size = 0;
		
		System.out.print("Değeri girin: ");
		n = kb.nextInt();
		 
		
		while(n != 0) {
        		digit = n % 10;
		        a[size] = digit;
		        size++;
        		n /= 10;
		}
		
		for(i = 0; i < size; i++)
        		System.out.print(a[i] + " ");
		
	}

                        // Soru _ Klavyeden girilen sayıyı ttersinden elde eden program
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int n, a, digit;
		a = 0;
		
		System.out.print("Değeri girin: ");
		n = kb.nextInt();
		 
		
		while(n != 0) {
        		digit = n % 10;
        		a = digit + 10 * a;
        		n /= 10;
		}
		
		System.out.print("Yeni değer: " + a);
	}


        //  // Soru _ Klavyeden girilen sayının basamaklarından elde edilebilecek en büyük sayıyı bulan ve bu sayıyı 2 ile çarpan program
        // cevabı yarın
        
}
