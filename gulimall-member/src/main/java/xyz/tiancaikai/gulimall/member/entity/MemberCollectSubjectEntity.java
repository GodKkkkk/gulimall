package xyz.tiancaikai.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员收藏的专题活动
 * 
 * @author tiancaikai
 * @email 523866653@qq.com
 * @date 2020-09-02 10:41:17
 */
@Data
@TableName("ums_member_collect_subject")
public class MemberCollectSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long subjectId;
	/**
	 * $column.comments
	 */
	private String subjectName;
	/**
	 * $column.comments
	 */
	private String subjectImg;
	/**
	 * $column.comments
	 */
	private String subjectUrll;

}