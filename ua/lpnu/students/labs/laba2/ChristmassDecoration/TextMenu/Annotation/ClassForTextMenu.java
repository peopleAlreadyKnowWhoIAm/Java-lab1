package ua.lpnu.students.labs.laba2.ChristmassDecoration.TextMenu.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface ClassForTextMenu {
    String name();   
}