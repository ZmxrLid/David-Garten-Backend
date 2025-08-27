package com.zmxrlid.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
  @ApiModel(value = "Class对象", description = "")
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("班级id")
        @TableId(value = "class_id", type = IdType.AUTO)
      private Integer classId;

      @ApiModelProperty("班级名字")
      private String className;

      @ApiModelProperty("班级所属校长")
      private Integer classMasterid;


}
