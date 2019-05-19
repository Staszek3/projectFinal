package com.staszek.project_final.model;

import com.staszek.project_final.model.enums.StatusUser;
import com.staszek.project_final.model.enums.TypeUser;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Users {
    @Id
    @GeneratedValue

    private Long id; //jednoznaczna nazwa konta (wykorzystywana do linkowania do konta)
    private String login;  // login jako email
    private String password;
    private String uniqueNameOfAccont;  //unikatowa nazwa konta
    private String nameOfAcount; //opisowa nazwa konta (wykorzystywana do wyświetlania)
    private String dateOfCreationAcount; //data założenia konta

    @Enumerated(EnumType.STRING)
    private StatusUser statusUser; //status konta (AKTYWNE/NIEAKTYWNE/ZABLOKOWANE)
    @Enumerated(EnumType.STRING)
    private TypeUser typeUser; //typ (PUBLICZNE/PRYWATNE)

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "users")
    private Set<Entry> entries;

    public Users(String login, String password,String uniqueNameOfAccont, String nameOfAcount, String dateOfCreationAcount,
                 StatusUser statusUser, TypeUser typeUser) {
        this.login = login;
        this.password = password;
        this.uniqueNameOfAccont=uniqueNameOfAccont;
        this.nameOfAcount = nameOfAcount;
        this.dateOfCreationAcount = dateOfCreationAcount;
        this.statusUser = statusUser;
        this.typeUser = typeUser;
       // this.entries = entries;
    }

    public Users() {
    }

    public Users(String nameOfAcount) {
        this.nameOfAcount = nameOfAcount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameOfAcount() {
        return nameOfAcount;
    }

    public void setNameOfAcount(String nameOfAcount) {
        this.nameOfAcount = nameOfAcount;
    }



    public StatusUser getStatusUser() {
        return statusUser;
    }

    public void setStatusUser(StatusUser statusUser) {
        this.statusUser = statusUser;
    }

    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }


    public Set<Entry> getEntries() {
        return entries;
    }

    public void setEntries(Set<Entry> entries) {
        this.entries = entries;
    }

    public String getDateOfCreationAcount() {
        return dateOfCreationAcount;
    }

    public void setDateOfCreationAcount(String dateOfCreationAcount) {
        this.dateOfCreationAcount = dateOfCreationAcount;
    }

    public String getUniqueNameOfAccont() {
        return uniqueNameOfAccont;
    }

    public void setUniqueNameOfAccont(String uniqueNameOfAccont) {
        this.uniqueNameOfAccont = uniqueNameOfAccont;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", uniqueNameOfAccont='" + uniqueNameOfAccont + '\'' +
                ", nameOfAcount='" + nameOfAcount + '\'' +
                ", dateOfCreationAcount='" + dateOfCreationAcount + '\'' +
                ", statusUser=" + statusUser +
                ", typeUser=" + typeUser +
                ", entries=" + entries +
                '}';
    }
}