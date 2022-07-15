package com.jeethink.common;

import java.util.List;
import java.util.Set;

public class GoalNumber {
    Set<Integer> red;
    Set<Integer> blue;

    public GoalNumber() {
    }

    public GoalNumber(Set<Integer> red, Set<Integer> blue) {
        this.red = red;
        this.blue = blue;
    }

    public Set<Integer> getRed() {
        return red;
    }

    public void setRed(Set<Integer> red) {
        this.red = red;
    }

    public Set<Integer> getBlue() {
        return blue;
    }

    public void setBlue(Set<Integer> blue) {
        this.blue = blue;
    }
}
