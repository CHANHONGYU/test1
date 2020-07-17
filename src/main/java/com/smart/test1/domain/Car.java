package com.smart.test1.domain;

import java.util.Date;
import lombok.Data;

@Data
public class Car {
    /**
    * 车辆id
    */
    private Integer carId;

    /**
    * 车辆照片
    */
    private String carPic;

    /**
    * 所属业主id
    */
    private Integer ownerId;

    /**
    * 车辆颜色
    */
    private String carColor;

    /**
    * 杞︾墝鍙风爜
    */
    private String carNo;

    /**
    * 备注
    */
    private String ownerRemarks;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 假删除：0是已删除，1是存在
    */
    private Integer isDel;
}