package xyz.tiancaikai.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 首页轮播广告
 * 
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-09-02 10:29:10
 */
@Data
@TableName("sms_home_adv")
public class HomeAdvEntity implements Serializable {
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
	private String pic;
	/**
	 * $column.comments
	 */
	private Date startTime;
	/**
	 * $column.comments
	 */
	private Date endTime;
	/**
	 * $column.comments
	 */
	private Integer status;
	/**
	 * $column.comments
	 */
	private Integer clickCount;
	/**
	 * $column.comments
	 */
	private String url;
	/**
	 * $column.comments
	 */
	private String note;
	/**
	 * $column.comments
	 */
	private Integer sort;
	/**
	 * $column.comments
	 */
	private Long publisherId;
	/**
	 * $column.comments
	 */
	private Long authId;

}
