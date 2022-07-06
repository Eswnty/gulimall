package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author eswnty
 * @email eswnty@gmail.com
 * @date 2022-07-05 19:33:20
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
