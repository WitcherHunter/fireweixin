//package com.yeejoin.xml;
//
//import com.thoughtworks.xstream.XStream;
//import com.yeejoin.bean.Student;
//import org.junit.After;
//import org.junit.Before;
//
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//
///**
// * Created by Administrator on 2017/3/14.
// */
//public class XStreamTest {
//
//    private XStream xstream = null;
//    private ObjectOutputStream out = null;
//    private ObjectInputStream in = null;
//
//    private Student bean = null;
//
//    /**
//     * <b>function:</b>初始化资源准备
//     * @author hoojo
//     * @createDate Nov 27, 2010 12:16:28 PM
//     */
//    @Before
//    public void init() {
//        try {
//            xstream = new XStream();
//            //xstream = new XStream(new DomDriver()); // 需要xpp3 jar
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        bean = new Student();
//        bean.setAddress("china");
//        bean.setEmail("jack@email.com");
//        bean.setId(1);
//        bean.setName("jack");
//        Birthday day = new Birthday();
//        day.setBirthday("2010-11-22");
//        bean.setBirthday(day);
//    }
//
//    /**
//     * <b>function:</b>释放对象资源
//     * @author hoojo
//     * @createDate Nov 27, 2010 12:16:38 PM
//     */
//    @After
//    public void destory() {
//        xstream = null;
//        bean = null;
//        try {
//            if (out != null) {
//                out.flush();
//                out.close();
//            }
//            if (in != null) {
//                in.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.gc();
//    }
//
//    public final void fail(String string) {
//        System.out.println(string);
//    }
//
//    public final void failRed(String string) {
//        System.err.println(string);
//    }
//}
