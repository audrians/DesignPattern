package com.bils.code.proxypattern.protectionproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by nabilla on 4/1/16.
 */
public class OwnerInvocationHandler implements InvocationHandler {

    private Employee employee;

    public OwnerInvocationHandler(Employee employee) {
        this.employee = employee;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            return method.invoke(employee, args);
        } else if (method.getName().equals("setApproveForLeave")) {
            throw new IllegalAccessException();
        } else if (method.getName().startsWith("set")) {
            return method.invoke(employee, args);
        }
        return null;
    }
}
