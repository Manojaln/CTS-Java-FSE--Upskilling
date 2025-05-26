import java.util.*;
public class SortEg{

	public static void main(String args[]){
	List<String> nm = new ArrayList<>();
	nm.add("Cristiano");
	nm.add("Suresh");
	nm.add("Antony");
	nm.add("Balu");
	nm.add("George");

	Collections.sort(nm , (s1 ,s2) -> s1.compareTo(s2));
	System.out.println("\nSorted list");
	for (String nm1 : nm){
	System.out.println(nm1);	
} 
}
}