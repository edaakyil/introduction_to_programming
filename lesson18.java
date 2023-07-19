/* July 13 2023 */

public class Main
{

        public static void main(String[] args) {}
        
        // Soru _ Dizinin en büyük elemanını bulan program
	public static void soru1() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, size, max;
		size = 10;
		max = a[0];
		
		for(i = 1; i < size; i++)
		        if(max < a[i])
		                max = a[i];
		                
                System.out.println("Dizinin en büyüğü: " + max);
	}

        // Soru _ Dizinin en büyük ve en küçük elemanlarını bulan program
	public static void soru2() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, size, max, min;
		size = 10;
		max = a[0];
		min = a[0];
		
		for(i = 1; i < size; i++)
		        if(max < a[i])
		                max = a[i];
	                else if(a[i] < min)
	                        min = a[i];
		                
                System.out.println("Dizinin en büyüğü: " + max);
                System.out.println("Dizinin en küçüğü: " + min);
	}

        // Soru _ Dizinin en büyük elemanını ve indis numarasını  bulan program
	public static void soru3() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, size, max, p;
		size = 10;
		max = a[0];
		p = 0;   // position
		
		for(i = 1; i < size; i++) 
		        if(max < a[i]) {
		                max = a[i];
		                p = i;
                        }
		                
                System.out.println("Dizinin en büyüğü: " + max);
                System.out.println("Dizinin en büyüğünün indis numarası: " + p);
	}

        // Soru _ Dizinin en büyük elemanı ile en küçük elemanını yer değiştiren program
	public static void soru4() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, size, max, min, pMax, pMin;
		size = 10;
		max = a[0];
		min = a[0];
		pMax = 0;
		pMin = 0;
		
		for(i = 1; i < size; i++) 
		        if(max < a[i]) {
		                max = a[i];
		                pMax = i;
	                } else if(a[i] < min) {
	                        min = a[i];
		                pMin = i;
                        }
                
                a[pMax] = min;
                a[pMin] = max;
		                
                for(i = 0; i < size; i++)
                        System.out.print(a[i] +" ");
	}

        // Soru _ Dizinin ilk elemanı ile en küçük elemanını yer değiştiren program
	public static void soru5() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, size, min, pMin;
		size = 10;
		min = a[0];
		pMin = 0;
		
		for(i = 1; i < size; i++) 
		        if(a[i] < min) {
	                        min = a[i];
		                pMin = i;
                        }
                
                a[pMin] = a[0];
                a[0] = min;
		                
                for(i = 0; i < size; i++)
                        System.out.print(a[i] +" ");
	}

        // Soru _ Dizinin sondan 9 elemanının en küçük ile yine sondan 9 elemanının ilk elemanı yer değiştiren program
	public static void soru6() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, size, min, pMin;
		size = 10;
		min = a[size - 9];
		pMin = size - 9;
		
		for(i = size - 9; i < size; i++) 
		        if(a[i] < min) {
	                        min = a[i];
		                pMin = i;
                        }
                
                a[pMin] = a[size - 9];
                a[size - 9] = min;
		                
                for(i = 0; i < size; i++)
                        System.out.print(a[i] +" ");
	}

	/// Selection Sort Algoritması ile
        // Soru _ Dizinin elemanlarını küçükten büyüğe doğru sıralayan program
	public static void soru7() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, k, size, min, pMin;
		size = 10;
		
		/// Aşağıdaki Algoritmanın adı "Selection Sort" (Seçerek Sıralama) dır.
		for(k = 0; k < size - 1; k++) {
        		min = a[k]; 
        		pMin = k;  
        		
        		for(i = k + 1; i < size; i++) 
        		        if(a[i] < min) {
        	                        min = a[i];
        		                pMin = i;
                                }
                        
                        a[pMin] = a[k]; 
                        a[k] = min;
                }
		                
                for(i = 0; i < size; i++)
                        System.out.print(a[i] +" ");
	}

	/// Selection Sort Algoritması ile
        // Soru _ Dizinin elemanlarını küçükten büyüğe doğru sıralayan program
        // Her aşaması yazırılsın istersek:
	public static void soru8() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, k, size, min, pMin;
		size = 10;
		
		/// Aşağıdaki Algoritmanın adı "Selection Sort" (Seçerek Sıralama) dır.
		for(k = 0; k < size - 1; k++) {
        		min = a[k]; 
        		pMin = k;  
        		
        		for(i = k + 1; i < size; i++) 
        		        if(a[i] < min) {
        	                        min = a[i];
        		                pMin = i;
                                }
                        
                        a[pMin] = a[k]; 
                        a[k] = min;

			 for(i = 0; i < size; i++)
                        	System.out.print(a[i] +" ");
                	System.out.println();
                }
		                
	}

	/// Bubble Sort Algoritması ile
        // Soru _ Dizinin elemanlarını küçükten büyüğe doğru sıralayan program
        // Her aşaması yazırılsın istersek:
	public static void soru9() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, k, size,temp;
		size = 10;
		
		/// Aşağıdaki Algoritmanın adı "Bubble Sort" (Kabarcık Sıralama) dır.
		// Bubble Sort --> Sırasıyla yan yana olan elemanlar karşılaştırılır ve 
		// konumları birbirlerine göre doğru değilse yer değiştirirler. 
		// Bu algoritmada hep en baştan başlanılır
		for(i = 0; i < size - 1; i++) {
        		
        		for(k = 0; k < size - 1; k++) 
        		        if(a[k + 1] < a[k]) {
        		                temp = a[k];
        		                a[k] = a[k + 1];
        		                a[k + 1] = temp;
        		                
                                }
                                
                        for(k = 0; k < size; k++)
                                System.out.print(a[k] +" ");
                        System.out.println();
                        
                }
	}

	// 9. sorunun iyileştirilmiş hali (Gereksiz taramadan kurtuluyoruz)
  	/// Bubble Sort Algoritması ile
        // Soru _ Dizinin elemanlarını küçükten büyüğe doğru sıralayan program
        // Her aşaması yazırılsın istersek:
	public static void sioru10() {
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, k, size,temp;
		size = 10;
		
		/// Aşağıdaki Algoritmanın adı "Bubble Sort" (Kabarcık Sıralama) dır.
		// Bubble Sort --> Sırasıyla yan yana olan elemanlar karşılaştırılır ve 
		// konumları birbirlerine göre doğru değilse yer değiştirirler. 
		// Bu algoritmada hep en baştan başlanılır
		for(i = 0; i < size - 1; i++) {
        		
        		// [size - 1 - i] diyerek Gereksiz taramadan kurtuluyoruz
        		for(k = 0; k < size - 1 - i; k++) 
        		        if(a[k + 1] < a[k]) {
        		                temp = a[k];
        		                a[k] = a[k + 1];
        		                a[k + 1] = temp;
        		                
                                }
                                
                        for(k = 0; k < size; k++)
                                System.out.print(a[k] +" ");
                        System.out.println();
                        
                }
	}
	
}
