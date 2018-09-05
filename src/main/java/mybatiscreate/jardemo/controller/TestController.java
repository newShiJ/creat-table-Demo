package mybatiscreate.jardemo.controller;

import mybatiscreate.jardemo.dao.WorkerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmingming
 * @date 2018/9/5
 */
@RestController
@RequestMapping("/worker")
public class TestController {
    @Autowired
    private WorkerMapper workerMapper;

    @GetMapping("/all")
    public Object all(){
        return workerMapper.findAll();
    }
}
