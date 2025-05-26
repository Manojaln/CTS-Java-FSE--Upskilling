import java.util.*;
public class Piano implements Playable{
public void play(){
	System.out.println("Piano plays classical");
}
public static void main(String args[]){
Piano oj = new Piano();
oj.play();	
}
}