# Teacher and Student Management System

## Description
The **Teacher and Student Management System** is a Java application designed to manage teachers and students in an educational institution. The system allows registering up to 10 teachers, assigning students to them, and tracking the total number of assigned students.

## Features
- Register a system with a name and creation date.
- Add teachers with:
  - Name (mandatory).
  - Unique identification number (mandatory).
  - Subject taught.
- Assign students to an existing teacher with:
  - Student ID (unique identifier).
  - Student name (mandatory).
  - Grade or course.
- Student assignment control:
  - Each teacher can have a maximum of 10 students.
  - If an attempt is made to assign a student to a non-existent teacher, an error is generated.
- Calculate the total number of students assigned to all teachers.
- Load data from a JSON file.
- Save results to a new JSON file.
- Display results on the screen.

## Technologies Used
- **Java** (Main programming language)
- **JSON** (For data storage and retrieval)

## Installation and Execution

**Note:** To use the system, you must remove the pre-included Gson JAR file and replace it with your own version. Make sure to download a compatible Gson JAR from a reliable source and add it to your project's classpath.

1. Clone the repository:
   ```sh
   git clone <REPOSITORY_URL>
   ```
2. Compile the project:
   ```sh
   javac -d bin src/*.java
   ```
3. Run the program:
   ```sh
   java -cp bin Main
   ```

## System Usage
1. **Add teachers**: Enter the name, identification number, and the subject taught.
2. **Register students under a teacher**: Provide the student ID, name, and grade.
3. **Display the total number of assigned students**.
4. **Load and save data in JSON format**.


