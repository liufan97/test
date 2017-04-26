# 1.HashMap和Hashtable区别

    Hashtable  线程安全	不准使用null 
    
    HashMap   线程不安全，性能比Hashtable高一点
    
    如果有多条线程访问同一个Map对象时，使用Hashtable实现类会更好
  
# 2.ArrayList和LinkedList区别
  
    ArrayList  ：  ArrayList是实现了基于动态数组的数据结构
    LinkedList： 基于链表的数据结构
     
    对于随机访问get和set，ArrayList觉得优于LinkedList，因为LinkedList要移动指针。
     
    对于新增和删除操作add和remove，LinedList比较占优势，因为ArrayList要移动数据
    
    
# 3.遍历HashMap的两种方式

    (1) Map map = new HashMap();
    
        Iterator it = map.entrySet().iterator();//entrySet() 返回key所有key-value对组成的Set集合
        
        while(it.hasNext()){
        
            Map.Entry en = (Map.Entry)it.next();
            
            Object key = entry.getKey();
            
            Object val = entry.getValue();
            
        }


    （2）Map map = new HashMap();
      
         Iterator it = map.keySet().iterator();//keySet() 返回该Map里所有的Set集合
         
         while(it.hasNext()){
         
            Object key = it.next();
            
            Object val = map.get(key);//get(key);返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
            
         }

