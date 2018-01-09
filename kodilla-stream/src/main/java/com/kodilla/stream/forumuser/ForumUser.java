package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.time.*;

public class ForumUser {
    int UserID;
    String UserName;
    char sex;
    int PostNumber;
    LocalDate birthDate;

    public ForumUser(int UserID, String UserName,char sex,int PostNumber, int yearOfBirth, int monthOfBirth, int dayOfBirth){
        LocalDate tempBD = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);

        this.UserID = UserID;
        this.UserName=UserName;
        this.sex=sex;
        this.PostNumber=PostNumber;
        this.birthDate=tempBD;



    }
    public int calculateAge(){
        Period p=Period.between(this.birthDate, LocalDate.now());
        return p.getYears();
    }
    public int getUserID(){
        return UserID;
    }
    public String getUserName(){
        return UserName;
    }
    public char getSex(){
        return sex;
    }
    public int getPostNumber(){
        return PostNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return UserName.equals(forumUser.UserName);
    }




    }




