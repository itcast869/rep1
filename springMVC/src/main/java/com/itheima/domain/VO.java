package com.itheima.domain;

import java.util.List;

/**
 * @Author: JGT
 * @Date: 2019/7/14  18:36
 */
public class VO {
    private List<User> list;

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "VO{" +
                "list=" + list +
                '}';
    }
}
