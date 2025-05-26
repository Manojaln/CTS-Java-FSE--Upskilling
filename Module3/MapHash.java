
import java.util.*;

public class MapHash {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        Map<Integer, String> mp = new HashMap<>();

	System.out.println("Enter no of std");
	int numofStd = scn.nextInt();
	scn.nextLine();
	for (int y=0;y<numofStd; y++){
	System.out.println("Enter std id: ");
	int id = scn.nextInt();
	scn.nextLine();
	System.out.println("Enter std name: ");
	String nm = scn.nextLine();
	mp.put(id, nm);

}
	System.out.println("Enter std id to search: ");
	int seId = scn.nextInt();

	if (mp.containsKey(seId)) {
            System.out.println("Student name: " + mp.get(seId));
        } else { System.out.println("Student ID not found.");
        }
}
}