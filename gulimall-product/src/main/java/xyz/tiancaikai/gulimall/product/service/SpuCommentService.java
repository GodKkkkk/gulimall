package xyz.tiancaikai.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.tiancaikai.common.utils.PageUtils;
import xyz.tiancaikai.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-08-31 14:42:54
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

