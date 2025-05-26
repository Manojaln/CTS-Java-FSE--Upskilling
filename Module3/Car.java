import java.util.*;
public class Car{
String make;
String model;
int year;

Car(String make , String model , int year){
	this.make=make;
	this.model=model;
	this.year=year;

}

public void display(){
	System.out.println("Car Made by : " + make);
        System.out.println("Car Model is : " + model);
        System.out.println("Car Year is : " + year);
}

public static void main (String args[]){
	Car oj= new Car("Tesla", "Model 3", 2023);
	oj.display();
	
}






}