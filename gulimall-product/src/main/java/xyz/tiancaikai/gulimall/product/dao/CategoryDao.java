package xyz.tiancaikai.gulimall.product.dao;

import xyz.tiancaikai.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-09-09 09:39:18
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
