import java.util.TreeSet;


public class Test3 {
		public static void main(String[] args) {
			
			TreeSet ts = new  TreeSet();
			
			ts.add("Java");
			ts.add("Angular");
			ts.add("ReactJS");
			ts.add("JavaScript");
			ts.add("Python");
			
			for (Object object : ts) {
				System.out.println(object);
			}

		}
}
