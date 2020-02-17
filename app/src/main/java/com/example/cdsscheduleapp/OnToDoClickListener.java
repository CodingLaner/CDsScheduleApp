package com.example.cdsscheduleapp;

import android.view.View;

import com.example.cdsscheduleapp.ToDoAdapter;

public interface OnToDoClickListener {
    public void onItemClick(ToDoAdapter.ViewHolder holder, View view, int position);
}
