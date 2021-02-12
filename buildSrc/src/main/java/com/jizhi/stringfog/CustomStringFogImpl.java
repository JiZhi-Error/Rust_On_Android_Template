package com.jizhi.stringfog;

import com.github.megatronking.stringfog.IStringFog;

import org.magiclen.magiccrypt.MagicCrypt;

/**
 * 自定义算法实现，此文件存储目录路径须和其包名一致
 *
 * author : JiZhi
 * date   : 2021/2/12 14:55
 */
public class CustomStringFogImpl implements IStringFog {
    @Override
    public String encrypt(String data, String key) {
        return new MagicCrypt("@rWgKBNYL7RO8Nh3vksASXK10##5DC8R", 256).encrypt(data);
    }

    @Override
    public String decrypt(String data, String key) {
        return new MagicCrypt("@rWgKBNYL7RO8Nh3vksASXK10##5DC8R", 256).decrypt(data);
    }

    @Override
    public boolean overflow(String data, String key) {
        return false;
    }
}
