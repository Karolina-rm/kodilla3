package com.kodilla.patterns.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic toolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        toolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        toolsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Post 1");
        javaHelpForum.addPost("Post 2");
        javaHelpForum.addPost("Post 3");
        toolsForum.addPost("Post 4");
        toolsForum.addPost("Post 5");
        //Then
        Assert.assertEquals(3, johnSmith.getUpdateCount());
        Assert.assertEquals(2, ivoneEscobar.getUpdateCount());
        Assert.assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
