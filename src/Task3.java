
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
	    		   System.out.println("���������");
	    	   }
	    		   kbt = A % 1024;
		    	   A = A / 1024;
		    	   if (A == 0) {
		    		   System.out.println("���������");  
		    	   } 
		    		   mbt = A % 1024;
			    	   A = A / 1024;
			    	   if (A == 0) {
			    		   System.out.println("���������");
			    	   }   
			    		   gbt = A % 1024;
				    	   A = A / 1024;
				    	   if (A == 0) {
				    		   System.out.println("���������");
			 }
		    System.out.print("���������: " + gbt + " ��, " + mbt + " ��, " + kbt + " ��, " + bt + " ���� ");
		}
	}

