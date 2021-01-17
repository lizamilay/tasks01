
public class Task1 {
		public static void main(String[] args) {
			double a;
			double b;
			double c;
			double d;
			
			a = 5.6;
			b = 1.2;
			c = 4.5;
			
			if(a==0.0) {
				 System.out.println("Nelzy");
				 return;
			}
			
			d = (b + Math.sqrt(b*b + 4 * a * c)) / (2*a) - Math.pow(a, 3);
			System.out.println(d);
			
		}
	}
