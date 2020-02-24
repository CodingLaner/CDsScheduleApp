package com.example.cdsscheduleapp.fragment1todo;

import android.app.ActionBar;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       final ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment1_todo, container, false);

        recyclerView = viewGroup.findViewById(R.id.recyclerViewToDo);

        LinearLayoutManager layoutManager = new LinearLayoutManager(viewGroup.getContext());
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
                Toast.makeText(viewGroup.getContext(), "선택됨", Toast.LENGTH_SHORT).show();
                Log.d("test", "position : " + position);
                Log.d("test", "isChecked? : " + adapter.getItem(position).isChecked);
            }
        });

       return viewGroup;
    }


}
