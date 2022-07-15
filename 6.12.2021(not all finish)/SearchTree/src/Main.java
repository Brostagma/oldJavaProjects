import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
	}
	
	private Scanner scn;
	private int kok, girilen,r = 0,l = 0,secim,level,levelIndex = -1;
	private boolean check = false;
	private int[] left;
	private int[] right;
	
	private void tree() {
		
		while(true) {
			
			secim = scn.nextInt();
			
			if(secim == 1) {
				
				if(check == false) {
					
					System.out.print("Kök Girin: ");
					kok = scn.nextInt();
					check = true;
				}
				
				else if(check == true) {
					
					System.out.println(" ");
					System.out.print("Sayı Girin: ");
					girilen = scn.nextInt();
					
					if(kok < girilen) {
						
						right[r] = girilen;
						r++;
					}
					
					else if(kok > girilen) {
						
						left[l] = girilen;
						l++;
					}
					
				}
				
				levelIndex++;
				
			}
			
			if(secim == 2) {
				
				level = scn.nextInt();
				
				
			}
			
		}
		
	}
}
