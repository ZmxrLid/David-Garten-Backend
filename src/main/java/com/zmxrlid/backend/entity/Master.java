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
  @ApiModel(value = "Master对象", description = "")
public class Master implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("校长id")
        @TableId(value = "master_id", type = IdType.AUTO)
      private Integer masterId;

      @ApiModelProperty("校长名字")
      private String masterName;

      @ApiModelProperty("校长密码")
      private String masterPassword;

      @ApiModelProperty("校长底薪")
      private Double masterCollnum;

      @ApiModelProperty("校长股份")
      private Double masterShare;


}
