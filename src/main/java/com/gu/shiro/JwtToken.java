package com.gu.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author gubengang
 * @create 2021-08-21 9:26
 */
public class JwtToken implements AuthenticationToken {
    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
