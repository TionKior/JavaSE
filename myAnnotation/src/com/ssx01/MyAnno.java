package com.ssx01;

public @interface MyAnno {

    //int类型
    int value();

    //枚举类型
    Person per();

    //注解类型
    MyAnno2 anno2();

    //以上类型数组
    String[] strs();

//    String name() default "史晟贤";

//    //String类型
//    String show2();
//a

//

//


}
