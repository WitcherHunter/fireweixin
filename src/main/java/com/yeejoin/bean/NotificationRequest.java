package com.yeejoin.bean;

import java.io.Serializable;

/**
 * Created by zhou on 2017/3/16.
 */
public class NotificationRequest implements Serializable{
    /**
     * filter : {"is_to_all":false,"group_id":2}
     * mpnews : {"media_id":"123dsdajkasd231jhksad"}
     * msgtype : mpnews
     */

    private FilterBean filter;
    private MpnewsBean mpnews;
    private String msgtype;

    public FilterBean getFilter() {
        return filter;
    }

    public void setFilter(FilterBean filter) {
        this.filter = filter;
    }

    public MpnewsBean getMpnews() {
        return mpnews;
    }

    public void setMpnews(MpnewsBean mpnews) {
        this.mpnews = mpnews;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public static class FilterBean {
        /**
         * is_to_all : false
         * group_id : 2
         */

        private boolean is_to_all;
        private String group_id;

        public boolean isIs_to_all() {
            return is_to_all;
        }

        public void setIs_to_all(boolean is_to_all) {
            this.is_to_all = is_to_all;
        }

        public String getGroup_id() {
            return group_id;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }
    }

    public static class MpnewsBean {
        /**
         * media_id : 123dsdajkasd231jhksad
         */

        private String media_id;

        public String getMedia_id() {
            return media_id;
        }

        public void setMedia_id(String media_id) {
            this.media_id = media_id;
        }
    }
}
