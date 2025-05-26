import java.lang.reflect.Method;

public class ReflectionDemo {
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("ReflectionDemo");
        Object obj = cls.getDeclaredConstructor().newInstance();

        Method method = cls.getMethod("greet", String.class);

        System.out.println("Methods in class:");
        for (Method m : cls.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

        method.invoke(obj, "World");
    }
}
