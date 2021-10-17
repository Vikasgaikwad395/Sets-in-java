import java.util.LinkedHashSet;

public class Test2 {

	public static void main(String[] args) {
			
		
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("Java");
		lh.add("Angular");
		lh.add("ReactJS");
		lh.add("JavaScript");
		lh.add("Python");
		
		for (Object object : lh) {
			System.out.println(object);
		}
	}

}
