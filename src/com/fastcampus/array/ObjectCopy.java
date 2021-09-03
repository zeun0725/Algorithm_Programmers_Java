package com.fastcampus.array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];
        library[0] = new Book("태백산맥", "조정래");
        library[1] = new Book("태백산맥", "조정래");
        library[2] = new Book("태백산맥", "조정래");
        library[3] = new Book("태백산맥", "조정래");
        library[4] = new Book("태백산맥", "조정래");

        //얕은 복사(같은 인스턴스)
        System.arraycopy(library, 0, copyLibrary, 0, 5);
        for(Book book: copyLibrary) {
            //향상된 for문
            System.out.println(book);
            book.showBookInfo();
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        for(Book book: copyLibrary) {
            //향상된 for문
            System.out.println(book);
            book.showBookInfo();
        }

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        //깊은 복사(다른 인스턴스)
        for(int i=0; i<copyLibrary.length; i++) {
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());
        }

        library[0].setTitle("나목에서 바뀜");
        library[0].setAuthor("박완서2");

        for(Book book: copyLibrary) {
            //향상된 for문
            System.out.println(book);
            book.showBookInfo();
        }

    }
}
