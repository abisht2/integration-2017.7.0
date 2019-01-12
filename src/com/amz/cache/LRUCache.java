package com.amz.cache;

import java.util.HashMap;

/**
 * @author Abhishek Bisht
 *
 */
public class LRUCache {

	int capacity;
	HashMap<Integer, NodeRef> map = new HashMap<Integer, NodeRef>();
	NodeRef head = null;
	NodeRef end = null;

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public void set(int key, int value) {

		if (map.containsKey(key)) {
			NodeRef old = map.get(key);
			old.value = value;
			remove(old);
			setHead(old);

		} else {
			NodeRef newOne = new NodeRef(key, value);
			if (map.size() >= capacity) {
				map.remove(end.key);
				remove(end);
				setHead(newOne);

			} else {
				setHead(newOne);
			}
			map.put(key, newOne);
		}

	}

	public int get(int key) {
		
		if (map.containsKey(key)) {
			NodeRef n = map.get(key);
			remove(n);
			setHead(n);
			return n.value;
		}
		
		return -1;
	}

	private void setHead(NodeRef old) {
		// TODO Auto-generated method stub
		old.pre = null;
		old.next = head;

		if (head != null)
			head.pre = old;

		head = old;

		if (end == null)
			end = head;

	}

	private void remove(NodeRef old) {
		// TODO Auto-generated method stub

		if (old.pre != null) {
			old.pre.next = old.next;
		} else {
			head = old.next;
		}

		if (old.next != null) {
			old.next.pre = old.pre;
		} else {
			end = old.pre;
		}

	}
}

class NodeRef {

	int key;
	int value;
	NodeRef pre;
	NodeRef next;

	public NodeRef(int key, int value) {
		this.key = key;
		this.value = value;
	}

}
