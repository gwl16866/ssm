package com.hy.crud.customer.controller;


import com.hy.crud.customer.entity.Infor;
import com.hy.crud.customer.service.IInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gwl
 * @since 2020-03-24
 */
@Controller
@RequestMapping("/customer")
public class InforController {
    @Autowired
    private IInforService iInforService;

    @RequestMapping("/query.do")
    public String query(Model model){
        model.addAttribute("list",iInforService.queryAll());
        return "show";
    }

    @RequestMapping("/add.do")
    public void add(Infor infor){

    }

}
