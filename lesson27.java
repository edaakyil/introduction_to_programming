/* August 16 2023 */

public class Main
{
        // Soru 1 _ 10 dan küçük 6 farklı rastgele sayı üreten program
	public static void main(String[] args) {
	        java.util.Random generator = new java.util.Random();
	        int a[] = new int[6];
	        int i, size, n, count, flag;
	        size = 6;
	        count = 0;
                i = 0;
                
	        while(count != size) {
                        n = generator.nextInt(10);
                        flag = 0;
                        for(i = 0; i < count; i++)
	                        if(n == a[i])
	                                flag = 1;
                        if(flag == 0) {
                                a[count] = n;
                                count++;
                       } 
                        
	        }
	        
	        for(i = 0; i < size; i++)
	                System.out.print(a[i] + " ");
	                
	}

        // Soru 2 _ bir milyon defa yazı tura atan ve kaç defa yazı kaç defa tura geldiğini yazdıran program
	public static void main(String[] args) {
	        java.util.Random generator = new java.util.Random();
	        int a[] = new int[6];
	        int i, n, countHeads, countTails, total;
	        total = 10000;
	        countHeads = 0;
                
                for(i = 0; i < total; i++) {
                        n = generator.nextInt(2);
                        countHeads += n;
                }
                        
	        countTails = total - countHeads;
	        
                System.out.println("Tura adedi: " + countHeads);
                System.out.println("Yazı adedi: " + countTails);
	                
	}

        // Soru 3 _ üç milyon 600 defa çift zar atan ve kaç defa yazı kaç defa 6-6 geldiğini yazdıran program
	public static void main(String[] args) {
	        java.util.Random generator = new java.util.Random();
	        int a[] = new int[6];
	        int i, n, dice1, dice2, total, count;
	        total = 30600;
	        count = 0;
                
                for(i = 0; i < total; i++) {
                        dice1 = generator.nextInt(6) + 1;
                        dice2 = generator.nextInt(6) + 1;
                        // if(dice1 * dice2 == 36)
                        if(dice1 + dice2 == 12)
                                        count++;
                }
	        
                System.out.println(count + " defa 6-6 geldi");
	}

        // Soru 4 _ tombala oyuncu - bir milyon defa oynanacak ve kaç defa kazandığı bulunacak 
        // torbada 1-90 kadar 90 tane taş var, oyuncu 90 taştan 3 tanesi çekiyor ve torbaya geri atamıyor. eğer çekilen taşların toplamı 100 veya 100 den küçükse oyuncu kazanıyor
	public static void main(String[] args) {
	        int a[] = new int[3];
	        java.util.Random generator = new java.util.Random();
	        int i, k, size, n, flag, count;
	        double win, total, ratio;
	        size = 3;
	        total = 1000000000;
	        win = 0;
	        
	        for(k = 0; k < total; k++) {
	                count = 0;
        	        while(count != size) {
                                n = generator.nextInt(90) + 1;
                                flag = 0;
                                for(i = 0; i < count; i++)
        	                        if(n == a[i])
        	                                flag = 1;
                                if(flag == 0) {
                                        a[count] = n;
                                        count++;
                               }
        	        }
                       if(a[0] + a[1] + a[2] <= 100)
                                win++;
	        }
	        
                
                ratio = win / total * 100;
	        
                System.out.println("Oyuncunun kazanma olasılığı: %" + ratio);
	}

        // Soru 5 _ tombala oyuncu - bir milyon defa oynanacak ve kaç defa kazandığı bulunacak 
        // torbada 1-90 kadar 90 tane taş var, oyuncu 90 taştan 3 tanesi çekiyor ve torbaya geri atamıyor. eğer çekilen taşların toplamı 100 veya 100 den küçükse oyuncu kazanıyor
	// Nokasından virgülüne kazanma ihtimalini net olarak öğrenme
	
	public static void main(String[] args) {
	        java.util.Random generator = new java.util.Random();
	        int i, k, m;
	        double win, total, ratio;
	        total = 0;
	        win = 0;
	        
	        for(i = 1; i <= 90; i++) 
	                for(k = i + 1; k <= 90; k++)
        	                for(m = k + 1; m <= 90; m++) {
                                       if(i + k + m <= 100)
                                                win++;
                                        total++;
        	                }
	        
                ratio = win / total * 100;
	        
                System.out.println("Oyuncunun kazanma olasılığı: %" + ratio);
	}
	
}
