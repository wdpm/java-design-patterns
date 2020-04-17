package io.github.wdpm.pattern.structural.adapter;

/**
 * @Created evan
 * @Date 2020/4/17
 */
public class OtherCircle {
    public void setLocation(){
        System.out.println(getClass()+"#setLocation() called.");
    }

    public void getLocation(){
        System.out.println(getClass()+"#getLocation() called.");
    }

    public void displayIt(){
        System.out.println(getClass()+"#displayIt() called.");
    }

    public void fillIt(){
        System.out.println(getClass()+"#fillIt() called.");
    }

    public void setItsColor(){
        System.out.println(getClass()+"#setItsColor() called.");
    }

    public void unDisplayIt(){
        System.out.println(getClass()+"#unDisplayIt() called.");
    }
}
