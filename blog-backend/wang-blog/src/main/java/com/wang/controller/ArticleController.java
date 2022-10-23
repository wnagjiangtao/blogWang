package com.wang.controller;

import com.wang.domain.Article;
import com.wang.response.BaseResponse;
import com.wang.response.ResultUtils;
import com.wang.service.ArticleService;
import com.wang.vo.HotArticleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//restful 标准定义
@RestController
//请求前缀
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    /**
     * 查询热门文章 10条
     * @return
     */
    @GetMapping("/hotArticleList")
    public BaseResponse<List<HotArticleVo>> getHotArticleList(){
        List<HotArticleVo> result =  articleService.getHotArticleList();

        return ResultUtils.success(result);
    }

}
