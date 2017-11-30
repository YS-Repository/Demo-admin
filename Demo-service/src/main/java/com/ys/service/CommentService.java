package com.ys.service;

import com.ys.domain.Comment;

/**
 * Created by IntelliJ IDEA.
 * User: SONY
 * Date: 2017/11/2
 * Time: 10:08
 * To change this template use File | Settings | File Templates.
 */
public interface CommentService {

    public Comment getComment(Integer id);

    public void updateComment(Comment comment);

}
