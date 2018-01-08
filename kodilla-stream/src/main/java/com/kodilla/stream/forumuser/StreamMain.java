package com.kodilla.stream.forumuser;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.stream.Collectors;

public class StreamMain {


    public static void main(String [] args){
        Forum forum = new Forum();
        forum.getList().stream()
                .filter((ForumUser)->ForumUser.sex!='M')
                .filter((ForumUser)->ForumUser.year >= 1998)
                .filter((ForumUser)->ForumUser.PostNumber >=1)
                .collect(Collectors.toMap(ForumUser::getUserID,ForumUser->ForumUser));
        System.out.println(forum);










    }
}
