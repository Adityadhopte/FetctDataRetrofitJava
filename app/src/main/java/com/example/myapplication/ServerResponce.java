package com.example.myapplication;

public class ServerResponce {

    int eid;
    String name , course;

    public ServerResponce(int eid, String name, String course) {
        this.eid = eid;
        this.name = name;
        this.course = course;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
