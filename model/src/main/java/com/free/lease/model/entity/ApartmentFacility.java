package com.free.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Schema(description = "公寓&配套关系")
@TableName(value = "apartment_facility")
@Data
//加了builder注解后不能new来创建对象,可以使用builder().build来创建
@Builder
public class ApartmentFacility extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Schema(description = "公寓id")
    @TableField(value = "apartment_id")
    private Long apartmentId;

    @Schema(description = "设施id")
    @TableField(value = "facility_id")
    private Long facilityId;


}