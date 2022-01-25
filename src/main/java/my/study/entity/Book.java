package my.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//表名
@TableName("book")
public class Book {
    //主键，以及生成策略
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    private String cover;
    private String title;
    private String author;
    private String date;
    private String press;
    private String abs;

    private Category category;
//    private int cid;
}
