package Assignment;

class User {
 String name;
 String email;

 User(String name, String email) {
     this.name = name;
     this.email = email;
 }

 void login() {
     System.out.println(name + " logged in.");
 }

 void logout() {
     System.out.println(name + " logged out.");
 }
}


class Student extends User {
 Student(String name, String email) {
     super(name, email); 
 }

 void registerCourse(String course) {
     System.out.println(name + " registered for " + course);
 }
}


class Instructor extends User {
 Instructor(String name, String email) {
     super(name, email);
 }

 void createCourse(String course) {
     System.out.println(name + " created the course " + course);
 }
}


