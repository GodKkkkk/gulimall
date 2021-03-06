package xyz.tiancaikai.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.tiancaikai.common.utils.PageUtils;
import xyz.tiancaikai.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-09-02 15:01:28
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

