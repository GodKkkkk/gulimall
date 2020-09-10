package xyz.tiancaikai.gulimall.product;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.tiancaikai.common.utils.PageUtils;
import xyz.tiancaikai.gulimall.product.dao.CategoryDao;
import xyz.tiancaikai.gulimall.product.entity.BrandEntity;
import xyz.tiancaikai.gulimall.product.entity.CategoryEntity;
import xyz.tiancaikai.gulimall.product.service.BrandService;
import xyz.tiancaikai.gulimall.product.service.CategoryService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootTest
class GulimallProductApplicationTests extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {


    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        List<CategoryEntity> entities = baseMapper.selectList(null);

        List<CategoryEntity> level1Menus = entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).collect(Collectors.toList());

        System.out.print(level1Menus.toString());


    }

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        return null;
    }
}
