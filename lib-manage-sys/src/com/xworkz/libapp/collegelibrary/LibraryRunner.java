package com.xworkz.libapp.collegelibrary;

import com.xworkz.libapp.book.Book;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {
//        Library library = new Library();
//        Book book = new Book();
//        System.out.println(book);
//        book.setBookName("mouna");
//        book.setAuthorName("ashwin");
//        book.setPrice(350.89);
//        book.setLanguage("kannada");
//        System.out.println(book.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no of book to be added");
        int size = scanner.nextInt();



        Library library = new Library(size);

        for(int i=0; i<size;i++){

        Book book = new Book();
            System.out.println("enter the name of the book");
            book.setBookName(scanner.next());
            System.out.println("enter  author of the book");
            book.setAuthorName(scanner.next());
            System.out.println("enter the price of the book");
            book.setPrice(scanner.nextDouble());
            System.out.println("enter the language of the book");
            book.setLanguage(scanner.next());
            //System.out.println(book.toString());

        }
        String input = null;
        do{
            System.out.println("enter 1 to get book info");
            System.out.println("enter 2 to update book price  ");
            System.out.println("enter 3 to update authorName");
            System.out.println("enter 4 to update language");
           int options = scanner.nextInt();
           switch (options){
               case 1:
                   library.getBook();
                   break;
               case 2:
                   System.out.println("enter the price to be updated");
                   double amt = scanner.nextDouble();
                   break;
               case 3:
                   System.out.println("enter author name to be updated");
                   String name = scanner.next();
                   break;
               case 4:
                   System.out.println("enter language to be updated");
                   String lang = scanner.next();
                   break;
               default:
                   System.out.println("please provide valid options");
           }
            System.out.println("do you want to continue yes/no");
           input= scanner.next();
        }while(input.equalsIgnoreCase("yes"));
        System.out.println("thank you for your time");
    }
}
