//package com.yeejoin.util
//
//import com.yeejoin.bean.EquipModel
//
///**
// * Created by zhou on 2017/3/13.
// */
//
//fun mapEquip(entity: EquipModel, code: String) : String{
//    var url = "";
//    if (entity.equipVideo != null)
//        url = """<a href="${entity.equipVideo}">点击查看演示视频</a>"""
//    else
//        url = """<a>点击查看演示视频</a>"""
//
//    return """名称:${entity.equipname}
//数量:${entity.Count ?: "20个"}
//已保养时间:${entity.maintenanceDate ?:"2016-12-01"}
//需保养时间:${entity.maintenanceNextDate ?:"2017-12-01"}
//入库时间:${entity.InDate ?:"2015-02-02"}
//装备编码:${entity.equipCode}
//分类名称:${entity.typeName}
//分类编码:${entity.typeCode}
//所属机构:${entity.orgName}
//仓库名称:${entity.storeName}
//RFID:$code
//$url
//""".trimMargin()
//}