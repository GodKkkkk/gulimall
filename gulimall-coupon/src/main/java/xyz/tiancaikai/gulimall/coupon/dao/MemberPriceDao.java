package xyz.tiancaikai.gulimall.coupon.dao;

import xyz.tiancaikai.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-09-02 10:29:10
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
