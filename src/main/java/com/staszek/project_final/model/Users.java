package com.staszek.project_final.model;

import com.staszek.project_final.model.enums.LogoTyp;
import com.staszek.project_final.model.enums.StatusAcount;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    @GeneratedValue

    private Long id; //jednoznaczna nazwa konta (wykorzystywana do linkowania do konta)
    private String login;  // login jako email
    private String password;
    private String nameOfAcount; //opisowa nazwa konta (wykorzystywana do wyświetlania)
    private String dateAcount; //data założenia konta
    private StatusAcount statusAcount; //status konta (AKTYWNE/NIEAKTYWNE/ZABLOKOWANE)
    private LogoTyp logoTyp; //typ (PUBLICZNE/PRYWATNE)

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

    public String getDateAcount() {
        return dateAcount;
    }

    public void setDateAcount(String dateAcount) {
        this.dateAcount = dateAcount;
    }

    public StatusAcount getStatusAcount() {
        return statusAcount;
    }

    public void setStatusAcount(StatusAcount statusAcount) {
        this.statusAcount = statusAcount;
    }

    public LogoTyp getLogoTyp() {
        return logoTyp;
    }

    public void setLogoTyp(LogoTyp logoTyp) {
        this.logoTyp = logoTyp;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", nameOfAcount='" + nameOfAcount + '\'' +
                ", dateAcount='" + dateAcount + '\'' +
                ", statusAcount=" + statusAcount +
                ", logoTyp=" + logoTyp +
                '}';
    }
}