package com.kodilla.patterns.observer.homework;

public class Mentor implements Observer {

    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }


    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(mentorName + ": New task created by user: " + taskQueue.getName() + "\n" +
            " (total: " + taskQueue.getTasks().size() + " tasks.");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

}
