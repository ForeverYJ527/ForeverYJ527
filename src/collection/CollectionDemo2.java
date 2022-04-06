package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * contains:包含
 * remove:删除
 *
 * 集合的某些操作会受元素equals方法影响。比如contains()和remove()
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(9,0));
        c.add(new Point(1,2));
        /*
            集合重写了toString方法。格式为:
            [元素1.toString(), 元素2.toString(), 元素3.toString(), ....]
         */
        System.out.println(c);

        Point p = new Point(1,2);
        System.out.println("p:"+p);
        /*
            boolean contains(Object o)
            判断当前集合是否包含给定元素。判断依据是该元素是否与集合现有元素存在equals
            方法比较为true的情况，存在则认为包含。
         */
        boolean contains = c.contains(p);
        System.out.println("包含:"+contains);

        /*
            删除元素也是删除与给定元素equals比较为true的元素
            对于List而言，重复元素只会删除一次。
         */
        c.remove(p);
        System.out.println(c);
    }
}
