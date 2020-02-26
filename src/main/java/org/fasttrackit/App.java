package org.fasttrackit;

import org.fasttrackit.persistance.TaskRepository;
import org.fasttrackit.transfer.CreateTaskRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, SQLException {
        TaskRepository taskRepository = new TaskRepository();

//        CreateTaskRequest request = new CreateTaskRequest();
//        request.setDeadline(LocalDate.now().plusWeeks(1));
//        request.setDescription("Learn JDBC");
//
//
//        taskRepository.createTask(request);

//        UpdateTaskRequest request = new UpdateTaskRequest();
//        request.setDone(true);
//        taskRepository.updateTask(1, request);

//        taskRepository.deleteTask(1);

//        System.out.println(taskRepository.getTasks());


    }
}
