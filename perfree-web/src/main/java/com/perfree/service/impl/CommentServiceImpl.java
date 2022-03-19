package com.perfree.service.impl;

import com.perfree.model.Comment;
import com.perfree.mapper.CommentMapper;
import com.perfree.service.CommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
