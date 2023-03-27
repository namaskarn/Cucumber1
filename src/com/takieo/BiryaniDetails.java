package com.takieo;

	import java.util.Scanner;

	public class BiryaniDetails {
		
		int chickenbiryani_price = 100;

		int veg_price = 100;

		static int biryani_total = 0;

		Scanner sc = new Scanner(System.in);

		int chicken_biryani_bill = 0;

		void chickenBiryani()
		{
			System.out.println("How many plates do you want");
		
			int plates = sc.nextInt();
			
			chicken_biryani_bill= plates*chickenbiryani_price;
			
			biryani_total+=chicken_biryani_bill;
		
		
			System.out.println(plates+"plate chicken biryani :"+chicken_biryani_bill);
		}
		
		
			
				public  void biryaniMenu() {
					// TODO Auto-generated method stub
					
					

			while(true)

			{
			System.out.println("1 chickenbiryani");
			System.out.println("2 vegbiryani");
			System.out.println("3 back");
			System.out.println("Enter the choice");
			
			
	
	int choice = sc.nextInt();

	switch(choice)
	{
	case 1:
		chickenBiryani();
		biryaniMenu();
		break;
	case 3:
		RestaurantApp.main(null);
		
	default:
		System.out.println("Choose between 1 to 3");

	}//end of switch

			}//end of while
}
}

	
	

