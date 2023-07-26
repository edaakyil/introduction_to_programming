/* July 26 2023 */

public class Main
{
        // Soru _ her satırın en büyük elemanını ayrı ayrı yazdıran eleman
	public static void main(String[] args) {
                int m[][] = {{55, 7, 3}, {-15, -6, -10}, {22, 9, 1}, {11, 14, 18}};
	        int i, k, row, col, max;
	        row = 4;
	        col = 3;
	        max = m[0][0];
	        
	        for(i = 0; i < row; i++) {
	                for(k = 0; k < col; k++) {
	                        max = m[i][0];
	                        if(max < m[i][k]) 
        	                        max = m[i][k];
                        }
        	                        
                        System.out.print(i + " nolu satırın en büyük elemanı: " + max);
                        System.out.println();
                }
	}
}

/* 3 */
        // Soru _ Matrix'in en büyüğünü ve en küçük elemanını bulan program:
// 	public static void main(String[] args) {
//                 int m[][] = {{5, 7, 3},
//         	        {15, 6, 10},
//         	        {22, 9, 1},
//         	        {11, 14, 18}};
// 	        int i, k, row, col, max, min;
// 	        row = 4;
// 	        col = 3;
// 	        max = m[0][0];
// 	        min = m[0][0];
	        
// 	        for(i = 0; i < row; i++) 
// 	                for(k = 0; k < col; k++) 
// 	                        if(max < m[i][k])
//         	                        max = m[i][k];
// 	                        else if(min > m[i][k])
//         	                        min = m[i][k];
//                 System.out.println("Matrix'in en büyük elemanı: " + max);
//                 System.out.println("Matrix'in en küçük elemanı: " + min);
// 	}


        /* 2 */
        // Soru _ Matrix'in en büyüğünü bulan program:
// 	public static void main(String[] args) {
//                 int m[][] = {{5, 7, 3},
//         	        {15, 6, 10},
//         	        {22, 9, 1},
//         	        {11, 14, 18}};
// 	        int i, k, row, col, max;
// 	        row = 4;
// 	        col = 3;
// 	        max = m[0][0];
	        
// 	        for(i = 0; i < row; i++) {
// 	                for(k = 0; k < col; k++) 
// 	                        if(max < m[i][k])
//         	                        max = m[i][k];
// 	        }
//                 System.out.println("Matrix'in en büyük elemanı: " + max);
// 	}

/* 1 */
// 	public static void main(String[] args) {
//                 int m[][] = {{5, 7, 3},
//         	        {15, 6, 10},
//         	        {22, 9, 1},
//         	        {11, 14, 18}};
// 	        int i, k, row, col, sum, avg;
// 	        row = 4;
// 	        col = 3;
	        
	        
// 	        for(i = 0; i < col; i++) {
// 	                sum = 0;
// 	                for(k = 0; k < 0; k++) 
// 	                        sum += m[k][i];
//                         avg = sum / row;
// 	                System.out.println(i + " nolu sütunun toplamı: " + sum + "ortalaması: " + avg);
// 	        }
// 	}
