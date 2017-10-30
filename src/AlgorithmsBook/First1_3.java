package AlgorithmsBook;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Test;

public class First1_3 {
	public class ResizingArrayQueueOfStrings {
		private int first;
		private int last;
		private int count;
		private String[] queue;

		public ResizingArrayQueueOfStrings() {
			first = 0;
			last = 0;
			count = 1;
			queue = new String[count];
		}

		public boolean isEmpty() {
			return first == last;
		}

		public int size() {
			return last - first;
		}

		public void enqueue(String s) {
			if (last == count) {
				resizing(2 * size());
			}
			queue[last++] = s;
		}

		public String dequeue() {
			if (size() < count / 4) {
				resizing(2 * size());
			}
			return queue[first++];

		}

		private void resizing(int n) {
			String[] tmp = new String[n];
			int j = 0;
			for (int i = first; i < last; i++) {
				tmp[j++] = queue[i];
			}
			queue = tmp;
			count = n;
			last = last - first;
			first = 0;
		}
	}

	@Test
	public void zl14() {
		ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings();
		queue.enqueue("a");
		System.out.println("size(): " + queue.size() + " | count: " + queue.count);
		queue.enqueue("b");
		System.out.println("size(): " + queue.size() + " | count: " + queue.count);
		queue.enqueue("c");
		System.out.println("size(): " + queue.size() + " | count: " + queue.count);
		queue.enqueue("d");
		System.out.println("size(): " + queue.size() + " | count: " + queue.count);
		queue.enqueue("e");
		System.out.println("size(): " + queue.size() + " | count: " + queue.count);
		queue.enqueue("f");
		System.out.println("size(): " + queue.size() + " | count: " + queue.count);
		queue.enqueue("g");
		while (!queue.isEmpty()) {
			System.out.println(queue.dequeue() + " | size(): " + queue.size() + " | count: " + queue.count);
		}
	}

	class Node {
		int item;
		Node next;
	}

	Node first;

	@Test
	public void zl19() {
		Node current = first;
		if (first == null)
			return;

		Node next = current.next;
		if (next == null)
			first = null;

		while (next.next != null) {
			current = next;
			next = next.next;
		}
		current.next = null;
	}

	public static boolean find(LinkedList<String> l, String i) {
		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			if (it.next().equals(i)) {
				return true;
			}
		}
		return false;
	}

	@Test
	public void zl21() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("B");
		ll.add("c");
		ll.add("D");
		ll.add("e");

		System.out.println("find\"a\": " + find(ll, "a"));
		System.out.println("find\"B\": " + find(ll, "B"));
		System.out.println("find\"c\": " + find(ll, "c"));
		System.out.println("find\"F\": " + find(ll, "F"));
	}

}
