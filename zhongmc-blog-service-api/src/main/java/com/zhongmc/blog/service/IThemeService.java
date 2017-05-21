package com.zhongmc.blog.service;

import com.zhongmc.blog.domain.Theme;

import java.util.List;

/**
 * Created by zhongmc on 2017/3/20.
 * 主题
 */
public interface IThemeService {
    String getCurrentTheme();
    List<Theme> getAllThemes();
    void updataThemeStatus(String status, String name);
}
