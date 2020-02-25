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

        CreateTaskRequest createTaskRequest = new CreateTaskRequest();
        createTaskRequest.setDeadline(LocalDate.now().plusWeeks(1));
        createTaskRequest.setDescription("Learn JDBC");

        TaskRepository taskRepository = new TaskRepository();
        taskRepository.createTask(createTaskRequest);

    }
}
