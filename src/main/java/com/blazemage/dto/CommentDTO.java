package com.blazemage.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;


/**
 * @author blazemage
 * @date 2021/12/28
 * @apiNote
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "评论")
public class CommentDTO {

    /**
     * 评论目标用户id
     */
    @ApiModelProperty(name = "replyUserId", value = "评论目标用户id", dataType = "Integer")
    private Integer replyUserId;

    /**
     * 评论文章id
     */
    @ApiModelProperty(name = "articleId", value = "文章id", dataType = "Integer")
    private Integer articleId;

    /**
     * 评论内容
     */
    @NotBlank(message = "评论内容不能为空")
    @ApiModelProperty(name = "commentContent", value = "评论内容", required = true, dataType = "String")
    private String commentContent;

    /**
     * 文章根评论id
     */
    @ApiModelProperty(name = "parentId", value = "文章根评论id", dataType = "Integer")
    private Integer parentId;

    /**
     * 评论用户id
     */
    @ApiModelProperty(name = "userId", value = "评论用户ID", dataType = "Long")
    private Long userId;


}
