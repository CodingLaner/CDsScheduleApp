package com.example.cdsscheduleapp.fragment1todo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cdsscheduleapp.R;

public class Fragment1ToDo extends Fragment {
    RecyclerView recyclerView;
    ToDoAdapter adapter;
    private Context mContext;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mContext = null;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       final ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment1_todo, container, false);

        recyclerView = viewGroup.findViewById(R.id.recyclerViewToDo);

        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new ToDoAdapter();

        adapter.addItem(new ToDoItem("코딩하기"));
        adapter.addItem(new ToDoItem("코딩하기"));
        adapter.addItem(new ToDoItem("두줄 테스트 두줄 테스트 두줄 테스트 두줄 테스트 "));
        adapter.addItem(new ToDoItem("코딩하기"));
        adapter.addItem(new ToDoItem("코딩하기"));
        adapter.addItem(new ToDoItem("세줄 테스트 세줄 테스트 세줄 테스트 세줄 테스트 세줄 테스트 세줄 테스트 "));
        adapter.addItem(new ToDoItem("코딩하기"));
        adapter.addItem(new ToDoItem("코딩하기"));
        adapter.addItem(new ToDoItem("코딩하기"));
        adapter.addItem(new ToDoItem("코딩하기"));
        adapter.addItem(new ToDoItem("코딩하기"));
        adapter.addItem(new ToDoItem("코딩하기"));
        adapter.addItem(new ToDoItem("코딩하기"));
        adapter.addItem(new ToDoItem("코딩하기"));
        adapter.addItem(new ToDoItem("코딩하기"));
        adapter.addItem(new ToDoItem("마지막 줄"));

        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnToDoClickListener() {
            @Override //리사이클러뷰 항목 선택시 동작
            public void onItemClick(ToDoAdapter.ViewHolder holder, View view, int position) {
                Toast.makeText(mContext, "선택됨", Toast.LENGTH_SHORT).show();
                Log.d("test", "position : " + position);
                Log.d("test", "isChecked? : " + adapter.getItem(position).isChecked);
            }
        });

        ImageButton buttonShowRoutine = viewGroup.findViewById(R.id.todo_show_routine);
        buttonShowRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ImageButton buttonShowCalendar = viewGroup.findViewById(R.id.todo_show_calendar);
        buttonShowCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ImageButton buttonDeleteChecked = viewGroup.findViewById(R.id.todo_delete_checked);
        buttonDeleteChecked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ImageButton buttonDeleteAll = viewGroup.findViewById(R.id.todo_delete_all);
        buttonDeleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

       return viewGroup;
    }

    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
    }

}
