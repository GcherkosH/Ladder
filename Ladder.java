 
import java.util.Scanner;

public class Ladder {

		
		private int v; 			// Anle of the ladder with respect to ground
		private int h; 		// height of wall
		private int l;		// length of the ladder

		public Ladder(){

			Scanner k  = new Scanner(System.in);
			this.h = k.nextInt();
			this.v = k.nextInt();
			if (h < 0 || h > 1000 || v < 0 || v >90)
				System.out.println(" Please enter valid values of h and v. 0 < h < 1001, 0 < v < 90");
			}

		public int calculate_length( ){

			double v = Math.toRadians (this.v); 		// Changing the angel in degree in to radians value
			this.l = (int) Math.ceil(this.h/Math.sin(v));  // By using the sin law in mathematics, calculating the ladder length
			return this.l;

		} 

	public static void main(String[] args){
			
			try {
				int v;
				Ladder ladder = new Ladder();
				v = ladder.calculate_length();
				System.out.println(v);
			}

			catch (Exception E){

				System.out.print(E.getMessage());
			}


	}

}