package com.kodilla.patterns.observer.homework;


import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {

    private final List<Observer> observers;
    private final List<String> tasks;
    private final String name;

    public TaskQueue(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public String getName() {
        return name;
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }
}
