package xyz.tiancaikai.gulimall.order.dao;

import xyz.tiancaikai.gulimall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-09-02 14:49:21
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
