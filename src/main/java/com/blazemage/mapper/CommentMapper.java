package com.blazemage.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.blazemage.vo.CommentVO;
import com.blazemage.vo.ReplyCountVO;
import com.blazemage.vo.ReplyVO;
import com.blazemage.vo.SystemCommentVO;
import com.blazemage.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 博客评论表 Mapper 接口
 * </p>
 *
 * @author blazemage
 * @since 2021-07-19
 */
@Repository
public interface CommentMapper extends BaseMapper<Comment> {

    List<CommentVO> listComments(@Param("page") int page, @Param("size") int size, @Param("articleId") Long articleId);

    List<ReplyVO> listReplies(Integer id);

    ReplyCountVO listReplyCountByCommentId(Integer id);

    Page<SystemCommentVO> selectPageList(@Param("page")Page<Object> objectPage, @Param("keywords")String keywords);
}
