package com.wang.service;

import com.wang.domain.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.vo.HotArticleVo;


import java.util.List;

/**
* @author wang
* @description 针对表【article(文章列表)】的数据库操作Service
* @createDate 2022-10-07 23:34:50
*/
public interface ArticleService extends IService<Article> {

    //查询热门文章 10条
    List<HotArticleVo> getHotArticleList();
}
