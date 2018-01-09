package com.kodilla.stream.forumuser;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class StreamMain {


    public static void main(String [] args){
        Forum forum = new Forum();
        forum.getList().stream()
                .filter((ForumUser)->ForumUser.sex!='F')
                .filter((ForumUser)->ForumUser.calculateAge() < 20)
                .filter((ForumUser)->ForumUser.PostNumber >=1)
                .collect(Collectors.toMap(ForumUser::getUserID,ForumUser->ForumUser));
        System.out.println(forum);





    }
}
