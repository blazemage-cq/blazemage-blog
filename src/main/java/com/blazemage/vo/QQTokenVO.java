package com.blazemage.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author blazemage
 * @date 2022/1/5
 * @apiNote
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QQTokenVO {

    /**
     * openid
     */
    private String openid;

    /**
     * 客户端id
     */
    private String client_id;

}
