package org.sp;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents {
    private final List<Chapter> chapters = new ArrayList<>();

    public void print(){
        for(Chapter chapter: chapters)
            chapter.print();
    }

    public int addChapter(String name) {
        Chapter chapter = new Chapter(name);
        chapters.add(chapter);
        return chapters.size();
    }

    public Chapter getChapter(int chapterIndex) {
        return chapters.get(chapterIndex - 1);
    }
}
