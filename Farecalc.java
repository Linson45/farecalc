import java.util.Scanner;

public class Farecalc {

	public static void main(String[] args) {
		//What if we don't give the arguments for the main method?
		//u want me to remove the arguments? No, just a concern. Please carry on
		int i=0;
		Scanner reader=new Scanner(System.in);
		while(i<=3) {
			System.out.println("Enter a choice");
			System.out.println("1. Press 1 for Mini");
			System.out.println("2. Press 2 for Sedan");
			System.out.println("3. Press 3 for SUV");
			System.out.println("3. Press 4 to exit");
			i=reader.nextInt();
			int dist=0;
			int fare=0;
			switch(i) {
			case 1:System.out.println("Enter the distance to travel");				 
				 dist=reader.nextInt();
				 fare=mini(dist);
				break;
			case 2:System.out.println("Enter the distance to travel");				 
			 dist=reader.nextInt();
			 fare=sedan(dist);
				break;
			case 3:System.out.println("Enter the distance to travel");				 
			 dist=reader.nextInt();
			 fare=suv(dist);
				break;				
			default:				
				break;
			//Sorry to barge in, what is the use of break statement in default case? if input is other than the
			//cases to break out of the switch, okay Please carry on. Don't mind me asking questions
			}
			if(fare!=0) {
				System.out.println("The fare is "+fare);	
			}
			
		}
		
	}
	
	private static int suv(int dist) {
		// TODO Auto-generated method stub
		int baseDist=5;
		int basePrice=100;
		int travel=0;
		int totalFare=0;
		//int mileStoneDist=75;
		//int priceAfter=8;
		if(dist >baseDist) {
				travel=dist-baseDist;
				totalFare=basePrice+(travel*15);									
		}else {
			totalFare=basePrice;
		}
		
		return totalFare;
	}

	private static int sedan(int dist) {
		// TODO Auto-generated method stub
		int baseDist=5;
		int basePrice=80;
		int travel=0;
		int totalFare=0;
		int mileStoneDist=100;
		int priceAfter=10;
		if(dist >baseDist) {
			if(dist>mileStoneDist) {
				totalFare=dist*priceAfter;
			}else {
				travel=dist-baseDist;
				totalFare=basePrice+(travel*12);					
			}
			
		}else {
			totalFare=basePrice;
		}
		
		return totalFare;
	}

	private static int mini(int dist) {
		// TODO Auto-generated method stub
		int baseDist=3;
		int basePrice=50;
		int travel=0;
		int totalFare=0;
		int mileStoneDist=75;
		int priceAfter=8;
		if(dist >baseDist) {
			if(dist>mileStoneDist) {
				totalFare=dist*priceAfter;
			}else {
				travel=dist-baseDist;
				totalFare=basePrice+(travel*10);					
			}
			
		}else {
			totalFare=basePrice;
		}		
		return totalFare;
	}
}
