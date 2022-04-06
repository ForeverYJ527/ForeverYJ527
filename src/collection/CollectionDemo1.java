package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合
 * java.util.Collection接口
 * 集合与数组一样，可以保存一组元素，并且对于元素的操作全部提供了对应的方法，使用便捷。
 * Collection是所有集合的顶级接口，里面规定了所有集合都应当具备的相关操作。
 * 其他有两个常见的子接口:
 * java.util.List:可重复集且有序。
 * java.util.Set:不可重复集
 * 重复指的是元素是否允许存放重复元素，重复的判定是根据元素自身的equals方法决定的。
 */
public class CollectionDemo1 {
    public static void main(String[] args) {

        Collection c = new ArrayList();
        /*
            boolean add(E e)
            向当前集合添加一个元素，元素成功添加后返回true。
         */
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        /*
            int size()
            返回当前集合的元素个数
         */
        int size = c.size();
        System.out.println("size:"+size);

        /*
            boolean isEmpty()
            判断当前集合是否为一个空集
         */
        boolean isEmpty = c.isEmpty();
        System.out.println("isEmpty:"+isEmpty);

        /*
            void clear()
            清空集合
         */
        c.clear();

        System.out.println(c);
        System.out.println("size:"+c.size());
        System.out.println("isEmpty:"+c.isEmpty());
    }
}
