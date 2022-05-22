package com.wjl.demo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wjl.demo.model.StProduct;

/**
 * <p>
 * 产品表 服务类
 * </p>
 *
 * @author wjl
 * @since 2022-05-14
 */
public interface IStProductService extends IService<StProduct> {

    StProduct getStProduct(String id);

}
