package com.kodilla.stream.forumuser;



public class ForumUser {
    int UserID;
    String UserName;
    char sex;
    int year;
    int PostNumber;

    public ForumUser(int UserID, String UserName,char sex, int year,int PostNumber){

        this.UserID = UserID;
        this.UserName=UserName;
        this.sex=sex;
        this.year=year;
        this.PostNumber=PostNumber;



    }
    public int getYear(){
        return year;
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






    }




