package com.ahmed.mynotes;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.Exclude;

public class Note {

    public Note(String id, Timestamp date, String content) {
        this.id = id;
        this.date = date;
        this.content = content;
    }

    public Note() {
    }

    private String id;
    private Timestamp date;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}