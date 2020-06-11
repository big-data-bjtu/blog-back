package com.bigdata.blog.model;

import javax.persistence.*;

@Entity
@Table(name = "fans")
public class Fans {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int author;
    private int follower;
    private long time;

    public int getId() {
        return id;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getFollower() {
        return follower;
    }

    public void setFollower(int follower) {
        this.follower = follower;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
