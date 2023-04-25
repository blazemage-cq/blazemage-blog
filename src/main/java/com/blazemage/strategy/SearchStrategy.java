package com.blazemage.strategy;

import com.blazemage.vo.ArticleSearchVO;

import java.util.List;

/**
 * @author blazemage
 * @date 2022/1/19
 * @apiNote 搜索策略
 */
public interface SearchStrategy {
    /**
     * 搜索文章
     *
     * @param keywords 关键字
     * @return {@link List< ArticleSearchVO >} 文章列表
     */
    List<ArticleSearchVO> searchArticle(String keywords);
}
