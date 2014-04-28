package com.okamayana.dailyprogrammer_152;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.okamayana.dailyprogrammer_152.util.CollectionsUtil;
import com.okamayana.dailyprogrammer_152.util.IOUtil;

public class MinimumSpanningTree {

	public static String FILENAME = "input.txt";

	public static Graph construct(Graph graph) {
		List<Integer> vertices = graph.getVertices();
		int[][] adjacency = graph.getAdjacency();

		List<Integer> newVertices = new ArrayList<Integer>();
		int[][] newAdjacency = new int[vertices.size()][vertices.size()];

		newVertices.add(0);

		while (!CollectionsUtil.compare(newVertices, vertices)) {
			int size = newVertices.size();
			int minEdge = 0;
			int minVertex1 = -1;
			int minVertex2 = -1;

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < vertices.size(); j++) {
					int edge = adjacency[newVertices.get(i)][j];

					if (edge != -1) {
						if ((minEdge == 0 || edge < minEdge)
								&& !newVertices.contains(j)) {
							minEdge = edge;
							minVertex1 = newVertices.get(i);
							minVertex2 = j;
						}
					}
				}
			}

			if (minVertex1 != -1 && minVertex2 != -1) {
				newVertices.add(minVertex2);
				newAdjacency[minVertex1][minVertex2] = adjacency[minVertex1][minVertex2];
				newAdjacency[minVertex2][minVertex1] = adjacency[minVertex2][minVertex1];
			}
		}

		return new Graph(newVertices, newAdjacency);
	}

	public static void main(String[] args) {
		Graph graph = IOUtil.buildGraph(new File(FILENAME));
		Graph minimumSpanningTree = construct(graph);
		
		System.out.println(graph);
		System.out.println();
		System.out.println(minimumSpanningTree);
	}

}
