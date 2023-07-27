/* July 26 2023 */

public class Main
{

	public static void main(String[] args) {}

        // Soru _ Herbir stünunun toplamını ve ortalamasını yazdıran program
	public static void main(String[] args) {
		int m[][] = {{ 5,  7,  3},
        	             {15,  6, 10},
        	             {22,  9,  1},
        	             {11, 14, 18}};
	        int i, k, row, col, sum, avg;
	        row = 4;
	        col = 3;
	        
	        for(i = 0; i < col; i++) {
	                sum = 0;
	                for(k = 0; k < row; k++)
	                        sum += m[k][i];
                        avg = sum / row;
	                System.out.println(i + " nolu sütunun toplamı: " + sum + "   ortalaması: " + avg);
	        }  
	}

	// Soru _ Herbir satırının toplamını ve ortalamasını yazdıran program
	public static void soru2() {
		int m[][] = {{ 5,  7,  3},
        	             {15,  6, 10},
        	             {22,  9,  1},
        	             {11, 14, 18}};
	        int i, k, row, col, sum, avg;
	        row = 4;
	        col = 3;
	        
	        for(i = 0; i < row; i++) {
	                sum = 0;
	                for(k = 0; k < col; k++)
	                        sum += m[i][k];
                        avg = sum / col;
	                System.out.println(i + " nolu satırının toplamı: " + sum + "   ortalaması: " + avg);
	        }
	        
	}

	// Soru _ Matrix'in en büyük elemanını bulan program
	public static void soru3() {
                int m[][] = {{ 5,  7,  3},
        	             {15,  6, 10},
        	             {22,  9,  1},
        	             {11, 14, 18}};
	        int i, k, row, col, max;
	        row = 4;
	        col = 3;
	        max = m[0][0];
	        
	        for(i = 0; i < row; i++)
	                for(k = 0; k < col; k++)
	                        if(max < m[i][k])
	                                max = m[i][k];
	                                
                System.out.println("Matrix'in en büyük elemanı: " + max);
	        
	}

	// Soru _ Matrix'in en büyük ve en küçük elemanlarını bulan program
	public static void soru4() {
                int m[][] = {{ 5,  7,  3},
        	             {15,  6, 10},
        	             {22,  9,  1},
        	             {11, 14, 18}};
	        int i, k, row, col, max, min;
	        row = 4;
	        col = 3;
	        max = m[0][0];
	        min = m[0][0];
	        
	        for(i = 0; i < row; i++)
	                for(k = 0; k < col; k++)
	                        if(max < m[i][k])
	                                max = m[i][k];
                                else if(min > m[i][k])
                                        min = m[i][k];
	                                
                System.out.println("Matrix'in en büyük elemanı: " + max);
                System.out.println("Matrix'in en küçük elemanı: " + min);
	        
	}

	// Soru _ Matrix'in en büyük ve yerini elemanını bulan program
	public static void soru5() {
                int m[][] = {{ 5,  7,  3},
        	             {15,  6, 10},
        	             {22,  9,  1},
        	             {11, 14, 18}};
	        int i, k, row, col, max, rMax, cMax;
	        row = 4;
	        col = 3;
	        max = m[0][0];
	        rMax = 0;
	        cMax = 0;
	        
	        for(i = 0; i < row; i++)
	                for(k = 0; k < col; k++)
	                        if(max < m[i][k]) {
	                                max = m[i][k];
	                                rMax = i;
	                                cMax = k;
                                }
	                                
                System.out.println("Matrix'in en büyük elemanı: " + max + " _ Satır no: " + rMax + " _ Sütun no: " + cMax);
	        
	}

	// Soru _ Matrix'in en büyük ve en küçük elemanlarını yer değiştiren program
	public static void soru6() {
                int m[][] = {{ 5,  7,  3},
        	             {15,  6, 10},
        	             {22,  9,  1},
        	             {11, 14, 18}};
	        int i, k, row, col, max, min, rMax, cMax, rMin, cMin;
	        row = 4;
	        col = 3;
		
	        max = m[0][0];
	        rMax = 0;
	        cMax = 0;
	        
		min = m[0][0];
	        rMin = 0;
	        cMin = 0;
	        
	        for(i = 0; i < row; i++)
	                for(k = 0; k < col; k++)
	                        if(max < m[i][k]) {
	                                max = m[i][k];
	                                rMax = i;
	                                cMax = k;
                                } else if(min > m[i][k]) {
	                                min = m[i][k];
	                                rMin = i;
	                                cMin = k;
                                } 
                                
                m[rMax][cMax] = min;
                m[rMin][cMin] = max;
                
                for(i = 0; i < row; i++) {
                        for(k = 0; k < col; k++)
                                System.out.print(m[i][k] + " ");
                        System.out.println();
	        }
	        
	}

	// Soru _ Her satırın en büyük elemanını ayrı ayrı ekrana yazdıran program
	public static void soru7() {
                int m[][] = {{ 55,   7,   3},
        	             {-15,  -6, -10},
        	             { 22,   9,   1},
        	             { 11,  14,  18}};
	        int i, k, row, col, max;
	        row = 4;
	        col = 3;
	        max = m[0][0];
	        
	        for(i = 0; i < row; i++) {
	                max = m[i][0];
	                for(k = 0; k < col; k++)
	                        if(max < m[i][k])
	                                max = m[i][k];
                        System.out.print(i + ". satırın en büyük elemanı: " + max);
                        System.out.println();
                }
	        
	}

}



