package WorkShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StudentMarksReport {
    public static void main(String[] args) {
        Student student1 = new Student("Nobita", new ArrayList<>(Arrays.asList(48, 52, 44, 75, 65)));
        Student student2 = new Student("Shizuka", new ArrayList<>(Arrays.asList(81, 92, 84, 78, 95)));
        Student student3 = new Student("Dekisugi", new ArrayList<>(Arrays.asList(93, 97, 95, 98, 93)));
        Student student4 = new Student("Giyan", new ArrayList<>(Arrays.asList(62, 45, 49, 55, 75)));
        Student student5 = new Student("Sunio", new ArrayList<>(Arrays.asList(75, 62, 74, 67, 65)));
        Student student6 = new Student("Kenichi", new ArrayList<>(Arrays.asList(61, 52, 64, 75, 55)));
        Student student7 = new Student("Umiko", new ArrayList<>(Arrays.asList(81, 88, 85, 75, 79)));
        Student student8 = new Student("Kiteretsu", new ArrayList<>(Arrays.asList(97, 98, 97, 96, 98)));
        Student student9 = new Student("Shinchan", new ArrayList<>(Arrays.asList(42, 45, 50, 75, 54)));
        Student student10 = new Student("Ash", new ArrayList<>(Arrays.asList(57, 78, 65, 70, 55)));
        Student.calculateAverageMarks();
        Student.topPerformers(3);
    }
}
class Pair{
    String name;
    Integer marks;
    public Pair(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }
    public int compareTo(Pair p) {
        if(!this.marks.equals(p.marks)) {
            return this.marks.compareTo(p.marks);
        }
        else{
            return this.name.compareTo(p.name);
        }
    }
}
class Student{
    private String Name;
    private List<Integer> marks;
    private static HashMap<String,List<Integer>> map = new HashMap<>();
    private static HashMap<String,Integer> averageMap = new HashMap<>();
    private static ArrayList<Pair> StudentList = new ArrayList<>();

    Student(String Name,List<Integer> marks){
        this.Name = Name;
        this.marks = marks;
        map.put(Name,marks);
        int sum = 0;
        for(int i=0;i<marks.size();i++){
            sum+=marks.get(i);
        }
        averageMap.put(this.Name,sum/this.marks.size());
        StudentList.add(new Pair(this.Name,averageMap.get(Name)));
    }

    public void addMark(int mark){
        int average = ((averageMap.get(this.Name)*marks.size())+mark)/(marks.size()+1);
        marks.add(mark);
        averageMap.put(Name,average);
        StudentList.add(new Pair(this.Name,average));
    }

    public static void calculateAverageMarks(){
        int totalAverageMarks = 0;
        int totalStudent = 0;
        for(String key:averageMap.keySet()){
            totalStudent++;
            totalAverageMarks += averageMap.get(key);
        }
        System.out.println("Average marks of Student : " + totalAverageMarks / (totalStudent));
    }

    public static void topPerformers(int n){
        List<Pair> tempList = new ArrayList<>(StudentList);
        for(int i = 0; i < tempList.size()-1; i++){
            for(int j = i + 1; j < tempList.size(); j++){
                if(tempList.get(i).compareTo(tempList.get(j))<0){
                    Pair temp = tempList.get(i);
                    tempList.set(i, tempList.get(j));
                    tempList.set(j, temp);
                }
            }
        }
        System.out.println(n+" Top Performer Student of the class are :");
        for(int i = 0;i<n;i++){
            System.out.println("Rank "+(i+1)+" Student Name "+tempList.get(i).name+" With Overall Marks "+map.get(tempList.get(i).name).toString()+" Average Marks "+tempList.get(i).marks);
        }
    }

}