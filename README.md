# 🎓 Student Record Management System

A menu-driven **Java console application** for managing students and their subject results, with data persisted to a local text file.

![Java](https://img.shields.io/badge/Java-SE-orange) ![Type](https://img.shields.io/badge/type-CLI-blue)

## Features

- Add and delete students (ID, name, age)
- Assign subject-wise marks to each student
- View all student records
- Sort students by performance
- Find the class topper
- Persistent storage: data is saved to and loaded from `students.txt`

## Demo

```text
===== Student Record Manager =====
1. Add Student
2. Add Result
3. View Students
4. Sort by Performance
5. Find Topper
6. Delete Student
7. Save & Exit
Enter choice:
```

(Replace with a real screenshot or terminal output from your app.)

## Design

| Class | Responsibility |
|---|---|
| `Main` | Menu-driven CLI and user input handling |
| `StudentManager` | Business logic: add/delete/view/sort/topper; load and save to file |
| `Student` | Holds name, age and a list of `Result` objects |
| `Result` | One subject and its marks |

**Concepts demonstrated:** OOP and encapsulation, `Map<Integer, Student>` for O(1) lookup by ID, `List` and comparator-based sorting, file I/O for persistence, separation of UI and logic.

## Project structure

```text
src/
  record/
    Main.java
    StudentManager.java
    Student.java
    Result.java
bin/            compiled output
students.txt    saved data (created at runtime)
```

## Run it

Requires JDK 8+.

```bash
git clone https://github.com/<you>/<repo>
cd <repo>
javac -d bin $(find src -name "*.java")
java -cp bin record.Main
```

Run from the project root so `students.txt` is read and written correctly.

## Data format

Records are stored in `students.txt`, one student per line. (Add one example line that matches your actual format.)

## Possible improvements

- Edit/update marks after creation
- Input validation (marks range, duplicate IDs)
- Replace the text file with SQLite/JDBC
- Add JUnit tests and a Maven/Gradle build
- GUI version (JavaFX/Swing)

## Author

**Shiva Kumara N** · CSE, VVCE Mysuru · [LinkedIn](#) · [GitHub](#)
