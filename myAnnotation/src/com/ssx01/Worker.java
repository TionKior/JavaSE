package com.ssx01;

/**
 * @ClassName : Worker
 * @Description :
 * @Author : 史晟贤
 * @Date : 2021/3/5 16:22
 * @Version V1.0
 */

@MyAnno(value = 18, per = Person.p1, anno2 = @MyAnno2, strs = {"abc", "bcd"})
@MyAnno3
public class Worker {
    @MyAnno3
    public String name = "史晟贤";

    @MyAnno3
    public void show() {
    }
}
