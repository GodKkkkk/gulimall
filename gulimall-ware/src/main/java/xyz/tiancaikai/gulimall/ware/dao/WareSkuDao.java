package xyz.tiancaikai.gulimall.ware.dao;

import xyz.tiancaikai.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-09-02 15:01:27
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
