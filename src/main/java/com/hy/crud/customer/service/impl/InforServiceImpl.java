package com.hy.crud.customer.service.impl;

import com.hy.crud.customer.entity.Infor;
import com.hy.crud.customer.mapper.InforMapper;
import com.hy.crud.customer.service.IInforService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gwl
 * @since 2020-03-24
 */
@Service
@Transactional
public class InforServiceImpl extends ServiceImpl<InforMapper, Infor> implements IInforService {
    @Autowired
    private InforMapper Mapper;

    @Override
    public List<Infor> queryAll() {
        return Mapper.selectList(null);
    }
}
