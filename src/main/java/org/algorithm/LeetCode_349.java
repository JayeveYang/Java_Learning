//https://leetcode.cn/problems/intersection-of-two-arrays/

package org.algorithm;

import java.util.HashSet;

public class LeetCode_349 {
    /*
    * 给定两个数组 nums1 和 nums2 ，返回 它们的交集
    * 输出结果中的每个元素一定是唯一的。我们可以不考虑输出结果的顺序
    * */
    public int[] intersection(int[] nums1, int[] nums2) {
        //获得第一个数组的不重复序列
        HashSet<Integer> table = new HashSet<>();
        //存放重复序列
        HashSet<Integer> res = new HashSet<>();
        for(int num:nums1){
            table.add(num);
        }
        for(int num:nums2){
            if(table.contains(num)){
                res.add(num);
            }
        }
        int i = 0;
        //初始化一个和Set一样大的int数组用来保存结果
        int[] result = new int[res.size()];
        for(int num : res){
            result[i] = num;
            i++;
        }
        return result;
    }
}
