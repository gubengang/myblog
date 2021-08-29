package com.gu.utils;

import com.gu.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author gubengang
 * @create 2021-08-21 9:38
 */
public class ShiroUtil {
    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
