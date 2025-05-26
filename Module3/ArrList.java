import java.util.*;
public class ArrList{
	public static void main(String args[]){
	Scanner sc= new	Scanner(System.in);
	ArrayList<String> Stnames = new ArrayList<>();
	System.out.println("Enter the num of Studentes");
	int numofStd = sc.nextInt();sc.nextLine();

	for(int in =0; in<numofStd; in++){
	System.out.println("Enter name : ");
	String nm = sc.nextLine();
	Stnames.add(nm);
	}
	System.out.println("Student list is : ");
	for (String y : Stnames){
	System.out.println(y);	
}

}



}