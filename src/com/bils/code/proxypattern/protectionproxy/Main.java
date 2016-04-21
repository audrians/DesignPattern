package com.bils.code.proxypattern.protectionproxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Employee employee = new EmployeeImpl("Nabilla", "Female", "Junior Engineer");

        Employee ownerProxy = getOwnerProxy(employee);
        System.out.println("Name is " + ownerProxy.getName());
        System.out.println("Gender is " + ownerProxy.getGender());
        System.out.println("Job is " + ownerProxy.getDescJob());

        ownerProxy.setAskForLeave(true);
        if (ownerProxy.getApproveForLeave()) {
            System.out.println("Asking for leave . . . .");
        }

        try {
            ownerProxy.setApproveForLeave(true);
        } catch (Exception e) {
            System.out.println("Please contact your manager to approve your leave");
        }

        Employee employee2 = new EmployeeImpl("Yoko", "Male", "Staff 2 Engineer");

        Employee nonOwnerProxy = getNonOwnerProxy(employee2);
        System.out.println("Name is " + nonOwnerProxy.getName());
        System.out.println("Gender is " + nonOwnerProxy.getGender());
        System.out.println("Job is " + nonOwnerProxy.getDescJob());

        try {
            nonOwnerProxy.setAskForLeave(true);
        } catch (Exception e) {
            System.out.println("Couldn't ask for leave, because asking leave just for junior engineer");
        }

        nonOwnerProxy.setApproveForLeave(true);
        if (nonOwnerProxy.getApproveForLeave()) {
            System.out.println("Approve for leave employee 1. . . .");
        } else {
            System.out.println("Ignore for leave employee 1. . . .");
        }
    }

    static Employee getOwnerProxy(Employee employee) {
        return (Employee) Proxy.newProxyInstance(employee.getClass().getClassLoader(),
                employee.getClass().getInterfaces(),
                new OwnerInvocationHandler(employee));
    }

    static Employee getNonOwnerProxy(Employee employee) {
        return (Employee) Proxy.newProxyInstance(employee.getClass().getClassLoader(),
                employee.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(employee));
    }
}
