package annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * lesson 8
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Format {

    /**
     * Имя поля, которое надо распечатать
     */
    String fieldName();
    boolean fullDescription() default true;
}
