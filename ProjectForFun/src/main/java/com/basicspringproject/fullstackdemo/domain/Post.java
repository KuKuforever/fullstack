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

    @Column
    public String getStatus() { return status; }




    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public int getPosterId() {
        return posterId;
    }


}
