package com.wang.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 文章列表
 * @TableName article
 */
@TableName(value ="article")
@Data
public class Article implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章类型： 1：文章 2：草稿
     */
    private String type;

    /**
     * 文章摘要
     */
    private String summary;

    /**
     * 所属分类
     */
    private Long categoryId;

    /**
     * 缩略图
     */
    private String thumbnail;

    /**
     * 是否置顶： 0：否 1：是
     */
    private String isTop;

    /**
     * 状态 0：已发布 1：草稿
     */
    private String status;

    /**
     * 评论数
     */
    private Integer commentCount;

    /**
     * 访问量
     */
    private Long viewCount;

    /**
     * 是否允许评论 1；是  0：否
     */
    private String isComment;

    /**
     * 
     */
    private Long createBy;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Long updateBy;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 删除标志 0：未删除 1：逻辑已删除
     */
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}