package cn.ssx;

import com.ssx03.MyService;

import java.util.ServiceLoader;

public class Test02 {
    public static void main(String[] args) {
        //加载服务
        ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);

        //遍历服务
        for (MyService my :myServices) {
            //MyService接口下的抽象方法
            //服务的提供模块有MyService接口的实现类
            my.service();
        }

    }
}
