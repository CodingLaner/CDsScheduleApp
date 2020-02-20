package com.example.cdsscheduleapp.fragment1todo;

public class ToDoItem {
    String todo;
    boolean isChecked = false;

    public ToDoItem(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public boolean getIsChecked() {
        return isChecked;
    }
}
