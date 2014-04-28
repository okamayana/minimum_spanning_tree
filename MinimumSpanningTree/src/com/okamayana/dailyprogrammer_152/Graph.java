package com.okamayana.dailyprogrammer_152;

import java.util.List;

import com.okamayana.dailyprogrammer_152.util.IOUtil;

public class Graph {
	
	private List<Integer> vertices;
	private int[][] adjacency;
	
	public Graph(List<Integer> vertices, int[][] adjacency) {
		this.vertices = vertices;
		this.adjacency = adjacency;
	}
	
	public List<Integer> getVertices() {
		return vertices;
	}
	
	public int[][] getAdjacency() {
		return adjacency;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		int[][] adjacency = this.adjacency;
		int sum = 0;
		
		for (int i = 0; i < adjacency.length; i++) {
			for (int j = 0; j < adjacency.length; j++) {
				int edge = adjacency[i][j];
				
				if (j > i && adjacency[i][j] > 0) {
					sum += edge;
					builder.append(IOUtil.convertAsciiToString(i)
						+ IOUtil.convertAsciiToString(j) + ", ");
				}
			}
		}
		
		builder.insert(0, String.format("%d\n", sum));
		builder.setLength(builder.length()-2);
		
		return builder.toString();
	}
}
