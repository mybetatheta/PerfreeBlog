package com.perfree.service.impl;

import com.perfree.model.Tag;
import com.perfree.mapper.TagMapper;
import com.perfree.service.TagService;
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
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}
