package mybatiscreate.jardemo.dao;

import mybatiscreate.jardemo.entity.Worker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author chenmingming
 * @date 2018/9/5
 */
@Mapper
public interface WorkerMapper {
    List<Worker> findAll();
}
