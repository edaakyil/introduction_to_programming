/* July 12 2023 */

public class Main {

        public static void main(String[] args) { }
        
        // Soru _ a dizisindeki tek sayıları b zisinin başına çift sayıları b dizisinin sonuna atayan program. (Sıra önemli değil)
	public static void soru1() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int b[] = new int[10];
		int i, size, po, pe;
		
		size = 10;
		po = 0;
		pe = size - 1;
		 
		 for(i = 0; i < size; i++)
		         if(a[i] % 2 != 0) {
        		         b[po] = a[i];
        		         po++;
		         } else {
        		         b[pe] = a[i];
        		         pe--;
		         }
		 
		for(i = 0; i < size; i++) 
		        System.out.print(a[i] + " ");
	        System.out.println(" ");
		for(i = 0; i < size; i++) 
		        System.out.print(b[i] + " ");
	
	}

        // Soru _ a dizisindeki tek sayıları b zisinin başına çift sayıları b dizisinin sonuna atayan program. (Sıra önemli değil)
	public static void soru2() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int b[] = new int[10];
		int i, size, p;
		
		size = 10;
		p = 0;
		 
		 for(i = 0; i < size; i++) 
		         if(a[i] % 2 != 0) {
        		         b[p] = a[i];
        		         p++;
		         } 
		 
		 for(i = 0; i < size; i++)
		         if(a[i] % 2 == 0) {
        		         b[p] = a[i];
        		         p++;
		         } 
		 
		for(i = 0; i < size; i++) 
		        System.out.print(a[i] + " ");
	        System.out.println(" ");
		for(i = 0; i < size; i++) 
		        System.out.print(b[i] + " ");
	
	}

        // Soru _ a dizisindeki tek sayıları b zisinin başına çift sayıları b dizisinin sonuna atayan program. (Çiftler sıralı olacak şekilde)
	public static void soru3() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int b[] = new int[10];
		int i, size, po, pe, temp;
		
		size = 10;
		po = 0;
		pe = size - 1;
		 
		 for(i = 0; i < size; i++)
		         if(a[i] % 2 != 0) {
        		         b[po] = a[i];
        		         po++;
		         } else {
        		         b[pe] = a[i];
        		         pe--;
		         }
		         
		 for(i = 0; i < (pe - 1) / 2; i++) {
		        temp = b[po + i];
		        b[po + i] = b[size - 1 - i];
		        b[size - 1 - i] = temp;
	        }
		 
	        System.out.println(" ");
		for(i = 0; i < size; i++) 
		        System.out.print(b[i] + " ");
	
	}

        // Soru _ a dizisindeki tek sayıları b zisinin başına çift sayıları b dizisinin sonuna atayan program. (Çiftler sıralı olacak şekilde)
	public static void soru4() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int b[] = new int[10];
		int i, size, po, pe, temp;
		
		size = 10;
		po = 0;
		pe = size - 1;
		 
		 for(i = 0; i < size; i++)
		         if(a[i] % 2 != 0) {
        		         b[po] = a[i];
        		         po++;
		         } else {
        		         b[pe] = a[i];
        		         pe--;
		         }
		         
		 for(i = 0; i < (size - po) /2; i++) {
		        temp = b[po + i];
		        b[po + i] = b[size - 1 - i];
		        b[size - 1 - i] = temp;
	        }
		 
	        System.out.println(" ");
		for(i = 0; i < size; i++) 
		        System.out.print(b[i] + " ");
	
	}

        // Soru _ a dizisindeki içerisinde tekleri başa çiftleri sona atayan program
	public static void soru5() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, size, p, temp;
		size = 10;
		p = 0;
		
		  System.out.println(" ");
		for(i = 0; i < size; i++) 
		        System.out.print(a[i] + " ");
		 
		 for(i = 0; i < size; i++)
		         if(a[i] % 2 != 0) {
		                 temp = a[i];
        		         a[i] = a[p];
        		         a[p] = temp;
        		         p++;
		         } 
		 
	        System.out.println(" ");
		for(i = 0; i < size; i++) 
		        System.out.print(a[i] + " ");
	
	}
	
}
