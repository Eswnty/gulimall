package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author eswnty
 * @email eswnty@gmail.com
 * @date 2022-07-05 16:58:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
