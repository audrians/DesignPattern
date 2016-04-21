package com.bils.code.proxypattern.protectionproxy;

/**
 * Created by nabilla on 4/1/16.
 */
public interface Employee {

    String getName();

    String getGender();

    String getDescJob();

    boolean getAskForLeave();

    boolean getApproveForLeave();

    void setName(String name);

    void setGender(String gender);

    void setDescJob(String descJob);

    void setAskForLeave(boolean askLeave);

    void setApproveForLeave(boolean approveLeave);
}
