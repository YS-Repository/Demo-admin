package com.ys.controller;

import com.ys.CommentService;
import com.ys.domain.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: SONY
 * Date: 2017/11/2
 * Time: 10:08
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping("hello")
    public String getComment(String name, Model model){
        System.out.println("CommentController.getComment");
        Comment comment = commentService.getComment(2);
        System.out.println(comment);
        model.addAttribute("name",comment);

        return "user/demo";

    }
}
