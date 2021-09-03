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

        System.arraycopy(library, 0, copyLibrary, 0, 5);
        for(Book book: copyLibrary) {
            //향상된 for문
            System.out.println(book);
            book.showBookInfo();
        }
    }
}
