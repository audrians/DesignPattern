package com.bils.code.proxypattern.protectionproxy;

/**
 * Created by nabilla on 4/1/16.
 */
public class EmployeeImpl implements Employee {

    private String name;

    private String gender;

    private String descJob;

    private boolean askLeave;

    private boolean approveLeave;

    public EmployeeImpl(String name, String gender, String descJob) {
        this.name = name;
        this.gender = gender;
        this.descJob = descJob;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getDescJob() {
        return descJob;
    }

    @Override
    public boolean getAskForLeave() {
        return askLeave;
    }

    @Override
    public boolean getApproveForLeave() {
        return approveLeave;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setDescJob(String descJob) {
        this.descJob = descJob;
    }

    @Override
    public void setAskForLeave(boolean askLeave) {
        this.askLeave = askLeave;
    }

    @Override
    public void setApproveForLeave(boolean approveLeave) {
        this.approveLeave = approveLeave;
    }
}
