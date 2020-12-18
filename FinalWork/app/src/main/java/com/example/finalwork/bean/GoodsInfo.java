package com.example.finalwork.bean;


import com.example.finalwork.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "Apple ipad Pro 4","Apple iphone 12", "Apple iphone 12 Pro",  "Dell",
            "OPPO Ace 2","Vivo x50 Pro", "XiaoMi 10","HUAWEI Mate40 Pro", "HUAWEI nova 7 Pro",
            "HUAWEI P40 5G", "HUAWEI FreeBuds Pro", "HUAWEI nova 8 SE", "HUAWEI MatePad Pro",
            "HUAWEI Mate 30E Pro", "HUAWEI WATCH GT 2","HUAWEI P40 Pro","HUAWEI FreeBuds Studio",
            "HUAWEI WATCH GT 2 Pro","华为智慧屏V55i-B",
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Apple ipad Pro 4 12.9寸 银色 正品全新国行美版",
            "Apple iPhone 12 (A2404) 64GB 蓝色 支持移动联通电信5G 双卡双待手机",
            "Apple iPhone 12 Pro (A2408) 128GB 海蓝色 支持移动联通电信5G 双卡双待手机",
            "Dell 灵越 5000轻薄本 10代酷睿i5-1035G1 学生笔记本电脑",
            "OPPO Ace 2 高通骁龙865 双模5G全网通 魅力蓝 65W超闪 全面屏游戏智能",
            "Vivo x50 Pro 双模5G 金色 智能手机官方旗舰店正品首发",
            "XiaoMi 10 5G 64GB 优雅红 旗舰店正品首发 双卡双待手机",
            "华为 HUAWEI Mate 40 Pro 麒麟9000 SoC芯片 超感知徕卡电影影像 ",
            "华为 HUAWEI nova 7 Pro 3200万追焦双摄 50倍潜望式变焦四摄 5G SOC芯片 ",
            "HUAWEI P40 5G 全网通 8GB+128GB（零度白）麒麟990 5G SoC芯片 5000万超感知徕卡三摄 30倍数字变焦 全网通5G手机",
            "【新品】HUAWEI FreeBuds Pro 真无线耳机 有线充版（冰霜银）",
            "HUAWEI nova 8 SE 5G全网通 8GB+128GB 高配版（天玑800U）银月星辉",
            "HUAWEI MatePad Pro 10.8英寸华为智能平板电脑 8GB+256GB 全网通（夜阑灰）绚丽全面屏学生平板 麒麟990芯片 手机平板多屏协同 轻办公平板电脑",
            "HUAWEI Mate 30E Pro 5G 全网通 8GB+128GB（星河银）",
            "【最长2周续航】HUAWEI WATCH GT 2 运动款 曜石黑（46mm）华为智能手表 麒麟A1芯片 强劲续航 专业运动 心脏健康 蓝牙通话 音乐播放 户外运动手表",
            "HUAWEI P40 Pro 5G 全网通 8GB+128GB（零度白）",
            "【新品上市】HUAWEI FreeBuds Studio 无线头戴耳机 智慧动态降噪 宽频高解析音质 全场景智慧交互 曜石黑",
            "【新品上市】HUAWEI WATCH GT 2 Pro 时尚款 星云灰（46mm）两周长续航华为智能手表 蓝宝石镜面 钛合金表体 精密陶瓷后壳 蓝牙通话 专业户外运动",
            "【新品】华为智慧屏V55i-B 55英寸 4K超高清全面屏 多方视频通话 AI升降式摄像头 4GB+32GB 银钻灰",
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6999,5963,4569,2698,3654,6987,5634,2365,3654,4563,4488, 1099, 2699, 4499, 5299, 1388,5988,1999,2388,3899};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.appleipadpro4_s,R.drawable.iphone12_s,R.drawable.iphone12pro_s,R.drawable.dell_s,R.drawable.oppoace2_s,
            R.drawable.vivox50pro_s,R.drawable.xiaomi10_s,R.drawable.huaweimate40pro_s,
            R.drawable.huaweinova7pro_s,
            R.drawable.huaweip40_s, R.drawable.huaweifreebudspro_s, R.drawable.huaweinova8se_s, R.drawable.huaweimatepadpro_s,
            R.drawable.huaweimate30epro_s, R.drawable.huaweiwatchgt2_s, R.drawable.huaweip40pro_s,R.drawable.huaweifreebudsstudio_s,
            R.drawable.huaweiwatchgt2pro_s, R.drawable.v55ib_s,
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.appleipadpro4,R.drawable.iphone12,R.drawable.iphone12pro,R.drawable.dell,R.drawable.oppoace2,
            R.drawable.vivox50pro,R.drawable.xiaomi10,R.drawable.huaweimate40pro,
            R.drawable.huaweinova7pro,
            R.drawable.huaweip40, R.drawable.huaweifreebudspro, R.drawable.huaweinova8se, R.drawable.huaweimatepadpro,
            R.drawable.huaweimate30epro, R.drawable.huaweiwatchgt2,R.drawable.huaweip40pro,R.drawable.huaweifreebudsstudio,
            R.drawable.huaweiwatchgt2pro,R.drawable.v55ib,
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}

