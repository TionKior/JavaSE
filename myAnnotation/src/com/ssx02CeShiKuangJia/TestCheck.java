package com.ssx02CeShiKuangJia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @ClassName : TestCheck
 * @Description : 简单的测试框架
 * @Author : 史晟贤
 * @Date : 2021/3/5 17:56
 * @Version V1.0
 */
//当主方法执行后,会自动执行被检测的所有方法(加了Check注解的方法),判断方法是否有异常,记录到文件中
public class TestCheck {
    public static void main(String[] args) throws IOException {

        //1.创建计算器对象
        Calculator c = new Calculator();
        //2.获取字节码文件对象
        Class cls = c.getClass();
        //3.获取所有方法
        Method[] methods = cls.getMethods();

        int number = 0;//出现异常的次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            //4.判断方法上是否有Check注解
            if (method.isAnnotationPresent(Check.class)) {
                //5.有,执行
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    //6.捕获异常

                    //记录到文件中
                    number++;

                    bw.write(method.getName() + "方法出异常了");
                    bw.newLine();
                    //getCause()获取异常真实原因,getClass()获取字节码文件,getSimpleName()获取简短类名(不带包名的类名)
                    bw.write("异常的名称:" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    //getCause()获取异常真实原因,getMessage()获取异常的原因
                    bw.write("异常的原因:" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("------------------");
                    bw.newLine();
                }
            }
        }

        bw.write("本次测试一共出现" + number + "次异常");

        bw.flush();
        bw.close();



    }
}
