import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
			int x = input.nextInt();
			
			int y = input.nextInt(); 
			
			if((x>0)&&(y>0)){
				System.out.println("1");
			}
			if((x<0)&&(y>0)) {
				System.out.println("2");	
			}
		 
			if((x<0)&&(y<0)) {
				System.out.println("3");
			}
			if((x>0)&&(y<0)) {
			System.out.println("4");
			
			}
			
		}
	}

