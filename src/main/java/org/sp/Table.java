package org.sp;

public class Table implements Element {
    private final String name;

    public Table(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Tabel: " + name);
    }
}
