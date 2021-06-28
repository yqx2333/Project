package com.yqx.utils.listUtils;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    /**
     * 获取两个List的不同元素
     *
     * @param list1
     * @param list2
     * @return
     */
    private static List<Long> getDiffrent(List<Long> list1, List<Long> list2) {
        List<Long> diff = new ArrayList<Long>();
        for (Long str : list1) {
            if (!list2.contains(str)) {
                diff.add(str);
            }
        }
        return diff;
    }

}
