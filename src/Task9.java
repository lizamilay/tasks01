//9. Вычислить значение функции:
public class Task9 {
	public static void main(String[] args) {
		double x;
		
		x = 4;
		
		double f;
		if(x<=3) {
			f = x*x -3 *x +9;
		}
		else {
			f = 1/(Math.pow(x, 3)+6);
		}
		System.out.print("Результат = " + f);
	}
	}

