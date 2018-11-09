import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class Car {
   public abstract void name();
   public abstract void drive();
}

//interface Car {
//   public abstract void name();
//   public abstract void drive();
//}
class BMW extends Car {
   public void name() {
        System.out.println("BMW");
    }

    public void drive() {
        System.out.println("Drive BMW");
    }
}

class Audi extends Car {
    public void name() {
        System.out.println("Audio");
    }
    public void drive() {
        System.out.println("Drive Audio");
    }
}

public class TestFinal {
    private static void test(Class<? extends Car> type) {
        Car car = null;
        try {
            car = type.newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        car.name();
        car.drive();
    }
    public static void main(String[] args) {
        List<Class<? extends  Car>>  types = new ArrayList<Class<? extends  Car>>();
        types.add(BMW.class);
        types.add(Audi.class);
        for(Class<? extends  Car> car : types) {
            test(car);
        }
//        String[] classNames = new String[]{"BMW", "Audi"};
//        for(String className: classNames) {
//            try {
//                test( (Class<? extends  Car> )Class.forName(className));
//            }catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
    }
}

/*
public class TestFinal {
    private static final Map<String, String> table = new HashMap<String, String>();
    public static void main(String[] args) {
        table.put("Hello", "World");
        System.out.println(table);
    }
}
*/