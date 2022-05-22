package com.wjl.demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.demo.mapper.StProductMapper;
import com.wjl.demo.model.StProduct;
import com.wjl.demo.service.IStProductService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品表 服务实现类
 * </p>
 *
 * @author wjl
 * @since 2022-05-14
 */
@Service
public class StProductServiceImpl extends ServiceImpl<StProductMapper, StProduct> implements IStProductService {

    @Autowired
    StProductMapper stProductMapper;
    @Override
    public StProduct getStProduct(String id) {
        return stProductMapper.selectById(id);
    }
}
