package com.kodilla.stream.forumuser;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.List;
import java.util.ArrayList;

public final class Forum {
    private final List<ForumUser>theList = new ArrayList<>(); {




        final List<ForumUser> theList = new ArrayList<>();
        ForumUser f1 = new ForumUser(123,"m.szewczyk",'F',1982,25);
        ForumUser f2 = new ForumUser(124,"p.szewczyk",'M',1980,21);
        ForumUser f3 = new ForumUser(125,"j.szewczyk",'F',2013,20);

        theList.add(f1);
        theList.add(f2);
        theList.add(f3);
    }
    public List <ForumUser>getList(){
        return new ArrayList<ForumUser>(theList);
    }
}










