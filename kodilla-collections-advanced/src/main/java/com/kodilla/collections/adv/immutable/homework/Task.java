package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    private String title;
    private int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;

    }

    public final String getTitle() {
        return title;
    }

    public final int getDuration() {
        return duration;
    }

    public final void setTitle(String title) {
        this.title = title;
    }

    public final void setDuration(int duration) {
        this.duration = duration;
    }
}
