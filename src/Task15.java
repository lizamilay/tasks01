import java.util.Scanner;
public class Task15 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int a, b, nod;
		    a = 0;
		    b = 0;
		    System.out.print("Введите a: ");
			if (sc.hasNextInt()) {
		     a = sc.nextInt();
			}
			System.out.print("Введите b: ");
			if (sc.hasNextInt()) {
		     b = sc.nextInt();
			}
		    if (a < b) {
		      int tmp = a;
		      a = b;
		      b = tmp;
		    }
		    while (b != 0) {
		      nod = a % b;
		      a = b;
		      b = nod;
		    }
		    System.out.println("Наибольший общий делитель равен: " + a);
		    sc.close();
		  }
	 
		}