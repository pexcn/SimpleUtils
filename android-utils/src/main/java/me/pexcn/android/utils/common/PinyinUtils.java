package me.pexcn.android.utils.common;

import com.android.providers.contacts.HanziToPinyin;

import java.util.ArrayList;

/**
 * Created by pexcn on 2017-04-04.
 */
@SuppressWarnings("unused")
public class PinyinUtils {
    private PinyinUtils() {
    }

    /**
     * 获取汉字拼音的字符串形式
     *
     * @param chinese 汉字的字符串形式
     * @return 拼音的字符串形式
     */
    public static String getPinyin(String chinese) {
        final ArrayList<HanziToPinyin.Token> tokens = HanziToPinyin.getInstance().get(chinese);
        final StringBuilder sb = new StringBuilder();
        for (HanziToPinyin.Token token : tokens) {
            sb.append(token.target);
        }
        return sb.toString();
    }
}
