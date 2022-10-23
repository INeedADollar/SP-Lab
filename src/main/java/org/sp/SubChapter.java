package org.sp;

import javafx.scene.control.Tab;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private final String name;
    private final List<Paragraph> paragraphs = new ArrayList<>();
    private final List<Image> images = new ArrayList<>();
    private final List<Table> tables = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Subcapitol: " + name);

        for(Paragraph paragraph: paragraphs)
            paragraph.print();

        for(Image image: images)
            image.print();

        for(Table table: tables)
            table.print();
    }

    public void createNewElement(String name, String type){
        if(type == "paragraphs")
            createNewParagraph(name);
        if(type == "images")
            createNewImage(name);
        if(type == "tables")
            createNewTable(name);
    }

    private void createNewParagraph(String name){
        Paragraph paragraph = new Paragraph(name);
        paragraphs.add(paragraph);
    }

    private void createNewImage(String name){
        Image image = new Image(name);
        images.add(image);
    }

    private void createNewTable(String name){
        Table table = new Table(name);
        tables.add(table);
    }
}
