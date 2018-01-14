package com.kodilla.stream.forumuser;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public final class Forum {
    private final List<ForumUser>theList = new ArrayList<>(); {




        final List<ForumUser> theList = new ArrayList<>();
        ForumUser f1 = new ForumUser(123,"m.szewczyk",'F',25,1982,12,17);
        ForumUser f2 = new ForumUser(124,"p.szewczyk",'M',21,1980,8,8);
        ForumUser f3 = new ForumUser(125,"j.szewczyk",'F',23,2013,1,7);

        theList.add(f1);
        theList.add(f2);
        theList.add(f3);
    }
    public List <ForumUser>getList(){
        return new ArrayList<ForumUser>(theList);
    }
}







