package com.lx.auth.common.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface IgnorePermission {
    //加上此注解的接口不需要授权
}
