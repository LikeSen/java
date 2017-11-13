package example.twentyone_4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		TreeSet<String> treeset=new TreeSet<>(set);
		System.out.println(treeset);
		System.out.println(treeset.higher("Paris"));
	}

}
