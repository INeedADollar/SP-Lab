package org.sp;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element {
    private Book book;
    private List<Element> elemente = new ArrayList<>();

    public void print(){
        System.out.println("Table Of Contents :)");
    }

    public void add(Element element){
        elemente.add(element);
    }

    public void remove(Element element){
        elemente.remove(element);
    }

    public Element get(int elIndex){
        return elemente.get(elIndex - 1);
    }
}
