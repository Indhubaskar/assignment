package com.demo;

public class Chennai extends Headoffice {
    @Override
    public void verification() {
        System.out.println("verification is done for chennai branch by Aadhar card");
    }

    public static void main(String[] args) {
        Headoffice hq=null;
        hq=new Chennai();
        hq.registration();
        hq.verification();

        hq=new Dehli();
        hq.registration();
        hq.verification();
    }
}
