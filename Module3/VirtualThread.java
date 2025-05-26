import java.util.*;
public class VirtualThread {
public static void main(String[] inputValues){
for(int taskCounter=0;taskCounter<100000;taskCounter++){
Thread.startVirtualThread(()->
System.out.println("Hello from virtual thread "+Thread.currentThread().getId()));
}
}
}
