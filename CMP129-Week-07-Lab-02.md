CMP 129 – Computer Science II
Week 7 – Lab 2: Mutable and Immutable Objects

Learning Objectives

After completing this lab, students should be able to:

- Explain the difference between mutable and immutable objects.
- Create a simple mutable Java class.
- Create a simple immutable Java class.
- Use private fields, constructors, getters, and setters appropriately.
- Use final fields in an immutable class.
- Recognize how a mutable object can be changed after creation.
- Recognize that an immutable object cannot be changed after creation.
- Test both designs using a separate test class.

Assignment Overview

In this lab, you will build and compare two small Java classes:

- MutableStudent
- ImmutableStudent

You will then create:

- StudentTest

The goal is to clearly demonstrate the difference between changing an existing object and creating an object whose data cannot be changed after construction.

Part 1: MutableStudent Class

Create:

MutableStudent.java

The class must contain these private attributes:

private String name;
private int age;

Constructor

Create a constructor that receives the student's name and age.

Required Methods

Create getter methods for both fields.

Create setter methods for both fields.

The setters should allow the state of the object to change after the object has been created.

Part 2: ImmutableStudent Class

Create:

ImmutableStudent.java

The class should be designed so that its objects cannot be changed after creation.

Requirements

- Declare the class final.
- Use private final fields for name and age.
- Initialize both fields in the constructor.
- Create getter methods for both fields.
- Do not create setter methods.

Part 3: StudentTest Class

Create:

StudentTest.java

The class must contain the main method.

Your program should demonstrate both designs.

Mutable Object Tests

- Create one MutableStudent object.
- Display its original name and age.
- Change at least one value using a setter.
- Display the values again.
- Clearly show that the same object changed.

Immutable Object Tests

- Create one ImmutableStudent object.
- Display its name and age.
- Demonstrate through your program and comments that the object does not provide setter methods.
- Create another ImmutableStudent object with different data instead of changing the original object.
- Display both objects to show that the first object did not change.

Part 4: Written Comparison

Create:

Mutable-Immutable-Report.md

Answer the following questions in your own words:

1. What does mutable mean?
2. What does immutable mean?
3. What allows MutableStudent objects to change?
4. Why does ImmutableStudent not have setter methods?
5. What is the purpose of final on the fields in ImmutableStudent?
6. What is the main difference you observed when testing the two classes?

Keep your answers short and clear.

General Requirements

- Keep all attributes private.
- Place each public class in a separate Java file.
- Keep all required Java files directly in the repository root.
- Do not create or use a src folder.
- Use meaningful variable and object names.
- Follow standard Java formatting conventions.
- Include a few comments explaining important parts of your code.
- Make sure all Java files compile and run without errors.
- Be prepared to explain why one class is mutable and the other is immutable.
- Follow the course AI-use policy.
- Record any AI assistance in AI-Use-Report.md.

Required Repository Files

- CMP129-Week-07-Lab-02.md
- AI-Use-Policy.md
- AI-Use-Report.md
- MutableStudent.java
- ImmutableStudent.java
- StudentTest.java
- Mutable-Immutable-Report.md

Submission

Push all required files to your GitHub repository.

Suggested commit messages:

- Add mutable student class
- Add immutable student class
- Add mutable and immutable object tests
- Complete lab report
