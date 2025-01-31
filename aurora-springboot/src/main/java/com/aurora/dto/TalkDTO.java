package com.aurora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 花未眠
 * 说说dto
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TalkDTO {

    /**
     * 说说id
     */
    private Integer id;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 说说内容
     */
    private String content;

    /**
     * 图片
     */
    private String images;

    /**
     * 图片列表
     */
    private List<String> imgs;

    /**
     * 是否置顶
     */
    private Integer isTop;

    /**
     * 评论量
     */
    private Integer commentCount;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

}
