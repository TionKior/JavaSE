package com.ssx03LambdaLianXi3;

//练习3:
//定义一个接口(Addable), 里面定义一个抽象方法: int add(int x.int y);
//定义一一个测试类(AddableDemo),在测试类中提供两个方法
//一一个方法是: useAddable(Addable)
//一个方法是主方法,在主方法中调用useAddable方法
public class AddableDemo {
    public static void main(String[] args) {
        //Lambda实现
        useAddable((int x, int y) -> {
            //真正实现的是这个方法体里面的内容
            return x + y;
            //return x - y;  -10
        });

    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
