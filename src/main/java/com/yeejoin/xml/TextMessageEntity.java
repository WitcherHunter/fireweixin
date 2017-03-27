package com.yeejoin.xml;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by zhou on 2017/3/11.
 *
 * 文本消息实体类
 */

@XmlRootElement(name = "xml")
public class TextMessageEntity {
    @XmlElement
    private String ToUserName;

    @XmlElement
    private String FromUserName;

    @XmlElement
    private int CreateTime;

    @XmlElement
    private String MsgType;

    @XmlElement
    private String Content;

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public int getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(int createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
