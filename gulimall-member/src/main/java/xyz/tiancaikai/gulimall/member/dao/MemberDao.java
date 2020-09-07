package xyz.tiancaikai.gulimall.member.dao;

import xyz.tiancaikai.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-09-02 10:41:17
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
