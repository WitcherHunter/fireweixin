package com.yeejoin.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhou on 2017/3/16.
 */
public class MaterialResponse implements Serializable{
    private int total_count;
    private int item_count;
    private List<ItemBean> item;

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public int getItem_count() {
        return item_count;
    }

    public void setItem_count(int item_count) {
        this.item_count = item_count;
    }

    public List<ItemBean> getItem() {
        return item;
    }

    public void setItem(List<ItemBean> item) {
        this.item = item;
    }

    public static class ItemBean {
        /**
         * media_id : 1ynGkqcHXnv-QxW85rnqOUX2zdAsrzwy9ABmzZ8mAk8
         * content : {"news_item":[{"title":"车辆调派\u2014华南师范大学实验楼","author":"消防物联云平台","digest":"华南师范大学实验楼发生火灾，情况紧急，火势严重\n现调派车辆前去增援：\n三水中队  压缩空气泡沫车     WJ粤\u20228122X\n三水中队  水罐泡沫车18吨    WJ粤\u20228123X","content":"<p style=\"text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;\"><strong><span style=\"font-size: 19px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);\">华南师范大学实验楼发生火灾<\/span><\/strong><\/p><p><img data-s=\"300,640\" data-type=\"png\" data-src=\"http://mmbiz.qpic.cn/mmbiz_png/0MiaQYvt6ehAeN2F1gBekN9shHyEN8Mh4vgnNCRtPiaQhJlq5FVQCJqZLMFKpsKbuSXBazvpGrmDWITvEBFCLWibg/0?wx_fmt=png\" data-ratio=\"0.553072625698324\" data-w=\"358\"  /><\/p><p><br  /><\/p><p style=\"text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;\"><span style=\"font-size: 15px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);\">建筑物性质 ： 实验楼<\/span><\/p><p style=\"text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;\"><span style=\"font-size: 15px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);\">华南师范大学南海校区<\/span><\/p><p style=\"text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;\"><span style=\"font-size: 15px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);\">0757-86687883 &nbsp;0757-86687222<\/span><\/p><p style=\"text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;\"><span style=\"font-size: 15px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);\">现调派以下车辆前往救援：<\/span><\/p><p style=\"text-align: left;\"><span style=\"font-size: 16px; font-family: 宋体;\">三水中队&nbsp;&nbsp;压缩空气泡沫车&nbsp;&nbsp; WJ粤·8122X<\/span><\/p><p style=\"text-align: left;\"><span style=\"font-size: 16px; font-family: 宋体;\">三水中队&nbsp;&nbsp;水罐泡沫车18吨&nbsp;&nbsp; WJ粤·8123X<\/span><\/p><p style=\"text-align: left;\"><span style=\"font-size: 16px; font-family: 宋体;\">顺德中队&nbsp;&nbsp;城市主战车&nbsp;&nbsp;&nbsp;&nbsp; WJ粤·8259X<\/span><\/p><p style=\"text-align: left;\"><span style=\"font-size: 16px; font-family: 宋体;\">顺德中队&nbsp;&nbsp;水罐车&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; WJ粤·7808X<\/span><\/p><p style=\"text-align: left;\"><span style=\"font-size: 16px; font-family: 宋体;\">&nbsp;<\/span><\/p><p style=\"text-align: left;\"><span style=\"font-size: 16px; font-family: 宋体;\">各中队车辆迅速赶赴现场。<\/span><\/p><p><br  /><\/p>","content_source_url":"","thumb_media_id":"1ynGkqcHXnv-QxW85rnqOe4QlAgW0AdC7LsfyZphId8","show_cover_pic":0,"url":"http://mp.weixin.qq.com/s?__biz=MzIxODgwMDY0OA==&mid=100000009&idx=1&sn=b92cd0cb812836f9761d32e8ab64285d&chksm=17e5b66e20923f786aa29d6691cc323792ba4de09832ad5a195648aa985e06a16609c3ec09d9#rd","thumb_url":"http://mmbiz.qpic.cn/mmbiz_png/0MiaQYvt6ehAeN2F1gBekN9shHyEN8Mh4vgnNCRtPiaQhJlq5FVQCJqZLMFKpsKbuSXBazvpGrmDWITvEBFCLWibg/0?wx_fmt=png"}],"create_time":1489678475,"update_time":1489679073}
         * update_time : 1489679073
         */

        private String media_id;
        private ContentBean content;
        private int update_time;

        public String getMedia_id() {
            return media_id;
        }

        public void setMedia_id(String media_id) {
            this.media_id = media_id;
        }

        public ContentBean getContent() {
            return content;
        }

        public void setContent(ContentBean content) {
            this.content = content;
        }

        public int getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(int update_time) {
            this.update_time = update_time;
        }

        public static class ContentBean {
            /**
             * news_item : [{"title":"车辆调派\u2014华南师范大学实验楼","author":"消防物联云平台","digest":"华南师范大学实验楼发生火灾，情况紧急，火势严重\n现调派车辆前去增援：\n三水中队  压缩空气泡沫车     WJ粤\u20228122X\n三水中队  水罐泡沫车18吨    WJ粤\u20228123X","content":"<p style=\"text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;\"><strong><span style=\"font-size: 19px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);\">华南师范大学实验楼发生火灾<\/span><\/strong><\/p><p><img data-s=\"300,640\" data-type=\"png\" data-src=\"http://mmbiz.qpic.cn/mmbiz_png/0MiaQYvt6ehAeN2F1gBekN9shHyEN8Mh4vgnNCRtPiaQhJlq5FVQCJqZLMFKpsKbuSXBazvpGrmDWITvEBFCLWibg/0?wx_fmt=png\" data-ratio=\"0.553072625698324\" data-w=\"358\"  /><\/p><p><br  /><\/p><p style=\"text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;\"><span style=\"font-size: 15px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);\">建筑物性质 ： 实验楼<\/span><\/p><p style=\"text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;\"><span style=\"font-size: 15px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);\">华南师范大学南海校区<\/span><\/p><p style=\"text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;\"><span style=\"font-size: 15px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);\">0757-86687883 &nbsp;0757-86687222<\/span><\/p><p style=\"text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;\"><span style=\"font-size: 15px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);\">现调派以下车辆前往救援：<\/span><\/p><p style=\"text-align: left;\"><span style=\"font-size: 16px; font-family: 宋体;\">三水中队&nbsp;&nbsp;压缩空气泡沫车&nbsp;&nbsp; WJ粤·8122X<\/span><\/p><p style=\"text-align: left;\"><span style=\"font-size: 16px; font-family: 宋体;\">三水中队&nbsp;&nbsp;水罐泡沫车18吨&nbsp;&nbsp; WJ粤·8123X<\/span><\/p><p style=\"text-align: left;\"><span style=\"font-size: 16px; font-family: 宋体;\">顺德中队&nbsp;&nbsp;城市主战车&nbsp;&nbsp;&nbsp;&nbsp; WJ粤·8259X<\/span><\/p><p style=\"text-align: left;\"><span style=\"font-size: 16px; font-family: 宋体;\">顺德中队&nbsp;&nbsp;水罐车&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; WJ粤·7808X<\/span><\/p><p style=\"text-align: left;\"><span style=\"font-size: 16px; font-family: 宋体;\">&nbsp;<\/span><\/p><p style=\"text-align: left;\"><span style=\"font-size: 16px; font-family: 宋体;\">各中队车辆迅速赶赴现场。<\/span><\/p><p><br  /><\/p>","content_source_url":"","thumb_media_id":"1ynGkqcHXnv-QxW85rnqOe4QlAgW0AdC7LsfyZphId8","show_cover_pic":0,"url":"http://mp.weixin.qq.com/s?__biz=MzIxODgwMDY0OA==&mid=100000009&idx=1&sn=b92cd0cb812836f9761d32e8ab64285d&chksm=17e5b66e20923f786aa29d6691cc323792ba4de09832ad5a195648aa985e06a16609c3ec09d9#rd","thumb_url":"http://mmbiz.qpic.cn/mmbiz_png/0MiaQYvt6ehAeN2F1gBekN9shHyEN8Mh4vgnNCRtPiaQhJlq5FVQCJqZLMFKpsKbuSXBazvpGrmDWITvEBFCLWibg/0?wx_fmt=png"}]
             * create_time : 1489678475
             * update_time : 1489679073
             */

            private int create_time;
            private int update_time;
            private List<NewsItemBean> news_item;

            public int getCreate_time() {
                return create_time;
            }

            public void setCreate_time(int create_time) {
                this.create_time = create_time;
            }

            public int getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(int update_time) {
                this.update_time = update_time;
            }

            public List<NewsItemBean> getNews_item() {
                return news_item;
            }

            public void setNews_item(List<NewsItemBean> news_item) {
                this.news_item = news_item;
            }

            public static class NewsItemBean {
                /**
                 * title : 车辆调派—华南师范大学实验楼
                 * author : 消防物联云平台
                 * digest : 华南师范大学实验楼发生火灾，情况紧急，火势严重
                 现调派车辆前去增援：
                 三水中队  压缩空气泡沫车     WJ粤•8122X
                 三水中队  水罐泡沫车18吨    WJ粤•8123X
                 * content : <p style="text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;"><strong><span style="font-size: 19px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);">华南师范大学实验楼发生火灾</span></strong></p><p><img data-s="300,640" data-type="png" data-src="http://mmbiz.qpic.cn/mmbiz_png/0MiaQYvt6ehAeN2F1gBekN9shHyEN8Mh4vgnNCRtPiaQhJlq5FVQCJqZLMFKpsKbuSXBazvpGrmDWITvEBFCLWibg/0?wx_fmt=png" data-ratio="0.553072625698324" data-w="358"  /></p><p><br  /></p><p style="text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;"><span style="font-size: 15px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);">建筑物性质 ： 实验楼</span></p><p style="text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;"><span style="font-size: 15px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);">华南师范大学南海校区</span></p><p style="text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;"><span style="font-size: 15px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);">0757-86687883 &nbsp;0757-86687222</span></p><p style="text-align: left; line-height: 25px; background: white none repeat scroll 0% 0%;"><span style="font-size: 15px; font-family: 微软雅黑,sans-serif; color: rgb(62, 62, 62);">现调派以下车辆前往救援：</span></p><p style="text-align: left;"><span style="font-size: 16px; font-family: 宋体;">三水中队&nbsp;&nbsp;压缩空气泡沫车&nbsp;&nbsp; WJ粤·8122X</span></p><p style="text-align: left;"><span style="font-size: 16px; font-family: 宋体;">三水中队&nbsp;&nbsp;水罐泡沫车18吨&nbsp;&nbsp; WJ粤·8123X</span></p><p style="text-align: left;"><span style="font-size: 16px; font-family: 宋体;">顺德中队&nbsp;&nbsp;城市主战车&nbsp;&nbsp;&nbsp;&nbsp; WJ粤·8259X</span></p><p style="text-align: left;"><span style="font-size: 16px; font-family: 宋体;">顺德中队&nbsp;&nbsp;水罐车&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; WJ粤·7808X</span></p><p style="text-align: left;"><span style="font-size: 16px; font-family: 宋体;">&nbsp;</span></p><p style="text-align: left;"><span style="font-size: 16px; font-family: 宋体;">各中队车辆迅速赶赴现场。</span></p><p><br  /></p>
                 * content_source_url :
                 * thumb_media_id : 1ynGkqcHXnv-QxW85rnqOe4QlAgW0AdC7LsfyZphId8
                 * show_cover_pic : 0
                 * url : http://mp.weixin.qq.com/s?__biz=MzIxODgwMDY0OA==&mid=100000009&idx=1&sn=b92cd0cb812836f9761d32e8ab64285d&chksm=17e5b66e20923f786aa29d6691cc323792ba4de09832ad5a195648aa985e06a16609c3ec09d9#rd
                 * thumb_url : http://mmbiz.qpic.cn/mmbiz_png/0MiaQYvt6ehAeN2F1gBekN9shHyEN8Mh4vgnNCRtPiaQhJlq5FVQCJqZLMFKpsKbuSXBazvpGrmDWITvEBFCLWibg/0?wx_fmt=png
                 */

                private String title;
                private String author;
                private String digest;
                private String content;
                private String content_source_url;
                private String thumb_media_id;
                private int show_cover_pic;
                private String url;
                private String thumb_url;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }

                public String getDigest() {
                    return digest;
                }

                public void setDigest(String digest) {
                    this.digest = digest;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getContent_source_url() {
                    return content_source_url;
                }

                public void setContent_source_url(String content_source_url) {
                    this.content_source_url = content_source_url;
                }

                public String getThumb_media_id() {
                    return thumb_media_id;
                }

                public void setThumb_media_id(String thumb_media_id) {
                    this.thumb_media_id = thumb_media_id;
                }

                public int getShow_cover_pic() {
                    return show_cover_pic;
                }

                public void setShow_cover_pic(int show_cover_pic) {
                    this.show_cover_pic = show_cover_pic;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getThumb_url() {
                    return thumb_url;
                }

                public void setThumb_url(String thumb_url) {
                    this.thumb_url = thumb_url;
                }
            }
        }
    }
}
