package com.nowcoder.communt.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author ZJ
 * @create 2022-06-29 13:04
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
