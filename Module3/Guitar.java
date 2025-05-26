import java.util.*;
public class Guitar implements Playable{
public void play(){
	System.out.println("Guitar plays melody");
}
public static void main(String args[]){
Guitar oj = new Guitar();
oj.play();	
}
}