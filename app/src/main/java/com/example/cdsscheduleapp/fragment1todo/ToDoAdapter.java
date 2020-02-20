package com.example.cdsscheduleapp.fragment1todo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cdsscheduleapp.R;

import java.util.ArrayList;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ViewHolder> implements OnToDoClickListener {
    ArrayList<ToDoItem> items = new ArrayList<ToDoItem>();

    OnToDoClickListener listener;

    @NonNull
    @Override
    public ToDoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.todo_item, viewGroup, false);

        return new ViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoAdapter.ViewHolder viewHolder, int position) {
        final ToDoItem item = items.get(position);

        viewHolder.checkBoxToDo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                item.setIsChecked(isChecked);
            }
        });

        viewHolder.setItem(item);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onItemClick(ToDoAdapter.ViewHolder holder, View view, int position) {
        if (listener != null) {
            listener.onItemClick(holder,view,position);
        }

    }

    public void addItem(ToDoItem item) {
        items.add(item);
    }

    public void setItems(ArrayList<ToDoItem> items) {
        this.items = items;
    }

    public ToDoItem getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, ToDoItem item) {
        items.set(position, item);
    }

    public void setOnItemClickListener(OnToDoClickListener listener) {
        this.listener = listener;
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewToDo;
        CheckBox checkBoxToDo;

        public ViewHolder(View itemView, final OnToDoClickListener listener) {
            super(itemView);

            textViewToDo = itemView.findViewById(R.id.textViewToDo);
            checkBoxToDo = itemView.findViewById(R.id.checkBoxToDo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                    if (listener != null) {
                        listener.onItemClick(ViewHolder.this,v,position);

                    }
                }
            });
        }

        public void setItem(ToDoItem item) {
            textViewToDo.setText(item.getTodo());
            checkBoxToDo.setChecked(item.getIsChecked());
        }
    }
}
