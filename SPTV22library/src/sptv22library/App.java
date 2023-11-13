/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv22library;

import entity.Author;
import entity.Book;
import java.util.Arrays;
import java.util.Scanner;
import managers.BookManager;

/**
 *
 * @author admin
 */
public class App {
    private Scanner scanner;
    private Book[] books;
    private BookManager bookManager;
    private Reader[] readers;
    
    public App() {
        this.scanner = new Scanner(System.in);
        this.books = new Book [0];
        this.bookManager = new BookManager(scanner);
    }
    public void run() {
        boolean repeat = true;
        System.out.println("------- Library --------");
        do{
            System.out.println("List of tasks:");
            System.out.println("0. Exit.");
            System.out.println("1. Add new book.");
            System.out.println("2. Print list books.");
            System.out.println("3. Add reader.");
            System.out.println("Enter task number: ");
            int task = scanner.nextInt(); scanner.nextLine();
            
            switch(task){
                case 0:
                    repeat = false;
                    break;
                case 1:
                    this.books = Arrays.copyOf(this.books, this.books.length+1);
                    this.books[this.books.length - 1] = bookManager.addBook();
                    bookManager.addBook();
                    break;
                case 2:
                    bookManager.printListBooks(books);
                    break;
                case 3:
                    this.readers = Arrays.copyOf(this.reader);
                    break;
                default:
                    System.out.println("select from list tasks");
                    break;
                    
            }
            System.out.println("--------------");
        }while(repeat);
        System.out.println("poka.");
    }
    
}
