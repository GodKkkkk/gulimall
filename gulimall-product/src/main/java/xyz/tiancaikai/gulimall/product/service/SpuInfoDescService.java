package xyz.tiancaikai.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.tiancaikai.common.utils.PageUtils;
import xyz.tiancaikai.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-09-09 09:39:18
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

