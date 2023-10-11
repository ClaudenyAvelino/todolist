package br.com.claudeny.todolist.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class taskController {


    @Autowired
    private ITaskRepository taskRepository;

    @PostMapping("/")
    public taskModel created(@RequestBody taskModel taskModel){
        var task = this.taskRepository.save(taskModel);
        return task;

    }
}
