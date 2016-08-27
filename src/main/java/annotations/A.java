package annotations;

import java.lang.reflect.Method;

/**
 *
 */
public class A {
    @Format(fieldName = "type")
    public void print(Object object) throws Exception {
        Format annot = A.class.getMethod("print", Object.class).getAnnotation(Format.class);
        System.out.println(annot);
        String fieldName = annot.fieldName();
        Method getter = object.getClass().getMethod(getGetterNameForField(fieldName));
        Object value  = getter.invoke(object);
        System.out.println(value.toString());
    }

    private String getGetterNameForField(String fieldName) {
        return "get" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1).toLowerCase();
    }
}
