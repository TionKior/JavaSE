package com.ssx01;

/**
 * @ClassName : JDKNeiZhiZhuJie
 * @Description : JDK内置注解
 * @Author : 史晟贤
 * @Date : 2021/3/5 15:51
 * @Version V1.0
 */
@SuppressWarnings("all")
public class JDKNeiZhiZhuJie {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1() {
        //有缺陷
        //删除show1可能就不会兼容低版本了
    }

    public void show2() {
        //替代show1方法
    }

    public void demo() {
        show1();
    }






}
