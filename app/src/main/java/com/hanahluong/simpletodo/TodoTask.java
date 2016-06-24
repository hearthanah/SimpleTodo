package com.hanahluong.simpletodo;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by hanahluong on 6/24/16.
 */

@Table(name = "TodoTasks")
public class TodoTask extends Model {
//    @Column(name = "remote_id", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
//    public long remoteId;

    @Column(name = "text")
    public String text;

    // Make sure to define this constructor (with no arguments)
    // If you don't querying will fail to return results!
    public TodoTask() {
        super();
    }

    // Be sure to call super() on additional constructors as well
    public TodoTask(String text){
        super();
        this.text = text;
    }

    public static List<TodoTask> getAll() {
        // This is how you execute a query
        return new Select()
                .from(TodoTask.class)
                .execute();
    }
}
