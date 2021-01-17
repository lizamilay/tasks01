
public class Task6 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;

		a = 120;
		b = 20;
		c = 180-a-b;


		if (a>0 & b>0 & c>0 ) {
		System.out.print("Треугольник существует ");}
		else {
		System.out.print("Треугольник не существует ");
		return;
		}
		if (a == 90 || b == 90 || c == 90) {
		System.out.print("Треугольник прямоугольный ");}
		else {
		System.out.print("Треугольник не прямоульный ");
		return;
		}
		}}

