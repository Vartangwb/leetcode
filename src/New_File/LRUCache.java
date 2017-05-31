package New_File;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by twb on 2017/5/31.
 */
public class LRUCache {

    private int capacity;
    private Map<Integer, CacheEntry> maps;
    private int currSize;
    private CacheEntry first;
    private CacheEntry last;

    public LRUCache(int _capacity){
        this.capacity = _capacity;
        currSize = 0;
        maps = new HashMap<>();
        first = new CacheEntry(-1, -1);
        last = new CacheEntry(1, 1);
        first.next = last;
        last.pre = first;
    }

    public int get(int key){
        CacheEntry node = maps.get(key);
        if(node != null){
            moveToHead(node);
            return node.value;
        }else{
            return -1;
        }
    }

    public void set(int key, int value){
        if(maps.containsKey(key)){
            CacheEntry cEntry = maps.get(key);
            cEntry.value = value;
            moveToHead(cEntry);
        }else if(maps.size()<capacity){
            CacheEntry cacheEntry = new CacheEntry(key, value);
            moveToHead(cacheEntry);
            maps.put(key, cacheEntry);
        }else{
            CacheEntry cacheEntry = new CacheEntry(key, value);
            moveToHead(cacheEntry);
            maps.put(key, cacheEntry);
            int index = removeEnd();
            maps.remove(index);

        }
    }

    public int removeEnd(){
        CacheEntry cacheEntry = last.pre;
        last.pre.pre.next = last;
        last.pre = cacheEntry.pre;
        cacheEntry.pre = null;
        cacheEntry.next = null;
        return cacheEntry.key;
    }

    public void moveToHead(CacheEntry node){
        if(node.next!=null && node.pre!=null){
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        node.pre = first;
        node.next = first.next;
        first.next.pre = node;
        first.next = node;
    }


    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.set(1,1);
        lruCache.set(2,2);
        lruCache.set(3,3);
        System.out.println(lruCache.first.next.value);
        lruCache.get(2);
        System.out.println(lruCache.first.next.value);
    }
}

class CacheEntry{
    CacheEntry pre;
    CacheEntry next;
    int key;
    int value;

    public CacheEntry(int _key, int _value){
        key = _key;
        value = _value;
    }
}
