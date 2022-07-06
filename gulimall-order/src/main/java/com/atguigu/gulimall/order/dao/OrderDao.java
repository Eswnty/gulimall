package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author eswnty
 * @email eswnty@gmail.com
 * @date 2022-07-05 20:08:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
