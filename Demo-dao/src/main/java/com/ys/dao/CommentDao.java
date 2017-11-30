package com.ys.dao;

import com.ys.domain.Comment;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: SONY
 * Date: 2017/11/2
 * Time: 10:08
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface CommentDao {
    //    @Select("select * from comment where id=#{id}")
    public Comment getComment(Integer id);

    //事务操作检验
    public void updateComment(Comment comment);

}
