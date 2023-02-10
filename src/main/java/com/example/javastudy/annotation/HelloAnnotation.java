package com.example.javastudy.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

/**
 * Annotation을 만드는 단계이다.
 * Retention은 Annotion을 어띠까지 유지할 것인지를 의미한다.
 *
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Qualifier("HelloAnnotation")
public @interface HelloAnnotation {
}
