//package com.yeejoin.util
//
//import com.yeejoin.constants.CdataString
//import com.yeejoin.constants.MsgType
//import com.yeejoin.util.XmlHelper.objectToXmlWithCDATA
//import com.yeejoin.xml.Article
//import com.yeejoin.xml.ImgMessageEntity
//import com.yeejoin.xml.PicTextMessageEntity
//import com.yeejoin.xml.TextMessageEntity
//
///**
// * Created by zhou on 2017/3/14.
// */
//
////回复文本消息
//fun generateTextXml(toUserName: String, fromUserName: String, content: String): String {
//    val entity = TextMessageEntity()
//
//    entity.toUserName = fromUserName
//    entity.fromUserName = toUserName
//    entity.createTime = (System.currentTimeMillis() / 1000).toInt()
//    entity.msgType = "text"
//    entity.content = content
//
//
//    return objectToXmlWithCDATA(entity, CdataString.text_cdata,)
//}
//
////回复图片消息
//fun generalImgXML(toUserName: String,fromUserName: String,mediaId: String) : String{
//    val entity = ImgMessageEntity()
//    entity.toUserName = fromUserName
//    entity.fromUserName = toUserName
//    entity.createTime = (System.currentTimeMillis() / 1000).toInt()
//    entity.msgType = MsgType.IMAGE.value
//    entity.image.mediaId = mediaId
//
//    return objectToXmlWithCDATA(entity, CdataString.img_cdata)
//}
//
////回复图文消息
//fun generatePicTextXml(toUserName: String,fromUserName: String) : String{
//    val article = Article()
//    article.title = "title"
//    article.description = "description"
//    article.url = "https://v.qq.com/x/page/h03834ulk4b.html"
//    article.picUrl = "http://mmbiz.qpic.cn/mmbiz_png/0MiaQYvt6ehAb9NRrh87NyBsMuL4fP9fVsJEWStU1bK5icestAicfn2VUI4LdtlrzTk5u8ulricUG88FW2rzNjTdRw/0?wx_fmt=png"
//
//    val entity = PicTextMessageEntity()
//    entity.toUserName = fromUserName
//    entity.fromUserName = toUserName
//    entity.createTime = (System.currentTimeMillis() / 1000).toInt()
//    entity.msgType = MsgType.NEWS.value
//    entity.articleCount = 1
//    entity.articles = arrayListOf()
//    entity.articles.add(article)
//
//    return objectToXmlWithCDATA(entity, CdataString.img_text_cdata)
//}