package com.zhongmc.blog.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.zhongmc.blog.domain.Blog;
import com.zhongmc.blog.domain.Tag;
import com.zhongmc.blog.service.IBlogService;
import com.zhongmc.blog.service.ITagServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by ZMC on 2017/1/25.
 */
@Controller
public class BlogDetailController extends BaseController {
    @Autowired
    IBlogService blogService;
    @Autowired
    ITagServive tagService;

    @RequestMapping("/blog/{id}")
    public String blogDetail(@PathVariable("id")int id, Model model){
        Blog blog = blogService.findOneById(id);
        List<Tag>tagList = tagService.findTagsByBlogId(id);
        String tagStr = "";
        for (Tag tag: tagList) {
            tagStr+=tag.getTagname()+"|";
        }
        blog.setTags(tagStr.substring(0,tagStr.length()-1));
        blog.setTagList(tagList);
        model.addAttribute("blog",blog);
        /*return "themes/default/page" ;*/
        return THEME+"/page";
    }
}
