package com.wang.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.constants.SystemConstants;
import com.wang.service.ArticleService;
import com.wang.domain.Article;
import com.wang.mapper.ArticleMapper;
import com.wang.utils.BeanCopyUtils;
import com.wang.vo.HotArticleVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author wang
* @description 针对表【article(文章列表)】的数据库操作Service实现
* @createDate 2022-10-07 23:34:50
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;


    /**
     *  查询热门文章 10条
     * @return
     */
    public List<HotArticleVo> getHotArticleList(){

        QueryWrapper<Article> queryWrapper = new QueryWrapper<>();

        //查询条件
        // 不能为草稿
        queryWrapper.eq("status", SystemConstants.ARTICLE_STATUS_NORMAL);
        // 按照浏览量排序
        queryWrapper.orderByDesc("view_count");
        //只能取10条
        Page<Article> page10 = new Page(1,10);

        Page<Article> articlePage = articleMapper.selectPage(page10, queryWrapper);

        List<HotArticleVo> vs = BeanCopyUtils.copyBeanList(articlePage.getRecords(), HotArticleVo.class);

        return vs;
    }
}




