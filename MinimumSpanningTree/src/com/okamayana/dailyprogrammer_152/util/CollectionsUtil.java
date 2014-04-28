package com.okamayana.dailyprogrammer_152.util;

import java.util.List;

public class CollectionsUtil {

	public static boolean compare(List<Integer> a, List<Integer> set2) {
		if (a.size() != set2.size()) {
			return false;
		}
		
		return a.containsAll(set2);
	}
}
