package com.perfree.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author Perfree
 * @since 2022-03-19
 */
@TableName("p_article_tag")
@ApiModel(value = "ArticleTag对象", description = "")
public class ArticleTag implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("文章id")
    private Integer articleId;

    @ApiModelProperty("标签id")
    private Integer tagId;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    @Override
    public String toString() {
        return "ArticleTag{" +
            "articleId=" + articleId +
            ", tagId=" + tagId +
        "}";
    }
}
