import java.util.concurrent.*;

public class ExecutorServc {
public static void main(String[] inputData){
ExecutorService taskManager=Executors.newFixedThreadPool(5);
Future<Integer> pendingResult=taskManager.submit(()->{
Thread.sleep(1000);
return 42;
});
try{
Integer finalOutput=pendingResult.get();
System.out.println("Result: "+finalOutput);
}catch(InterruptedException|ExecutionException ex){
ex.printStackTrace();
}
taskManager.shutdown();
}
}
