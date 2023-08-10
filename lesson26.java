/* August 10 2023 */

public class Main
{

        // Rastgele sayı üretmek
	public static void main(String[] args) {
	        java.util.Random generator = new java.util.Random();
                int n;
                
                n = generator.nextInt(10);     
                
                System.out.println(n);
	}

        // Soru 1 _ 10 dan küçük 1000 adet rastgele sayı üreten ve bunları ekrana yan yana yazdıran program
	public static void soru1() {
	        java.util.Random generator = new java.util.Random();
                int i, n, total;
                total = 1000;
                
                for(i = 0; i < total; i++) {
                        n = generator.nextInt(10);     
                        System.out.print(n + " ");
                }
	}

        // Soru 2 _ 10 dan küçük üretilen 1000 adet rastgele sayının kaçını tek kaçının çift olduğunu ekrana azdıran program
	public static void soru2() {
	        java.util.Random generator = new java.util.Random();
                int i, n, total, countEven, countOdd;
                total = 1000;
                countOdd = 0;
                
                for(i = 0; i < total; i++) {
                        n = generator.nextInt(10); 
                        countOdd = countOdd + n % 2;
                }
                
                countEven = total - countOdd;
                
                System.out.println("Çift sayıların adedi: " + countEven);
                System.out.println("Tek sayıların adedi: " + countOdd);
	}

        // Soru 3 _ 10 dan küçük üretilen 1000 adet rastgele sayının kaçını tek kaçının çift olduğunu ekrana azdıran program
	public static void soru3() {
	        java.util.Random generator = new java.util.Random();
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
                int i, n, size, total, indis1, indis2, temp;
                size = 10;
                total = 1000;
                
                for(i = 0; i < total; i++) {
                        indis1 = generator.nextInt(size); 
                        indis2 = generator.nextInt(size); 
                        temp = a[indis1];
                        a[indis1] = a[indis2];
                        a[indis2] = temp;
                }
                
                for(i = 0; i < size; i++)
                        System.out.print(a[i] + " ");
	}

        // Soru 4 _ 10 dan küçük üretilen 1000 adet rastgele sayının kaçını tek kaçının çift olduğunu ekrana yazdıran ye kaçının yerinde kaldığını program
	public static void soru4() {
	        java.util.Random generator = new java.util.Random();
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int b[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
                int i, n, size, total, indis1, indis2, temp, count;
                size = 10;
                total = 1000;
                
                for(i = 0; i < total; i++) {
                        indis1 = generator.nextInt(size); 
                        indis2 = generator.nextInt(size); 
                        temp = a[indis1];
                        a[indis1] = a[indis2];
                        a[indis2] = temp;
                }
                
                count = 0;
                for(i = 0; i < size; i++)
                        if(a[i] == b[i])
                                count++;
                                
                System.out.println(count + " eleman yerinde kalmış");
	}
  
}
