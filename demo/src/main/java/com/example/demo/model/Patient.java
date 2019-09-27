package com.example.demo.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "Patient")
@Component
public class Patient {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "region")
    private String region;
    @Column(name = "no_of_children")
    private int no_of_children;
    @Column(name = "no_of_pregnancy")
    private int no_of_pregnancy;
    @Column(name = "age_at_pregnancy")
    private int age_at_pregnancy;
    @Column(name = "pregnance")
    private boolean pregnance;
    @Column(name = "number_of_children")
    private int number_of_children;
    @Column(name = "last_menstrual_period")
    private int last_menstrual_period;
    @Column(name = "birth_control")
    private boolean birth_control;
    @Column(name = "long_birth_control")
    private int long_birth_control;
    @Column(name = "other_harmones_replacement")
    private boolean other_harmones_replacement;
    @Column(name = "previous_breast_surgery")
    private boolean previous_breast_surgery;
    @Column(name = "breast")
    private boolean breast;
    @Column(name = "previous_breast_radiation")
    private boolean previous_breast_radiation;
    @Column(name = "which_breast")
    private boolean which_breast;
    @Column(name = "pre_chemo")
    private boolean pre_Chemo;
    @Column(name = "condition")
    private String condition;
    @Column(name = "routine_checkup")
    private boolean routine_checkup;
    @Column(name = "present_breast_complaint")
    private String present_breast_complaint;
    @Column(name = "skin_dimpling")
    private boolean skin_dimpling;
    @Column(name = "nipple_retraction")
    private boolean nipple_retraction;
    @Column(name = "discharge")
    private boolean discharge;
    @Column(name = "color")
    private String color;
    @Column(name = "history")
    private String history;
    @Column(name = "mother")
    private boolean mother;
    @Column(name = "daughter")
    private boolean daughter;
    @Column(name = "sister")
    private boolean sister;
    @Column(name = "fathers_side")
    private boolean fathers_side;
    @Column(name = "mothers_side")
    private boolean mothers_side;
    @Column(name = "grand_mother")
    private boolean grand_mother;
    @Column(name = "aunts")
    private boolean aunts;



    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNo_of_children() {
        return no_of_children;
    }

    public void setNo_of_children(int no_of_children) {
        this.no_of_children = no_of_children;
    }

    public int getNo_of_pregnancy() {
        return no_of_pregnancy;
    }

    public void setNo_of_pregnancy(int no_of_pregnancy) {
        this.no_of_pregnancy = no_of_pregnancy;
    }

    public int getAge_at_pregnancy() {
        return age_at_pregnancy;
    }

    public void setAge_at_pregnancy(int age_at_pregnancy) {
        this.age_at_pregnancy = age_at_pregnancy;
    }

    public boolean isPregnance() {
        return pregnance;
    }

    public void setPregnance(boolean pregnance) {
        this.pregnance = pregnance;
    }

    public int getNumber_of_children() {
        return number_of_children;
    }

    public void setNumber_of_children(int number_of_children) {
        this.number_of_children = number_of_children;
    }

    public int getLast_menstrual_period() {
        return last_menstrual_period;
    }

    public void setLast_menstrual_period(int last_menstrual_period) {
        this.last_menstrual_period = last_menstrual_period;
    }

    public boolean isBirth_control() {
        return birth_control;
    }

    public void setBirth_control(boolean birth_control) {
        this.birth_control = birth_control;
    }

    public int getLong_birth_control() {
        return long_birth_control;
    }

    public void setLong_birth_control(int long_birth_control) {
        this.long_birth_control = long_birth_control;
    }

    public boolean isOther_harmones_replacement() {
        return other_harmones_replacement;
    }

    public void setOther_harmones_replacement(boolean other_harmones_replacement) {
        this.other_harmones_replacement = other_harmones_replacement;
    }

    public boolean isPrevious_breat_surgery() {
        return previous_breast_surgery;
    }

    public void setPrevious_breat_surgery(boolean previous_breat_surgery) {
        this.previous_breast_surgery = previous_breat_surgery;
    }

    public boolean isBreast() {
        return breast;
    }

    public void setBreast(boolean breast) {
        this.breast = breast;
    }

    public boolean isPrevious_breast_radiation() {
        return previous_breast_radiation;
    }

    public void setPrevious_breast_radiation(boolean previous_breast_radiation) {
        this.previous_breast_radiation = previous_breast_radiation;
    }

    public boolean isWhich_breast() {
        return which_breast;
    }

    public void setWhich_breast(boolean which_breast) {
        this.which_breast = which_breast;
    }

    public boolean isPre_Chemo() {
        return pre_Chemo;
    }

    public void setPre_Chemo(boolean pre_Chemo) {
        this.pre_Chemo = pre_Chemo;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean isRoutine_checkup() {
        return routine_checkup;
    }

    public void setRoutine_checkup(boolean routine_checkup) {
        this.routine_checkup = routine_checkup;
    }

    public String getPresent_breast_complaint() {
        return present_breast_complaint;
    }

    public void setPresent_breast_complaint(String present_breast_complaint) {
        this.present_breast_complaint = present_breast_complaint;
    }

    public boolean isSkin_dimpling() {
        return skin_dimpling;
    }

    public void setSkin_dimpling(boolean skin_dimpling) {
        this.skin_dimpling = skin_dimpling;
    }

    public boolean isNipple_retraction() {
        return nipple_retraction;
    }

    public void setNipple_retraction(boolean nipple_retraction) {
        this.nipple_retraction = nipple_retraction;
    }

    public boolean isDischarge() {
        return discharge;
    }

    public void setDischarge(boolean discharge) {
        this.discharge = discharge;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHistory() {
        return history;
    }
    public void setHistory(String history){
        this.history = history;
    }

    public boolean isMother() {
        return mother;
    }

    public void setMother(boolean mother) {
        this.mother = mother;
    }

    public boolean isDaughter() {
        return daughter;
    }

    public void setDaughter(boolean daughter) {
        this.daughter = daughter;
    }

    public boolean isSister() {
        return sister;
    }

    public void setSister(boolean sister) {
        this.sister = sister;
    }

    public boolean isFathers_side() {
        return fathers_side;
    }

    public void setFathers_side(boolean fathers_side) {
        this.fathers_side = fathers_side;
    }

    public boolean isMothers_side() {
        return mothers_side;
    }
    public void setMothers_side(boolean mothers_side){
         this.mothers_side = mothers_side;
    }

    public boolean isGrand_mother() {
        return grand_mother;
    }

    public void setGrand_mother(boolean grand_mother) {
        this.grand_mother = grand_mother;
    }

    public boolean isAunts() {
        return aunts;
    }

    public void setAunts(boolean aunts) {
        this.aunts = aunts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}



