import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.Comparator;

/**
 * lambda表达式
 * @author Naozi
 * @date 2019/2/19
 */
public class Lambda20190219 {

    private static void sort(Integer[] list) {
        Comparator<Integer> comparator = (Integer n, Integer m) -> (n.compareTo(m));
        Arrays.sort(list, comparator);
    }

    public static void main(String[] argv){
        Integer[] list = new Integer[]{4,2,65,8,32,6};
        sort(list);
        System.out.println(JSON.toJSONString(list));
    }
}
