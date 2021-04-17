package com.ssx02;

//使用类的class属性 来获取该类对应的Class对象。举例: Student.class将会返回Student类对应的Class对象
//调用对象的getClass()方法， 返回该对象所属类对应的Class对象
//      该方法是Object类中的方法，所有的Java对象都可以调用该方法
//使用Class类中的静态方法forName(String className),方法需要传入字符串参数,该字符串参数的值是某个类的全路径,也就完整包名的路径
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        //使用类的class属性 来获取该类对应的Class对象。举例: Student.class将会返回Student类对应的Class对象
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        Class<Student> c2 = Student.class;
        System.out.println(c1 == c2);

        System.out.println("----------");

        //调用对象的getClass()方法， 返回该对象所属类对应的Class对象该方法是Object类中的方法，所有的Java对象都可以调用该方法
        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();

        System.out.println(c1 == c3);

        System.out.println("----------");

        //使用Class类中的静态方法forName(String className),方法需要传入字符串参数,该字符串参数的值是某个类的全路径,也就完整包名的路径
        Class<?> c4 = Class.forName("com.ssx02.Student");
        System.out.println(c1 == c4);

    }
}
