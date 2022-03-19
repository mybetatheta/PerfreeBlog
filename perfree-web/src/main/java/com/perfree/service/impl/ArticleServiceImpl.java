package com.perfree.service.impl;

import com.perfree.model.Article;
import com.perfree.mapper.ArticleMapper;
import com.perfree.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Perfree
 * @since 2022-03-19
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
