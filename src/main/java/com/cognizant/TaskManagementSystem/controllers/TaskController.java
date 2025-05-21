package com.cognizant.TaskManagementSystem.controllers;

import com.cognizant.TaskManagementSystem.models.Task;
import com.cognizant.TaskManagementSystem.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/tasks/")
public class TaskController {
    private final TaskService ts;

    @Autowired
    public TaskController(TaskService ts) {
        super();
        this.ts = ts;
    }

    @GetMapping
    public List<Task> getTasks(){
        return ts.getAllTasks();
    }

    @GetMapping(path="{taskId}")
    public Task getTask(@PathVariable("taskId") Integer id) {
        return ts.getTaskById(id);
    }

    @PostMapping
    public void addTask(@RequestBody Task task) {
        ts.addTask(task);
    }

    @PutMapping(path="{taskId}")
    public void updateTask(
            @PathVariable("taskId") Integer id,
            @RequestParam(name="title", required=false) String title,
            @RequestParam(name="description", required=false) String description,
            @RequestParam(name="completed", required=false) Boolean completed
    ) {
        ts.updateTask(id, title, description, completed);
    }

    @DeleteMapping(path="{taskId}")
    public void deleteTask(@PathVariable("taskId") Integer id) {
        ts.deleteTask(id);
    }

}
