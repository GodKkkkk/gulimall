package xyz.tiancaikai.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 专题商品
 * 
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-09-02 10:29:10
 */
@Data
@TableName("sms_home_subject_spu")
public class HomeSubjectSpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private String name;
	/**
	 * $column.comments
	 */
	private Long subjectId;
	/**
	 * $column.comments
	 */
	private Long spuId;
	/**
	 * $column.comments
	 */
	private Integer sort;

}
