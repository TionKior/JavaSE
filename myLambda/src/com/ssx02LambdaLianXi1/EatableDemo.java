package com.ssx02LambdaLianXi1;

//练习1
//定义一个接口(Eatable),里面定义一个抽象方法: void eat();
//定义一个测试类(EatableDemo), 在测试类中提供两个方法
//一个方法是: useEatable(Eatable)
//一个方法是主方法，在主方法中调用useEatable方法
public class EatableDemo {
    public static void main(String[] args) {
        //在主方法中调用useEatable方法
        //创建实现类对象
        Eatable e = new EatableImpl();
        useEatable(e);

        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃东西");
            }
        });

        //Lambda表达式
        //接口中的方法没有参数,直接()就可以
        useEatable(() -> {
            System.out.println("吃东西");
        });

    }

    private static void useEatable(Eatable e) {
        e.eat();
    }

}
