package com.ssx01;
//子类继承不同包的父类,能用protected和public
import cn.ssx01.Fu;

public class Zi extends Fu{
    public static void main(String[] args) {
        Zi z=new Zi();
        z.show3();
        z.show4();
    }
}
