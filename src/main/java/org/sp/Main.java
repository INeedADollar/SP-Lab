package org.sp;

public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
        scOneOne.createNewElement("Paragraph 1", "paragraph");
        scOneOne.createNewElement("Paragraph 2", "paragraph");
        scOneOne.createNewElement("Paragraph 3", "paragraph");
        scOneOne.createNewElement("Image 1", "image");
        scOneOne.createNewElement("Paragraph 4", "paragraph");
        scOneOne.createNewElement("Table 1", "table");
        scOneOne.createNewElement("Paragraph 5", "paragraph");
        scOneOne.print();
    }
}