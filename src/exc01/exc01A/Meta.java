package exc01.exc01A;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str = "Два параметра", value = 29)
    public static void myMeth(String str, int i){
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str()+" "+anno.value());
        }catch(NoSuchMethodException e){
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("Test",10);
    }
}
