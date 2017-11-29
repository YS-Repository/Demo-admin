package com.ys.domain;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: SONY
 * Date: 2017/11/2
 * Time: 10:08
 * To change this template use File | Settings | File Templates.
 */
public class Comment {
    private Integer id;
    private String title;
    private String content;
    private Date time;
    private String author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                ", author='" + author + '\'' +
                '}';
    }
}
