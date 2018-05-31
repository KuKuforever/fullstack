package com.basicspringproject.fullstackdemo.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POST")
public class Post {

    private int id;
    private String status;
    private int imageId;
    private String title;
    private int posterId;

    @Id
    @Column(name="ID")
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    @Column(name="status")
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    @Column(name="imageId")
    public int getImageId() { return imageId; }

    public void setImageId(int imageId) { this.imageId = imageId; }

    @Column(name="title")
    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    @Column(name="posterId")
    public int getPosterId() { return posterId; }

    public void setPosterId(int posterId) { this.posterId = posterId; }

}
