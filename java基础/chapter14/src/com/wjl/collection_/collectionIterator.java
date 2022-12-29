package com.wjl.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionIterator {
@SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("红楼梦","施耐庵",147));
        col.add(new Book("三国演义","罗贯中",56));
        col.add(new Book("西游记","曹雪芹",47));

        //获取迭代对象
    Iterator iterator = col.iterator();
    while (iterator.hasNext()) {
        Object next = iterator.next();
        System.out.println(next);
    }
}
}
class Book{
    private String name;
    private String author;
    private double prize;

    public Book(String name, String author, double prize) {
        this.name = name;
        this.author = author;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", prize=" + prize +
                '}';
    }
}
