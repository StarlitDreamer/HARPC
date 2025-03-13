package com.rpc.example.consumer;

import com.rpc.example.common.model.User;
import com.rpc.example.common.service.UserService;
import com.rpc.myrpc.proxy.ServiceProxyFactory;

/**
 * 简易服务消费者示例
 *
 */
public class ConsumerExample {

    public static void main(String[] args) {
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("yupi");

        User newUser = userService.getUser(user);
        if (newUser!=null){
            System.out.println(newUser.getName());
        }else {
            System.out.println("user==null");
        }
        long number = userService.getNumber();
        System.out.println(number);
    }
}

