import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String shouldContinue = "yes";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose the currency");

		System.out.println("1. Ruppe");
		System.out.println("2. USD");
		System.out.println("3. Euro");

		int choice = scan.nextInt();

		System.out.println("Enter the amount");
		double amount = scan.nextDouble();


		switch (choice) {
		case 1:
			Ruppe_Conversion(amount);
			break;
		case 2:
			USD_Conversion(amount);
			break;
		case 3:
			Euro_Conversion(amount);
			break;
		default:
			System.out.println("Invalid choice");
		}

	}

	public static void Ruppe_Conversion(double amt) {

		System.out.println(amt+" Ruppe = " + (amt*0.013) + " USD");

		System.out.println(amt+" Ruppe = " + (amt*0.012) + " Euro");


	}


	public static void USD_Conversion(double amt) {

		System.out.println(amt+" USD = " + (amt*79.37) + " Ruppe");

		System.out.println(amt+" USD = " + (amt*0.98) + " Euro");
	}



	public static void Euro_Conversion(double amt){

		System.out.println(amt+" Euro = " + (amt*80.85) + " Ruppe");

		System.out.println(amt+" Euro = " + (amt*1.02) + " USD");
	}

}
