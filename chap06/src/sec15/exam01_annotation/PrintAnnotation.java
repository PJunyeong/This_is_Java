package sec15.exam01_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface PrintAnnotation {
	String value() default "-";
	// 문자 엘리먼트
	int number() default 15;
	// 문자 출력 개수 엘리먼트
}
