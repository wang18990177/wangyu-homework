package com.example.homework007.bean;

import com.example.homework007.R;

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
            "OPPO Ace 2","Vivo x50 Pro", "XiaoMi 10","HUAWEI Mate40 Pro", "HUAWEI P40","HUAWEI nova 7 Pro"
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
            "华为 HUAWEI P40 麒麟990 5G SoC芯片 5000万超感知徕卡三摄 30倍数字变焦 ",
            "华为 HUAWEI nova 7 Pro 3200万追焦双摄 50倍潜望式变焦四摄 5G SOC芯片 ",

    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {5299, 8499, 9399, 6499, 4599, 5399,4478,5478,6958,4699};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.appleipadpro4_s,R.drawable.iphone12_s,R.drawable.iphone12pro_s,R.drawable.dell_s,R.drawable.oppoace2_s,
            R.drawable.vivox50pro_s,R.drawable.xiaomi10_s,R.drawable.huaweimate40pro_s,R.drawable.huaweip40_s,
            R.drawable.huaweinova7pro_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.appleipadpro4,R.drawable.iphone12,R.drawable.iphone12pro,R.drawable.dell,R.drawable.oppoace2,
            R.drawable.vivox50pro,R.drawable.xiaomi10,R.drawable.huaweimate40pro,R.drawable.huaweip40,
            R.drawable.huaweinova7pro

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
