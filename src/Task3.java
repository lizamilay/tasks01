//3. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.
public class Task3 {
	    public static void main(String[] args) {
	    	int A;
	    	int bt;
	    	int kbt;
	    	int mbt;
	    	int gbt;
	    	 A = 100000000;
	    	bt = A % 1024;
	    	   A = A / 1024;
	    	   if (A == 0) {
	    		   System.out.println("Закончили");
	    	   }
	    		   kbt = A % 1024;
		    	   A = A / 1024;
		    	   if (A == 0) {
		    		   System.out.println("Закончили");  
		    	   } 
		    		   mbt = A % 1024;
			    	   A = A / 1024;
			    	   if (A == 0) {
			    		   System.out.println("Закончили");
			    	   }   
			    		   gbt = A % 1024;
				    	   A = A / 1024;
				    	   if (A == 0) {
				    		   System.out.println("Закончили");
			 }
		    System.out.print("Результат: " + gbt + " гб, " + mbt + " мб, " + kbt + " кб, " + bt + " байт ");
		}
	}

