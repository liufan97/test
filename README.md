# test
1.HashMap和Hashtable区别

    Hashtable  线程安全	不准使用null 
    
    HashMap   线程不安全，性能比Hashtable高一点
    
    如果有多条线程访问同一个Map对象时，使用Hashtable实现类会更好
  
 2.ArrayList和LinkedList区别
  
    ArrayList  ：  ArrayList是实现了基于动态数组的数据结构
    LinkedList： 基于链表的数据结构
     
    对于随机访问get和set，ArrayList觉得优于LinkedList，因为LinkedList要移动指针。
     
    对于新增和删除操作add和remove，LinedList比较占优势，因为ArrayList要移动数据
    
    
#  遍历HashMap的两种方式
