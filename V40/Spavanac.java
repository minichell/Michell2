import java.util.Scanner;

public class Spavanac {


	
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int hour =  input.nextInt();
	
	int minuters =  input.nextInt();
	
	int Hasminuters = hour * 60;
	
	int a = Hasminuters + minuters - 45;
	
	int rest = a % 60;
	
	int resthours = (a - rest)/60;
	
	if(hour >= 0 && hour <=23 && minuters >= 0 && minuters <= 59) {
		
	System.out.println(resthours + " " + rest);

	}
	}
}
