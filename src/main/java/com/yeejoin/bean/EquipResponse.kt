package com.yeejoin.bean

/**
 * Created by zhou on 2017/3/13.
 */

data class EquipResponse(val state : String,
                         val data : List<EquipModel> ?,
                         val time : String,
                         val message : String?)

data class EquipModel(val equipname : String?, //装备名称
                      val equipCode : String?, //装备编码
                      val typeCode : String?, //装备分类编码
                      val typeName : String?,//装备分类名称
                      val unit : String?, //计量单位
                      val orgName : String?,
                      val storeName : String?, //仓库名称
                      val equipModel : String?, //装备型号
                      val manufacturer : String?, //生产厂家
                      val productionSource : String?,//生产源地
                      val equipImg : String?,//图片
                      val equipVideo : String?, //视频URL
                      val maintenanceCycle : String?,//保养周期
                      val maintenanceDate : String?,//已保养时间
                      val Count : String?,//数量
                      val InDate : String?,//入库时间
                      val maintenanceNextDate : String?,//需保养时间
                      val markSpecification : String?)//标识规范