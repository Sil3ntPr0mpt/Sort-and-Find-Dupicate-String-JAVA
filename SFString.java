//Coded by Anuwat Khongchuai A.K.A Sil3ntPr0mpt from TRN-SEC Group.
//RMUTSV String Test.
//This is first part of full code.
import java.util.Scanner; 
public class SFString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String base_alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String input_alpha;
		int i,j;
		//int k,l;
		//int count=0;
		
		System.out.println("Enter Alphabet > ");
		
		input_alpha = sc.nextLine();
		
		for(i=0;i<=base_alpha.length()-1;i++){
			for(j=0;j<=input_alpha.length()-1;j++){
				if(base_alpha.charAt(i) == input_alpha.charAt(j)){
					System.out.print(base_alpha.charAt(i));
					
				}
				
			}
				
		}
		System.out.println("\n");
		
		
	}
	
}
