package record;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private int age;
    private List<Result> results = new ArrayList<>();

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void addResult(Result r) {
        results.add(r);
    }

    public int getTotalMarks() {
        int total = 0;
        for (Result r : results) {
            total += r.getMarks();
        }
        return total;
    }

    function rotateclockwise(arr, k) {
        const n = arr.length;
        if (n === 0) return;
    
        k = k % n;
    
        // Reverse last k numbers
        reverse(arr, n - k, n - 1);
    
        // Reverse the first n-k terms
        reverse(arr, 0, n - k - 1);
    
        // Reverse the entire array
        reverse(arr, 0, n - 1);
    
        // No return — modifies arr in place
    }
    
    function reverse(arr, start, end) {
        while (start < end) {
            let temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    }
}