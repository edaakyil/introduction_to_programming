/* August 03 2023 */


public class Main
{
        
        public static void main(String[] args) {}
        
        // Soru - 1 _ Dizideki ilk tek sayıyı ve ondan sonrakileri 2 ile çarpan program
	public static void soru1() {
		//         0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15  16 17 18 19
                int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
		int i, k, size, flag;
		size = 10;
		flag = 0;
		
		for(i = 0; i < size; i++) {
		        if(a[i] % 2 != 0)
		                flag = 1;
	                if(flag == 1)
		                a[i] *= 2;
                }
        		                
		for(i = 0; i < size; i++)
                        System.out.print(a[i] + " ");
	}

        // Soru - 2 _ Klavyeden girilen sayının dizide olup olmadığını ekrana yazdıran program
	public static void soru2() {
	        java.util.Scanner kb = new java.util.Scanner(System.in);
		//         0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15  16 17 18 19
                int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
		int i, n, size, flag;
		size = 20;
		flag = 0;
		
		System.out.print("Bir sayı girin: ");
		n = kb.nextInt();
		
		for(i = 0; i < size; i++)
		        if(a[i] == n)
		                flag = 1;
		                
                if(flag == 1)
                     System.out.println("Sayı dizide var.");
                else
                     System.out.println("Sayı dizide yok.");	                
	}

        // Soru - 3 _ Klavyeden girilen indis nolu elemanın kendinden önce olup oladığını ekrana yazdıran program
	public static void soru3() {
	        java.util.Scanner kb = new java.util.Scanner(System.in);
		//         0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15  16 17 18 19
                int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
		int i, n, size, flag;
		size = 20;
		flag = 0;
		
		System.out.print("Indis numarasını girin: ");
		n = kb.nextInt();
		
		for(i = 0; i < n; i++)
		        if(a[i] == a[n])
		                flag = 1;
		                
                if(flag == 1)
                     System.out.println("Var.");
                else
                     System.out.println("Yok.");                
	}

        // Soru - 4 _ Dizinin her elemanının kendinden önce olup oladığını ekrana yazdıran program
	public static void soru4() {
		//         0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15  16 17 18 19
                int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
		int i, k, size, flag;
		size = 20;
		
		for(i = 0; i < size; i++) {
                        flag = 0;
        		for(k = 0; k < i; k++)
        		        if(a[i] == a[k])
        		                flag = 1;
        		                
                        if(flag == 1)
                             System.out.println(i + " _ VAR.");
                        else
                             System.out.println(i + " _ YOK.");
                        
                        
	        }        
	}

        // Soru - 5 _ İki dizinin kesişimini ekrana yazdıran program
	public static void soru5() {
		//         0   1  2  3   4  5   6   7  8   9 
                int a[] = {4,  8, 3, 1, 18, 9, 21, 20, 5, 17};  
                int b[] = {8, 13, 6, 12, 4, 5, 19, 1, 14, 25};
		int i, k, size;
		size = 10;
		
		for(i = 0; i < size; i++)
        		for(k = 0; k < size; k++) 
        		        if(a[i] == b[k])
                                        System.out.print(a[i] + ", ");
	}

                             //// Soru - 6 _ İki dizinin birleşimini ekrana yazdıran program
        // cEVABI YARIN
	
}
