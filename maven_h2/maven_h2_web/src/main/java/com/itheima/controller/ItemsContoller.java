package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.serive.ItemsService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: JGT
 * @Date: 2019/7/25  21:25
 */
@Controller

public class ItemsContoller {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findOne")
    public String findOne(Model model){
        Items one = itemsService.findOne(1);
        model.addAttribute("item",one);
        return "pages/itemDetail";
    }
}
