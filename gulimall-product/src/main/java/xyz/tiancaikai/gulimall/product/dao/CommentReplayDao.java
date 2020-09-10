package xyz.tiancaikai.gulimall.product.dao;

import xyz.tiancaikai.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-09-09 09:39:19
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
