package com.aiss.f1api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="race")
public class RaceModel {
    public RaceModel(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "gp")
    private String gp;

    private String date;
    private String first;
    private String second;
    private String third;
    private String fourth;
    private String fifth;
    private String sixth;
    private String seventh;
    private String eighth;
    private String nineth;
    private String tenth;



   


    public RaceModel(String string, String string2, String string3, String string4, String string5, String string6,
            String string7, String string8, String string9, String string10, String string11, String string12) {
                this.gp=string;
                this.date=string2;
                this.first=string3;
                this.second=string4;
                this.third=string5;
                this.fourth=string6;
                this.fifth=string7;
                this.sixth=string8;
                this.seventh=string9;
                this.eighth=string10;
                this.nineth=string11;
                this.tenth=string12;
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the gp
     */
    public String getGp() {
        return gp;
    }

    /**
     * @param gp the gp to set
     */
    public void setGp(String gp) {
        this.gp = gp;
    }

    /**
     * @return String return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return String return the first
     */
    public String getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * @return String return the second
     */
    public String getSecond() {
        return second;
    }

    /**
     * @param second the second to set
     */
    public void setSecond(String second) {
        this.second = second;
    }

    /**
     * @return String return the third
     */
    public String getThird() {
        return third;
    }

    /**
     * @param third the third to set
     */
    public void setThird(String third) {
        this.third = third;
    }

    /**
     * @return String return the fourth
     */
    public String getFourth() {
        return fourth;
    }

    /**
     * @param fourth the fourth to set
     */
    public void setFourth(String fourth) {
        this.fourth = fourth;
    }

    /**
     * @return String return the fifth
     */
    public String getFifth() {
        return fifth;
    }

    /**
     * @param fifth the fifth to set
     */
    public void setFifth(String fifth) {
        this.fifth = fifth;
    }

    /**
     * @return String return the sixth
     */
    public String getSixth() {
        return sixth;
    }

    /**
     * @param sixth the sixth to set
     */
    public void setSixth(String sixth) {
        this.sixth = sixth;
    }

    /**
     * @return String return the seventh
     */
    public String getSeventh() {
        return seventh;
    }

    /**
     * @param seventh the seventh to set
     */
    public void setSeventh(String seventh) {
        this.seventh = seventh;
    }

    /**
     * @return String return the eighth
     */
    public String getEighth() {
        return eighth;
    }

    /**
     * @param eighth the eighth to set
     */
    public void setEighth(String eighth) {
        this.eighth = eighth;
    }

    /**
     * @return String return the nineth
     */
    public String getNineth() {
        return nineth;
    }

    /**
     * @param nineth the nineth to set
     */
    public void setNineth(String nineth) {
        this.nineth = nineth;
    }

    /**
     * @return String return the tenth
     */
    public String getTenth() {
        return tenth;
    }

    /**
     * @param tenth the tenth to set
     */
    public void setTenth(String tenth) {
        this.tenth = tenth;
    }

}