
public class Task11 {
	public static void main(String[] args) {
		double a,b,h;
		
		a = 0;
		b = 4.4;
		
		h = 0.3;
		
		double x = a;
		double y;
		while(x <= b) {
			if( x > 2) {
				y = x;
			}
			else {
				y = -x;
			}
			System.out.print(y + "  ");
			x = x + h;
		}
		
	}
}

