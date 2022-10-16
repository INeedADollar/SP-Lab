package org.sp;

public class Image {
    private final String name;

    public Image(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Imagine cu titlul: " + name);
    }
}
