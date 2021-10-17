import java.util.HashSet;


public class Test {

	public static void main(String[] args) {
			HashSet hs = new HashSet();
			hs.add("Java");
			hs.add("Angular");
			hs.add("ReactJS");
			hs.add("JavaScript");
			hs.add("Python");
			
			
			System.out.println(hs);
			
			
			//For each loop
			for (Object object : hs) {
				System.out.println(object);
			}
			
	}

}
