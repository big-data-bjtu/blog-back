package com.bigdata.blog.model;

import javax.persistence.*;

@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String lable;
    private String summary;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "text")
    private String content;

    private long time;
    private int type;

    private int authorId;

    private int browseCount;
    private int reviewCount;
    private int supportCount;
    private int collectCount;

    public Article() {
    }

    public Article(String title, String lable, String summary, String content, int type, int authorId) {
        this.title = title;
        this.lable = lable;
        this.summary = summary;
        this.content = content;
        this.type = type;
        this.authorId = authorId;
    }

    public void reSetCount(){
        this.browseCount = 0;
        this.reviewCount = 0;
        this.supportCount = 0;
        this.collectCount = 0;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getBrowseCount() {
        return browseCount;
    }

    public void setBrowseCount(int browseCount) {
        this.browseCount = browseCount;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public int getSupportCount() {
        return supportCount;
    }

    public void setSupportCount(int supportCount) {
        this.supportCount = supportCount;
    }

    public int getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(int collectCount) {
        this.collectCount = collectCount;
    }

    public void addBrowse(){ this.browseCount +=1; }

    public void addSupport(){ this.supportCount +=1; }

    public void addReview(){ this.reviewCount +=1; }

    public void addCollection(){ this.collectCount +=1; }


}
