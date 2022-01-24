package my.study.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("category")
public class Category {
    //主键，以及生成策略
    @TableId(value = "id")
    private int id;
    private String name;
}
