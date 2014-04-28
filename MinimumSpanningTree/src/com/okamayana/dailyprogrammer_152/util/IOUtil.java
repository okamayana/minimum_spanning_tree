package com.okamayana.dailyprogrammer_152.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.okamayana.dailyprogrammer_152.Graph;

public class IOUtil {
	
	public static String convertAsciiToString(final int ascii) {
		return Character.toString((char) (65+ascii));
	}
	
	public static Graph buildGraph(final File file) {
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			
			final int verticesCount = scanner.nextInt();
			scanner.nextLine();
			
			final List<Integer> vertices = new ArrayList<Integer>();
			final int[][] adjacency = new int[verticesCount][verticesCount];
		
			for (int i = 0; i < verticesCount; i++) {
				vertices.add(i);
				final String[] row = scanner.nextLine().replaceAll("\\s","").split(",");
			
				for (int j = 0; j < verticesCount; j++) {
					final int distance = Integer.parseInt(row[j]);
					adjacency[i][j] = distance;
				}
			}
			
			scanner.close();
			return new Graph(vertices, adjacency);
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
