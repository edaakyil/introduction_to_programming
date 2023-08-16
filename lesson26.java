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

        // Soru 3 _ iki tane indis numarası üreterek 1000 defa dizinin elemanlarının yerini değiştiren program
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
                                
	        for(i = 0; i < size; i++) {
                        if(a[i] < 10)
                                System.out.print(" ");
                        System.out.print(a[i] + " ");
                }
                System.out.println();
                                
                for(i = 0; i < size; i++) {
                        if(b[i] < 10)
                                System.out.print(" ");
                        System.out.print(b[i] + " ");
                }
                System.out.println();
                                
                System.out.println(count + " eleman yerinde kalmış");
	}

	// Soru 5 _ Diziyi tamamen karışana kadar karıştıran program
	public static void soru5() {
	        java.util.Random generator = new java.util.Random();
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int b[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
                int i, n, size, indis1, indis2, temp, count;
                size = 10;
                
                count = 1;
                while(count != 0) {
                        indis1 = generator.nextInt(size); 
                        indis2 = generator.nextInt(size); 
                        temp = a[indis1];
                        a[indis1] = a[indis2];
                        a[indis2] = temp;
			count = 0;
                        for(i = 0; i < size; i++)
                                if(a[i] == b[i])
                                        count++;
                }
                
                for(i = 0; i < size; i++) {
                        if(a[i] < 10)
                                System.out.print(" ");
                        System.out.print(a[i] + " ");
                }
                System.out.println();
                                
                for(i = 0; i < size; i++) {
                        if(b[i] < 10)
                                System.out.print(" ");
                        System.out.print(b[i] + " ");
                }
                System.out.println();
	}

	// Soru 6 _ Diziyi kaç defa karıştırdıktan sonra tamamen karıştığını bulan program
	public static void soru6() {
	        java.util.Random generator = new java.util.Random();
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int b[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
                int i, n, size, indis1, indis2, temp, count, countShuffle;
                size = 10;
                countShuffle = 0;
                count = 1;
                while(count != 0) {
                        countShuffle++;
                        indis1 = generator.nextInt(size); 
                        indis2 = generator.nextInt(size); 
                        temp = a[indis1];
                        a[indis1] = a[indis2];
                        a[indis2] = temp;
                        count = 0;
                        for(i = 0; i < size; i++)
                                if(a[i] == b[i])
                                        count++;
                }
                
                System.out.println(countShuffle + " defa karıştırdıktan sonra dizi tamamen karışıyor");
	}

	        // Soru 6 _ Oratama kaç defa diziyi karıştığını bulan program
	public static void main(String[] args) {
	        java.util.Random generator = new java.util.Random();
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int b[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
                int i, k, n, size, indis1, indis2, temp, count, countShuffle, countShuffleAvg, total;
                size = 10;
                countShuffle = 0;
                total = 1000000;
                for(i = 0; i < total; i++) {
                        count = 1;
                        while(count != 0) {
                                countShuffle++;
                                indis1 = generator.nextInt(size); 
                                indis2 = generator.nextInt(size); 
                                temp = a[indis1];
                                a[indis1] = a[indis2];
                                a[indis2] = temp;
                                count = 0;
                                for(k = 0; k < size; k++)
                                        if(a[k] == b[k])
                                                count++;
                        }
                        for(k = 0; k < size; k++)
                                a[k] = b[k];    
                }
                countShuffleAvg = countShuffle / total;
                System.out.println( "ortalama: " + countShuffleAvg);
	}

	// Soru 7 _ Kaç defa karıştıktan sonra dizi ilk haline gelir
	public static void main(String[] args) {
	        java.util.Random generator = new java.util.Random();
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int b[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
                int i, k, n, size, indis1, indis2, temp, count, countShuffle;
                size = 10;
                countShuffle = 0;
                
                count = 1;
                while(count != size) {
                        countShuffle++;
                        indis1 = generator.nextInt(size); 
                        indis2 = generator.nextInt(size); 
                        temp = a[indis1];
                        a[indis1] = a[indis2];
                        a[indis2] = temp;
                        count = 0;
                        for(k = 0; k < size; k++)
                                if(a[k] == b[k])
                                        count++;
                }
                        
                for(i = 0; i < size; i++) {
                        if(a[i] < 10)
                                System.out.print(" ");
                        System.out.print(a[i] + " ");
                }
                System.out.println();
                                
                for(i = 0; i < size; i++) {
                        if(b[i] < 10)
                                System.out.print(" ");
                        System.out.print(b[i] + " ");
                }
                System.out.println();
                
                System.out.println(countShuffle + " defa karışınca dizi ilk haline gelir");
	}
  
}
