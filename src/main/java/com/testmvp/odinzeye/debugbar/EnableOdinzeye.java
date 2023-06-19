package com.testmvp.odinzeye.debugbar;

import com.testmvp.odinzeye.OdinzeyeApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(OdinzeyeApplication.class)
public @interface EnableOdinzeye {
}
