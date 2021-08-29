package com.gu.common.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author gubengang
 * @create 2021-08-21 10:23
 */
@Data
public class LoginDto {
    @NotBlank(message = "昵称不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;
}
