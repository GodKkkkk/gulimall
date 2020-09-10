package xyz.tiancaikai.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.tiancaikai.common.utils.PageUtils;
import xyz.tiancaikai.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-09-09 09:39:18
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

