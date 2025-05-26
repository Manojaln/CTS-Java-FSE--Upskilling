import java.lang.reflect.Method;

public class Reflection{
public static void main(String[] paramArgs){
try{
Class<?> arrayListMeta=Class.forName("java.util.ArrayList");
Method[] functionSet=arrayListMeta.getDeclaredMethods();
for(Method singleFunc:functionSet){
System.out.println(singleFunc.getName());
}
}catch(ClassNotFoundException typeLoadEx){
typeLoadEx.printStackTrace();
}
}
}
