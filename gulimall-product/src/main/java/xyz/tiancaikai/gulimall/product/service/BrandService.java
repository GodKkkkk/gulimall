package xyz.tiancaikai.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.tiancaikai.common.utils.PageUtils;
import xyz.tiancaikai.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-08-31 14:42:55
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

