import java.util.*;
public class MethodOverLoading{
public static int add(int m ,int n){
return m+n; }

public static double add(double o , double p){
	return o+p; }

public static int add(int q , int r , int s){
return q+ r+ s; }

public static void main(String args[]){
 MethodOverLoading in = new MethodOverLoading();
	System.out.println(in.add(2,3));
	System.out.println(in.add(2.5,3.5));
	System.out.println(in.add(2,3,4));
}




}