import java.util.Scanner;
public class Task8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0, x = 0, y = 0, z = 0;
		
		System.out.print("������� a: ");
		if (sc.hasNextDouble())
		     a = sc.nextDouble();
		System.out.print("������� b: ");
		if (sc.hasNextDouble())
		     b = sc.nextDouble();
		System.out.print("������� x: ");
		if (sc.hasNextDouble())
		     x = sc.nextDouble();
		System.out.print("������� y: ");
		if (sc.hasNextDouble())
		     y = sc.nextDouble();
		System.out.print("������� z: ");
		if (sc.hasNextDouble())
		     z = sc.nextDouble();
		
		if ((a > x) && (b > y))
		     System.out.println("�������.");
		else if ((a > y) && (b > x))
		     System.out.println("�������.");
		else if ((a > x) && (b > z))
		     System.out.println("�������.");
		else if ((a > z) && (b > x))
		     System.out.println("�������.");
		else if ((a > y) && (b > z))
		     System.out.println("�������.");
		else if ((a > z) && (b > y))
		     System.out.println("�������.");
		else
		     System.out.println("�� �������.");
		  sc.close();
		}
		}


