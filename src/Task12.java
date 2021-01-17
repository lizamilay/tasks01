//12. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII).
public class Task12 {
	public static void main(String[] args) {
		int a = 1;
		while(a < 200) {
		System.out.println(a + "  -  " + (char)a);
		a++;
		}
	}

}
