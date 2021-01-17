//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
public class Task2 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double f;
		
		a = 2.1;
		b = 3.2;
		c = 1.1;
		d = 2.5;
		

		if(c==0.0 || d==0.0) {
			 System.out.println("Nelzy");
			 return;	 
		}
		
		f = (a/c)*(b/d)-((a*b-c)/(c*d));
		System.out.println(f);
	}
		

}
