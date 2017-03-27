package com.yeejoin.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by zhou on 2017/3/14.
 */

@XmlRootElement(name = "xml")
public class ImgMessageEntity {
    @XmlElement
    private String ToUserName;
    @XmlElement
    private String FromUserName;
    @XmlElement
    private int CreateTime;
    @XmlElement
    private String MsgType;
    @XmlElement
    private Image Image = new Image();

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

    public ImgMessageEntity.Image getImage() {
        return Image;
    }

    public void setImage(ImgMessageEntity.Image image) {
        Image = image;
    }

    public static class Image{
        @XmlElement
        private String MediaId;

        public String getMediaId() {
            return MediaId;
        }

        public void setMediaId(String mediaId) {
            MediaId = mediaId;
        }
    }
}
