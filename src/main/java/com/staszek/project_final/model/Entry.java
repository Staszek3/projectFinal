package com.staszek.project_final.model;

import com.staszek.project_final.model.enums.StatusEntity;
import com.staszek.project_final.model.enums.TypeEntity;

import javax.persistence.*;

@Entity
//klasa z wpisami
public class Entry {
    @Id
    @GeneratedValue
    private Long id;
    private String contentOfEntry;  //tresc wpisu
    private String data;    // data wprowadzenia wpisu
    @Enumerated(EnumType.STRING)
    private StatusEntity status;//status (ORYGINALNY/EDYTOWANY)
    @Enumerated(EnumType.STRING)
    private TypeEntity tape;// typ (WPIS/KOMENTARZ/PRZEKAZANY_WPIS)

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    public Entry(String contentOfEntry, String data, StatusEntity status, TypeEntity tape, Users users) {
        this.contentOfEntry = contentOfEntry;
        this.data = data;
        this.status = status;
        this.tape = tape;
        this.users = users;
    }

    public Entry() {
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

    public TypeEntity getTape() {
        return tape;
    }

    public void setTape(TypeEntity tape) {
        this.tape = tape;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", contentOfEntry='" + contentOfEntry + '\'' +
                ", data='" + data + '\'' +
                ", status=" + status +
                ", tape=" + tape +
                ", users=" + users +
                '}';
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
