package com.ys.service.impl;

import com.ys.service.CommentService;
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
    public Comment getComment(Integer id) {
        return commentDao.getComment(id);
//        System.out.println("CommentServiceImpl.getComment");
//        return null;
    }

    @Override
    public void updateComment(Comment comment) {
        Comment comment1 = new Comment();
        comment1.setId(2);
        comment1.setTitle("操作1");
        Comment comment2 = new Comment();
        comment2.setId(3);
        comment2.setTitle("操作2");
        try {
            commentDao.updateComment(comment1);
            String d = null;
            d.toString();
            commentDao.updateComment(comment2);
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
}
