package org.sp;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private final String name;
    private final List<SubChapter> subchapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Capitol: " + name);

        for(SubChapter subchapter: subchapters)
            subchapter.print();
    }

    public int createSubChapter(String name) {
        SubChapter subchapter = new SubChapter(name);
        subchapters.add(subchapter);

        return subchapters.size();
    }

    public SubChapter getSubChapter(int subChIndex) {
        return subchapters.get(subChIndex - 1);
    }
}
