package org.fasttrackit.service;

import com.mysql.cj.PreparedQuery;
import org.fasttrackit.domain.Task;
import org.fasttrackit.persistance.TaskRepository;
import org.fasttrackit.transfer.CreateTaskRequest;
import org.fasttrackit.transfer.UpdateTaskRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class TaskService {

    private TaskRepository taskRepository = new TaskRepository();

    public void createTask(CreateTaskRequest request) throws IOException, SQLException {
        System.out.println("Create Task: " + request);
        taskRepository.createTask(request);
    }

    public void updateTask(long id, UpdateTaskRequest request) throws IOException, SQLException {
        System.out.println("Update Task" + id + " : " + request);
        taskRepository.updateTask(id, request);
    }

    public void deleteTask(long id) throws IOException, SQLException {
        System.out.println("Delete Task " + id);
        taskRepository.deleteTask(id);
    }

    public List<Task> getTasks() throws IOException, SQLException {
        System.out.println(" Retrieving all Tasks");
        return taskRepository.getTasks();
    }
}
