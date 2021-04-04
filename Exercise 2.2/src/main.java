import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int q;
		double p;
		double total=0;		
		
		badminton yonex = new badminton(); //create first new object yonex

		yonex.printBadminton("Yonex", "75", "Orange","Smash, Defend, Drop");
		yonex.printMaterial("H.M Graphite + M40X + HMG", "H.M Graphite", "28lbs");
		yonex.printTechnology("Sonic Flare System, Razor Frame, Nanometric");
		System.out.print("Quantity : ");
		q = scan.nextInt();
		System.out.print("Price per unit : ");
		p = scan.nextDouble();
		yonex.printPrice(q, p, total);
		System.out.println();
		
		
		badminton lining = new badminton();//create second new object lining

		lining.printBadminton("Lining", "76", "Black", "Smash, Defend, Drop");
		lining.printMaterial("Military Grade Carbon Fibre", "Military Grade Carbon Fibre", "30lbs");
		lining.printTechnology("Wing Stabilizer, Dynamic Optimum Frame, Tb Nano");
		System.out.print("Quantity : ");
		q = scan.nextInt();
		System.out.print("Price per unit : ");
		p = scan.nextDouble();
		lining.printPrice(q, p, total);
		System.out.println();

	}

}
