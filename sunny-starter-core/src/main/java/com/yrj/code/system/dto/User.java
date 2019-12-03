package com.yrj.code.system.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yrj.code.base.BaseDTO;
import com.yrj.code.util.Dates;
import lombok.Data;

import java.util.Date;

/**
 * @author ：Yangrj
 * @date ：Created in 2019/12/3 14:05
 * @description：系统用户
 * @version: 1.0$
 */
@Data
public class User extends BaseDTO {
    private static final long serialVersionUID = -7395431342743009038L;

    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 生日
     */
    @JsonFormat(pattern = Dates.Pattern.DATE)
    private Date birthday;
    /**
     * 性别：1-男/0-女
     */
    private Integer sex;
    /**
     * 是否启用：1/0
     */
    private Integer enabled;
}
