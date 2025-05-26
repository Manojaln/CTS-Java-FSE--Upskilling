import java.util.*;
public class PtnSwitch {
public static void main(String[] args) {
        checkType(42);
        checkType("Hello Dude");checkType(1.124);
        checkType(true);
        checkType(null);
}

    public static void checkType(Object obj) {
        String result = switch (obj) {
        case Integer in -> "It's an Integer: " + in;
           case String st  -> "It's a String: " + st ;
          case Double db  -> "It's a Double: " + db;
              case Boolean bl -> "It's a Boolean: " + bl;
             case null      -> "It's null";
               default        -> "Unknown type: " + obj;
        };
        System.out.println(result);
}
}
