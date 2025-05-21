package com.cognizant.TaskManagementSystem.services;

import com.cognizant.TaskManagementSystem.models.Task;
import com.cognizant.TaskManagementSystem.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRep;

    public List<Task> getAllTasks() {
        return taskRep.findAll();
    }

    public Task getTaskById(Integer id) {
        return taskRep.findById(id).get();
    }

    public Task addTask(Task task) {
        return taskRep.save(task);
    }

    public void updateTask(Integer id, String title, String description, Boolean completed) {
        if (taskRep.existsById(id)) {
            Task task = taskRep.findById(id).get();
            if (title != null) task.setTitle(title);
            if (description != null) task.setDescription(description);
            if (completed != null) task.setCompleted(completed);
            taskRep.save(task);
        }
    }

    public void deleteTask(Integer id) {
        taskRep.deleteById(id);
    }

}
