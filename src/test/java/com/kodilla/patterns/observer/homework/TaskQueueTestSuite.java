package com.kodilla.patterns.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        TaskQueue task1 = new TaskQueue("task 1");
        TaskQueue task2 = new TaskQueue("task 2");
        TaskQueue task3 = new TaskQueue("task 3");
        TaskQueue task4 = new TaskQueue("task 4");
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        task1.registerObserver(mentor1);
        task2.registerObserver(mentor2);
        task3.registerObserver(mentor1);
        task4.registerObserver(mentor1);

        //When
        task1.addTask("add");
        task2.addTask("subtract");
        task3.addTask("new");
        task4.addTask("corrected");
        task1.addTask("new");
        task3.addTask("stop");

        //Then
        Assert.assertEquals(5, mentor1.getUpdateCount());
        Assert.assertEquals(1, mentor2.getUpdateCount());

    }
}
