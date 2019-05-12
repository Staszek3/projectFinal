package com.staszek.project_final.model;

import com.staszek.project_final.model.enums.StatusEntity;
import com.staszek.project_final.model.enums.TapeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
//klasa do wypełnienia formularza wpis
public class Entry {
    @Id
    @GeneratedValue
    private Long id;
    private String contentOfEntry;  //tresc wpisu
    private String data;    // data wprowadzenia wpisu
    private StatusEntity status;//status (ORYGINALNY/EDYTOWANY)
    private TapeEntity tape;// typ (WPIS/KOMENTARZ/PRZEKAZANY_WPIS)

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", contentOfEntry='" + contentOfEntry + '\'' +
                ", data='" + data + '\'' +
                ", status=" + status +
                ", tape=" + tape +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContentOfEntry() {
        return contentOfEntry;
    }

    public void setContentOfEntry(String contentOfEntry) {
        this.contentOfEntry = contentOfEntry;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }

    public TapeEntity getTape() {
        return tape;
    }

    public void setTape(TapeEntity tape) {
        this.tape = tape;
    }
}
