package mybatiscreate.jardemo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author chenmingming
 * @date 2018/9/5
 */
@Data
@Table(name = "worker")
public class Worker {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "times_tamp")
    private Long timesTamp;

    @Column(name = "age")
    private Integer age;

    @Column(name = "name",length = 40)
    private String name;
}
