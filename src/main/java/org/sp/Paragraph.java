package org.sp;

public class Paragraph {
    private final String name;

    public Paragraph(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Paragraf: " + name);
    }
}
