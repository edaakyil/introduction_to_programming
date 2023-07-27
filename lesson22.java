/* July 27 2023 */

public class Main
{
        public static void main(String[] args) {}
        
        // Soru _ Her sütunu en büyük elemanını ayrı ayrı ekrana yazdıran program
	public static void soru1() {
               int m[][] = {{ 55,   7,   3},
        	             {-15,  -6, -10},
        	             { 22,   9,   1},
        	             { 11,  14,  18}};
	        int i, k, row, col, max;
	        row = 4;
	        col = 3;
	        max = m[0][0];
	        
	        for(i = 0; i < col; i++) {
	                max = m[0][i];
	                for(k = 0; k < row; k++)
	                        if(max < m[k][i])
	                                max = m[k][i];
                        System.out.print(i + ". sütununun en büyük elemanı: " + max);
                        System.out.println();
                }
	}

        // Soru _ a matrisinin transpozesini b matrisine alan program ( a nın satırlarını b nin sütunlarına ata)
	public static void soru2() {
               int ma[][] = {{ 55,   7,   3},
        	             {-15,  -6, -10},
        	             { 22,   9,   1},
        	             { 11,  14,  18}};
                int mb[][] = new int[3][4];
	        int i, k, rowA, colA, rowB, colB;
	        rowA = 4;
	        colA = 3;
	        rowB = 3;
	        colB = 4;
	        
	        for(i = 0; i < rowA; i++)
	                for(k = 0; k < colA; k++)
	                        mb[k][i] = ma[i][k];
                        
	        for(i = 0; i < rowB; i++) {
	                for(k = 0; k < colB; k++)
                                System.out.print(mb[i][k] + " ");
                        System.out.println();
                }
	}

        // Soru _ 5 e 5 lik Birim matris elde eden program
	public static void soru3() {
                int m[][] = new int[5][5];
	        int i, k, row, col;
	        row = 5;
	        col = 5;
	        
	        for(i = 0; i < row; i++) 
                        m[i][i] = 1;
                        
	        for(i = 0; i < row; i++) {
	                for(k = 0; k < col; k++)
                                System.out.print(m[i][k] + " ");
                        System.out.println();
                }
	}

        // Soru _ 5 e 5 lik Ters Birim matris elde eden program
	public static void soru4() {
                int m[][] = new int[5][5];
	        int i, k, row, col;
	        row = 5;
	        col = 5;
	        
	        for(i = 0; i < row; i++) 
                        m[i][col - 1 - i] = 1;
                        
	        for(i = 0; i < row; i++) {
	                for(k = 0; k < col; k++)
                                System.out.print(m[i][k] + " ");
                        System.out.println();
                }
	}

        // Soru _ 5 e 5 lik  hem Düz hem Ters Birim matris elde eden program
	public static void soru5() {
                int m[][] = new int[5][5];
	        int i, k, row, col;
	        row = 5;
	        col = 5;
	        
	        for(i = 0; i < row; i++) { 
                        m[i][i] = 1;
                        m[i][col - 1 - i] = 1;
                }
                        
	        for(i = 0; i < row; i++) {
	                for(k = 0; k < col; k++)
                                System.out.print(m[i][k] + " ");
                        System.out.println();
                }
	}

        // Soru _ 5 e 5 lik  hem Düz, Ters, Dik ve Yatay Birim matris elde eden program
	public static void soru6() {
                int m[][] = new int[15][15];
	        int i, k, row, col;
	        row = 15;
	        col = 15;
	        
	        for(i = 0; i < row; i++) { 
                        m[i][i] = 1;
                        m[i][col - 1 - i] = 1;
                        m[i][row / 2] = 1;
                        m[col / 2][i] = 1;
                }
                        
	        for(i = 0; i < row; i++) {
	                for(k = 0; k < col; k++)
                                System.out.print(m[i][k] + " ");
                        System.out.println();
                }
	}

        // Soru _ 
	public static void soru7() {
                int m[][] = new int[5][5];
	        int i, k, s, row, col;
	        row = 5;
	        col = 5;
	        s = 1;
	        
	        for(i = 0; i < row; i++)
        	        for(k = 0; k <= i; k++) { 
                                m[i][k] = s;
                                s++;
                        }
                        
	        for(i = 0; i < row; i++) {
	                for(k = 0; k < col; k++)
                                System.out.print(m[i][k] + " ");
                        System.out.println();
                }
	}

        // Soru _ 
	public static void soru8() {
                int m[][] = new int[5][5];
	        int i, k, count, row, col;
	        row = 5;
	        col = 5;
	        count = 0;
	        
	        for(i = 0; i < row; i++)
        	        for(k = 0; k <= i; k++) { 
                                count++;
                                m[i][k] = count;
                        }
                        
	        for(i = 0; i < row; i++) {
	                for(k = 0; k < col; k++) {
        	                if(m[i][k] < 10) 
                                        System.out.print(" ");
                                System.out.print(m[i][k] + " ");
                        }
                        System.out.println();
                }
	}

        // Soru _ 
	public static void soru9() {
                int m[][] = new int[5][5];
	        int i, k, count, row, col;
	        row = 5;
	        col = 5;
	        count = 0;
	        
	        for(i = 0; i < row; i++)
        	        for(k = col - 1 - i; k < col; k++) { 
                                count++;
                                m[i][k] = count;
                        }
                        
	        for(i = 0; i < row; i++) {
	                for(k = 0; k < col; k++) {
        	                if(m[i][k] < 10) 
                                        System.out.print(" ");
                                System.out.print(m[i][k] + " ");
                        }
                        System.out.println();
                }
	}

                        
        
}

