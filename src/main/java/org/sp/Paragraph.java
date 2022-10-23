package org.sp;

public class Paragraph implements Element {
    private final String name;

    public Paragraph(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Paragraf: " + name);
    }
}
