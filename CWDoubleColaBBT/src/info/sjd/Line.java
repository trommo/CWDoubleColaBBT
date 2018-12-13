package info.sjd;

public class Line {
	   public static String WhoIsNext(String[] names, int n) {
	        String[] names1 = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	        if (n <= names1.length - 1) {
	          return names1[n - 1];
	          } else {
	            return names1[(n % names1.length) - 1]; 
	            }
	      }
	   
	   public static void main(String[] args) {
	        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	        int n = 12;
	        System.out.println(WhoIsNext(names, n));
	   }
	   
	}