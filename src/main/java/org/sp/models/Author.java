package org.sp.models;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name) {
        String name1;
        String surname1 = "";
        String[] name_list = name.split(" ");

        name1 = "";
        if(name_list.length > 0) {
            name1 = name_list[0];

            if(name_list.length >= 2) {
                surname1 = name_list[1];
            }

            if(name_list.length >= 3) {
                surname1 += " " + name_list[2];
            }
        }
        this.name = name1;
        this.surname = surname1;
    }

    public void print(){
        System.out.println("Authors:");
        System.out.println("Author: " + name + " " + surname);
    }
}