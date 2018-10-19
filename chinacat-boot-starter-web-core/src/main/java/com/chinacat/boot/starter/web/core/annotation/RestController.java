package com.chinacat.boot.starter.web.core.annotation;


import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Controller;

import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
@org.springframework.web.bind.annotation.RestController
public @interface RestController {
    @AliasFor(
            annotation = org.springframework.web.bind.annotation.RestController.class
    )
    String value() default "";
}
