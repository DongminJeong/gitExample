package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	static void print(Map map) {
		ArrayList<Student> list2 = (ArrayList<Student>)map.get("list");
		for(Student s : list2) {
			System.out.println(s.getNum() + "\t" +  s.getName() + "\t" + s.getMajor() + "\t" + s.getYear() + "\t" + s.getProfessor());
		}
	}
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		List<Student> list = new ArrayList<>();
		list.add(new Student("2022001", "kim", "영어", 1, "park"));
		list.add(new Student("2022002", "choi", "전산", 2, "hong"));
		list.add(new Student("2022003", "lee", "경영", 3, "kim"));
		map.put("list", list);
		print(map);
	}
}
