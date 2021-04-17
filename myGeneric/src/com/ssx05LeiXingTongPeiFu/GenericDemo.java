package com.ssx05LeiXingTongPeiFu;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {

        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();
        System.out.println("--------");
//        extends上限是Number 不能是Number的父类(Object)
//        List<? extends Number> list4=new ArrayList<Object>();
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();

        List<? super Number> list7 = new ArrayList<Object>();
        List<? super Number> list8 = new ArrayList<Number>();
//        super下限是Number 不能是Number的子类(Integer)
//        List<? super Number> list9=new ArrayList<Integer>();

    }
}
