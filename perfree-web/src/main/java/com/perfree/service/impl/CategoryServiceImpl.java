package com.perfree.service.impl;

import com.perfree.model.Category;
import com.perfree.mapper.CategoryMapper;
import com.perfree.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分类表 服务实现类
 * </p>
 *
 * @author Perfree
 * @since 2022-03-19
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
