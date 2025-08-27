package com.zmxrlid.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 惜喃
 * @since 2025-08-27
 */
@Getter
@Setter
  @ApiModel(value = "Teacher对象", description = "")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("老师id")
        @TableId(value = "teacher_id", type = IdType.AUTO)
      private Integer teacherId;

      @ApiModelProperty("老师名字")
      private String teacherName;

      @ApiModelProperty("老师密码")
      private String teacherPassword;

      @ApiModelProperty("老师底薪")
      private Double teacherCollnum;

      @ApiModelProperty("老师股份")
      private Double teacherShare;

      @ApiModelProperty("老师班级名字")
      private String teacherClassname;

      @ApiModelProperty("老师职务")
      private Integer teacherPosts;

      @ApiModelProperty("老师保险状态")
      private Integer teacherInstate;

      @ApiModelProperty("老师保险金额")
      private Double teacherIncollnum;

      @ApiModelProperty("老师保险公司承担")
      private Double teacherIngnum;

      @ApiModelProperty("老师入职时间")
      private LocalDateTime teacherJointime;

      @ApiModelProperty("老师离职时间")
      private LocalDateTime teacherLeavetime;

      @ApiModelProperty("老师状态0离职1在职")
      private Integer teacherState;

      @ApiModelProperty("老师备注")
      private String teacherRemark;

      @ApiModelProperty("老师所属校长id")
      private Integer teacherMasterid;

      @ApiModelProperty("老师电话")
      private String teacherTel;

      @ApiModelProperty("老师全勤奖金")
      private Double teacherAttnum;

      @ApiModelProperty("老师管理班级id")
      private Integer teacherClassid;

      @ApiModelProperty("老师校长名字")
      private String teacherMastername;


}
