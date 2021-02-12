package com.jizhi.stringfog;

import com.github.megatronking.stringfog.IStringFog;

import org.magiclen.magiccrypt.MagicCrypt;

/**
 * 自定义算法实现，此文件存储目录路径须和其包名一致
 * <p>
 * author : JiZhi
 * date   : 2021/2/12 14:55
 */
public class CustomStringFogImpl implements IStringFog {

    static {
        System.loadLibrary("rust");
    }

    public native String decrypt(String data);

    @Override
    public String encrypt(String data, String key) {
        return "";
    }

    @Override
    public String decrypt(String data, String key) {
        return decrypt(data);
    }

    @Override
    public boolean overflow(String data, String key) {
        return false;
    }
}
