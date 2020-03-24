package com.hy.crud.customer.service;

import com.hy.crud.customer.entity.Infor;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hy.crud.customer.mapper.InforMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gwl
 * @since 2020-03-24
 */
public interface IInforService extends IService<Infor> {


    public List<Infor> queryAll();


}
