package com.example.dgsw.viewmodel_exam;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Todo.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TodoDao todoDao();
}
