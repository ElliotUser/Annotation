package exc01;

import java.lang.reflect.Method;

public class Meta {
    @MyAnnotation(str = "Пример аннотации", value = 100)
    public static void myMeth(){
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);

            System.out.println(annotation.str()+" "+annotation.value());
        }catch(NoSuchMethodException e){
            System.out.println("Метод не найден.");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}
