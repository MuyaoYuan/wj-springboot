package my.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    //主键，以及生成策略
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
}
