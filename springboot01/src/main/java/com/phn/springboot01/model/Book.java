package com.phn.springboot01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 *     注：实体类需跟数据库表明一致（如：User-> user ）否则会默认建一个跟实体类相关的表
 *         为了避免以上可以用 @Table注解指明表名 <如 @Table(name = "t_user")  >
 * @author Penghenan
 * @create 2019-12-17 11:31:04
 */
@Entity
@Table(name = "t_book")
public class Book implements Serializable {

    @Id    //@Id  唯一标识列（主键）
    private Integer bookid;
    @Column(nullable = false)
    private String bookname;
    @Column(nullable = false)
    private Float bookprice;
    private String bookbrief;
    private String bookimage;

    public Book() {
    }

    public Book(Integer bookid, String bookname, Float bookprice, String bookbrief, String bookimage) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.bookprice = bookprice;
        this.bookbrief = bookbrief;
        this.bookimage = bookimage;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Float getBookprice() {
        return bookprice;
    }

    public void setBookprice(Float bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookbrief() {
        return bookbrief;
    }

    public void setBookbrief(String bookbrief) {
        this.bookbrief = bookbrief;
    }

    public String getBookimage() {
        return bookimage;
    }

    public void setBookimage(String bookimage) {
        this.bookimage = bookimage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", bookprice=" + bookprice +
                ", bookbrief='" + bookbrief + '\'' +
                ", bookimage='" + bookimage + '\'' +
                '}';
    }
}
