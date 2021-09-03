package com.fastcampus.array;

public class BookArrayTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        library[0] = new Book("태백산맥", "조정래");
        library[1] = new Book("태백산맥", "조정래");
        library[2] = new Book("태백산맥", "조정래");
        library[3] = new Book("태백산맥", "조정래");
        library[4] = new Book("태백산맥", "조정래");

        for (Book book : library) {
            System.out.println(book);
            book.showBookInfo();
            /*
            com.fastcampus.array.Book@5b2133b1
            com.fastcampus.array.Book@72ea2f77
            com.fastcampus.array.Book@33c7353a
            com.fastcampus.array.Book@681a9515
            com.fastcampus.array.Book@3af49f1c
            */
        }
    }
}
