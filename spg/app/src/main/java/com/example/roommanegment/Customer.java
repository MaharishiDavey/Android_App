package com.example.roommanegment;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int smk;
    private int number_of_members;
    private long phone_no;
    private boolean men,women,children;


    public  Customer (String name, String smk,String num){
        this.name = name;
        this.smk = Integer.parseInt(smk);
        this.number_of_members = Integer.parseInt(num);

    }

    public Customer(String name, int smk, int number_of_members, long phone_no, boolean men, boolean women, boolean children) {
        this.name = name;
        this.smk = smk;
        this.number_of_members = number_of_members;
        this.phone_no = phone_no;
        this.men = men;
        this.women = women;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSmk() {
        return smk;
    }

    public void setSmk(int smk) {
        this.smk = smk;
    }

    public int getNumber_of_members() {
        return number_of_members;
    }

    public void setNumber_of_members(int number_of_members) {
        this.number_of_members = number_of_members;
    }

    public boolean isMen() {
        return men;
    }

    public void setMen(boolean men) {
        this.men = men;
    }

    public boolean isWomen() {
        return women;
    }

    public void setWomen(boolean women) {
        this.women = women;
    }

    public boolean isChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    public long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", smk=" + smk +
                ", number_of_members=" + number_of_members +
                ", phone_no=" + phone_no +
                ", men=" + men +
                ", women=" + women +
                ", children=" + children +
                '}';
    }
}
