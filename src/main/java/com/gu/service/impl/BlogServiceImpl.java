package com.gu.service.impl;

import com.gu.entity.Blog;
import com.gu.mapper.BlogMapper;
import com.gu.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 关注公众号：GuHub
 * @since 2021-08-21
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
