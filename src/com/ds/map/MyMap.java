package com.ds.map;

public interface MyMap {
	
	public boolean put(Object key, Object value);
    public Object get(Object key);
    public Object remove(Object key);
    public boolean containsKey(Object key);
    public boolean containsValue(Object value);
    public int size();
    public boolean isEmpty();
    // Bulk Operations
    //public void putAll(MyMap<? extends Object,? extends Object> t);
    //public void clear();

    // Collection Views
    //public Set<K> keySet();
    //public Collection<V> values();
    //public Set<Map.Entry<K,V>> entrySet();
    // Interface for entrySet elements
    /*public interface Entry {
        Object getKey();
        Object getValue();
        Object setValue(Object value);
    }*/

}
