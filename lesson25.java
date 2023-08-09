/* August 09 2023 */

public class Main
{

        public static void main(String[] args) {}
        
        // Soru 1 _ Üç dizinin ortak elemanlarını ekrana yazdıran program
	public static void soru1() {
		//         0   1  2  3   4  5   6   7  8   9 
                int a[] = {4,  8, 3, 1, 18, 9, 21, 20, 5, 17};  
                int b[] = {8, 13, 6, 12, 4, 5, 19, 1, 14, 25};
                int c[] = {6, 18, 8, 14, 2, 4, 72, 7, 28, 52};
		int  i, k, m, size, flag;
		size = 10;
		   
	        for(i = 0; i < size; i++) 
	                for(k = 0; k < size; k++)
	                        if(a[i] == b[k])
	                                for(m = 0; m < size; m++)
                                                if(a[i] == c[m])
                                                        System.out.print(a[i] + " ");
                                                        
	}

        // Soru 2 _ a ve b de ortak olan c de olmayan elemanlarını ekrana yazdıran program
	public static void soru2() {
		//         0   1  2  3   4  5   6   7  8   9 
                int a[] = {4,  8, 3, 1, 18, 9, 21, 20, 5, 17};  
                int b[] = {8, 13, 6, 12, 4, 5, 19, 1, 14, 25};
                int c[] = {6, 18, 8, 14, 2, 4, 72, 7, 28, 52};
		int  i, k, m, size, flag;
		size = 10;
		   
                for(i = 0; i < size; i++) 
	                for(k = 0; k < size; k++)
	                        if(a[i] == b[k]) {
	                                flag = 0;
                                        for(m = 0; m < size; m++) 
                                                if(a[i] == c[m])
                                                        flag = 1;
                                        if(flag == 0)
                                                System.out.print(a[i] + " ");
                                }
	}

        // Soru 3 _dizideki her elemandan kaç tane olduğunu ekrana yazdıran program
	public static void soru3() {
        //         0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15  16 17 18 19
        int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
		int  i, k, size, count, flag;
		size = 20;
		   
                for(i = 0; i < size; i++) {
                        flag = 0;
	                for(k = 0; k < i; k++) 
	                        if(a[i] == a[k]) 
	                                flag = 1;
                                        
                        if(flag == 0) {
                                count = 1;
        	                for(k = i + 1; k < size; k++)
        	                        if(a[k] == a[i])
        	                                count++;
                                System.out.println(a[i] + " adedi: " + count);
                        }
                }
	}

        // Soru 4 _diziyi her sayıdan bir tane kalacak şekilde düzenleyen bu sayıları dinin başında biriktiren 
        //ve geri kalan elemanları sıfırlayan program
	public static void soru4() {
                //         0  1  2  3  4  5  6  7   8   9  10  11  12  13  14
                int a[] = {1, 1, 1, 3, 5, 5, 8, 9, 17, 17, 17, 17, 20, 24, 24};
		int  i, k, size, p;
		size = 15;
		p = 1;
		   
                for(i = 1; i < size; i++) 
                        if(a[i] != a[i - 1]) {
                                a[p] = a[i];
                                p++;
                        }
                
                for(i = p; i < size; i++)
                        a[i] = 0;
                
                for(i = 0; i < size; i++)
                        System.out.print(a[i] + " ");
	}

        // Soru 5 _diziyi her sayıdan bir tane kalacak şekilde düzenleyen bu sayıları dinin başında biriktiren 
        //ve geri kalan elemanları sıfırlayan program
	public static void soru5() {
                //         0   1  2  3  4  5  6  7  8   9  10  11  12  13  14
                int a[] = {17, 1, 1, 5, 3, 1, 9, 5, 24, 8, 20, 17, 17, 24, 17};
		int  i, k, size, p, flag;
		size = 15;
		p = 1;
		   
                for(i = 1; i < size; i++) {
                        flag = 0;
                        for(k = 0; k < i; k++)
                                if(a[i] == a[k])
                                        flag = 1;
                        if(flag == 0) {
                                a[p] = a[i];
                                p++;
                        }
                }
                
                for(i = p; i < size; i++)
                        a[i] = 0;
                
                for(i = 0; i < size; i++)
                        System.out.print(a[i] + " ");
	}

         // İyileştirilmiş hali
        // Soru 5 _diziyi her sayıdan bir tane kalacak şekilde düzenleyen bu sayıları dinin başında biriktiren 
        //ve geri kalan elemanları sıfırlayan program
	public static void main(String[] args) {
                //         0   1  2  3  4  5  6  7  8   9  10  11  12  13  14
                int a[] = {17, 1, 1, 5, 3, 1, 9, 5, 24, 8, 20, 17, 17, 24, 17};
		int  i, k, size, p, flag;
		size = 15;
		p = 1;
		   
                for(i = 1; i < size; i++) {
                        flag = 0;
                        for(k = 0; k < p; k++)
                                if(a[i] == a[k])
                                        flag = 1;
                        if(flag == 0) {
                                a[p] = a[i];
                                p++;
                        } 
                }
                
                for(i = p; i < size; i++)
                        a[i] = 0;
                
                for(i = 0; i < size; i++)
                        System.out.print(a[i] + " ");
	}
	
}
