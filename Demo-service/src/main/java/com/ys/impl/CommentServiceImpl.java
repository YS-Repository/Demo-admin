package com.ys.impl;

import com.ys.CommentService;
import com.ys.dao.CommentDao;
import com.ys.domain.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: SONY
 * Date: 2017/11/2
 * Time: 10:08
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Override
    public Comment getComment(Integer id){
        return commentDao.getComment(id);
//        System.out.println("CommentServiceImpl.getComment");
//        return null;
    }
}
