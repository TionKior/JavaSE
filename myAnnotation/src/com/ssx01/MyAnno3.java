package com.ssx01;

/**
 * @ClassName : MyAnno3
 * @Description : 元注解
 * @Author : 史晟贤
 * @Date : 2021/3/5 16:47
 * @Version V1.0
 */

import java.lang.annotation.*;

/**
 * 元注解:用于描述注解的注解
 * * @Target :描述注解能够作用的位置
 * * @Retention :描述注解被保留的阶段
 * * @Documented :描述注解是否被抽取到api文档中
 * * @Inherited :描述注解是否被子类继承
 */
@Target(value = {ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
//TYPE表示该MyAnno3注解能作用于类上
//METHOD表示该MyAnno3注解能作用于方法上
//FIELD表示该MyAnno3注解只能作用于成员变量上
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnno3 {
}
