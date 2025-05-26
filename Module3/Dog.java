import java.util.*;
class Dog extends Animal{

@Override
public void makeSound(){
	System.out.println("Barking Dog");
}

public static void main(String args[]){

Dog oj= new Dog();
oj.makeSound();

}}