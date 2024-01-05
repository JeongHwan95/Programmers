package 프로그래머스레벨1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String collectionName = sc.nextLine();

		if (collectionName.equals("List")) {

			List<String> list = new ArrayList<>();
			for (int i = 0; i < 100; i++) {
				String line = sc.nextLine();
				if (line.equals("끝")) {
					list.add("끝");
					break;
				}
				list.add(line);
			}

			System.out.println("[ List 으로 저장된 " + list.get(0) + " ] ");
			for (int i = 1; i < 100; i++) {

				String line = list.get(i);
				if (line.equals("끝")) {
					break;
				} else {
					System.out.println(i + ". " + list.get(i));
				}
			}
		} // List part 끝

		else if (collectionName.equals("Set")) {
			String title = sc.nextLine();
			Set<String> set = new HashSet<>();
			for (int i = 0; i < 100; i++) {
				String line = sc.nextLine();
				if (line.equals("끝")) {
					break;
				}
				set.add(line);
			}

			Iterator<String> iterator = set.iterator();
			int i = 0;
			System.out.println("[ Set으로 지정된 " + title + " ]");
			while (iterator.hasNext()) {

				String line = iterator.next();
		

				System.out.println((i+1) + ". " + line);
				i++;

			}
		} // Set part 끝

		else if (collectionName.equals("Map")) {
			String title = sc.nextLine();
			Map<String, Integer> map = new HashMap<>();
			for (int i = 0; i < 100; i++) {

				String line = sc.nextLine();
				if (line.equals("끝"))
					break;

				map.put(line, i);
			} // for

			List<String> list = new ArrayList<>(map.keySet());
			System.out.println("[ Map으로 저장된 " + title + " ]");
			for (int i = 0; i < map.size(); i++) {

				System.out.println((i + 1) + ". " + list.get(i));
			}

		} // Map part 끝
		else {
			System.out.println("잘 못 입력하셨습니다. ");
		}

	}
}
