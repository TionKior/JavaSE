package com.ssx01MoRenFangFa;

public interface MyInterface {
    void show1();

    void show2();

    //直接在接口中添加方法,所有实现类都需要重写
    //void show3();

    default void show3(){
        System.out.println("show3");
    }

}

