package xyz.tiancaikai.gulimall.product.dao;

import xyz.tiancaikai.gulimall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-08-31 14:42:55
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
