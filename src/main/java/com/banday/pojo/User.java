package com.banday.pojo;


import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private int id;
    private String name;
    private Date createdTime;
    private Date updatedTime;

    public User(int id, String name, Date createdTime, Date updatedTime) {
        this.id = id;
        this.name = name;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                '}';
    }
}
