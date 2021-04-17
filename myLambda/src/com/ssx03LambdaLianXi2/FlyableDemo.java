package com.ssx03LambdaLianXi2;
//练习2
//定义一个接口(Flyable), 里面定义一个抽象方法: void fly(Strings);
//定定义一个测试类(FlyableDemo), 在测试类中提供两个方法
//一个方法是: useFlyable(Flyable)
//一个方法是主方法，在在方法中调用useFlyable方法
public class FlyableDemo {
    public static void main(String[] args) {
        //在在方法中调用useFlyable方法
        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });
        System.out.println("-----------");

        //Lambda表达式
        useFlyable((String s)->{
            System.out.println(s);
            System.out.println("飞机自驾游");
        });

    }
    private static void useFlyable(Flyable f){
        f.fly("风和日丽,晴空万里");
    }

}
