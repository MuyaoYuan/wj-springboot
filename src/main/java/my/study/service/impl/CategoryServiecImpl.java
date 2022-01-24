package my.study.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import my.study.dao.CategoryDao;
import my.study.entity.Category;
import my.study.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiecImpl extends ServiceImpl<CategoryDao, Category> implements CategoryService {
}
