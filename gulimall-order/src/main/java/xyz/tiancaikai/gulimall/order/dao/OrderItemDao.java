package xyz.tiancaikai.gulimall.order.dao;

import xyz.tiancaikai.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-09-02 14:49:22
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
