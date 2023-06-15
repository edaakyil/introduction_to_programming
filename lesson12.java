/*  June 15 2023 */

public class Main
{
	
	public static void main(String[] args) { }
  
  // Soru _ 1 ile 100 rasındaki 3'ün 4'ün ve 5'in katlarını ekrana iç içe yazdıran program
	public static void soru1() {
		int i;
		
		for(i = 1; i <= 100; i++){
		  if(i % 3 == 0) 
		    System.out.print(i + " ");
	    if(i % 4 == 0) 
		    System.out.print(i + " ");
	    if(i % 5 == 0) 
		    System.out.print(i + " ");
		}
	}
	
	// Soru _ 1 ile 100 rasındaki 3'ün 4'ün ve 5'in katlarını ekrana iç içe yazdıran program Ama sayı tekrarı olmayacak
	public static void soru2() {
		int i;
		
		for(i = 1; i <= 100; i++)
		  if(i % 3 == 0) 
		    System.out.print(i + " ");  
	    else if(i % 4 == 0) 
		    System.out.print(i + " ");
	    else if(i % 5 == 0) 
		    System.out.print(i + " ");
	}
	
}




/*	a ile b arasındaki n'nin katlarını yazdırma:
		for(i = a + (5 - a % 5); i < b; i += 5)
      System.out.print(i + " ");
*/
