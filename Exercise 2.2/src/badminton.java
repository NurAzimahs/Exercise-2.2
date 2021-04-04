
public class badminton {
	
	String brand;
	String weight;
	String colour;
	int quantity;
	double price;
	
	
	void printBadminton(String b, String w, String c, String a){
		System.out.println("Brand : " + b);
		System.out.println("Weight : " + w + "g");
		System.out.println("Colour : " + c);
		System.out.println("Behaviour : " + a);
	}
	
	void printPrice(int q, double p, double total) {
		total = p*q;
		System.out.printf("Total price : %.2f\n ", total );
	}
	
	void printMaterial(String frame, String shaft, String lbs ) {
		System.out.println("Frame Material  : " + frame );
		System.out.println("Shaft Material : " + shaft );
		System.out.println("String Tension : " + lbs);
	}
	
	void printTechnology(String t) {
		System.out.println("Technology : " + t);
	}
}
