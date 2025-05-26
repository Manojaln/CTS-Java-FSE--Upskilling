import java.util.*;
import java.util.stream.Collectors;
public class EvennumStream{

	public static void main(String args[]){

	List<Integer> nmb =Arrays.asList(10,15,5,12,55,14,60);
	List<Integer> evnnumb = nmb.stream().filter(nm -> nm %2 ==0).
	collect(Collectors.toList());
	System.out.println("Even numbers: "+ evnnumb);
}

}