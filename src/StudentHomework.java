public class StudentHomework {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.gender = 'm';
        student1.mark = 8;
        student1.isArmenian = true;
        student1.name = "Tigran";
        student1.surname = "Aleksanyan";
        student1.year = 1995;

        Student student2 = new Student();
        student2.gender = 'f';
        student2.mark = 7;
        student2.isArmenian = true;
        student2.name = "Narine";
        student2.surname = "Avetisyan";
        student2.year = 2000;

        Student student3 = new Student();
        student3.gender = 'f';
        student3.mark = 10;
        student3.isArmenian = false;
        student3.name = "Nina";
        student3.surname = "James";
        student3.year = 1998;


        StudentHomework lesson = new StudentHomework();

        Student olderStudent = lesson.olderStudent(student1, student2);
        System.out.println("The older student: " + olderStudent.name + " " + olderStudent.surname);
        System.out.println();

        Student highestScoreStudent = lesson.HighestScore(student1, student2);
        System.out.println("highest scored student: " + highestScoreStudent.name + " "
                + highestScoreStudent.surname);
        System.out.println();

        System.out.println("The following students are Armenians");
        lesson.armenian(student1);
        lesson.armenian(student2);
        lesson.armenian(student3);
        System.out.println();


        String student1Gender = lesson.whichGender(student1);
        String student2Gender = lesson.whichGender(student2);
        String student3Gender = lesson.whichGender(student3);
        System.out.println("Student1 is: " + student1Gender);
        System.out.println("Student2 is: " + student2Gender);
        System.out.println("Student3 is: " + student3Gender);
        System.out.println();


        Student highestScoreFemaleStudent = lesson.HighestScoreFemale(student2, student3);
        if(highestScoreFemaleStudent != null)
        {
            System.out.println("Highest scored girl is: " + highestScoreFemaleStudent.name + " "
                    + highestScoreFemaleStudent.surname);
        }


    }

    public Student olderStudent(Student s1, Student s2) {
        if (s1.year < s2.year) {
            return s1;
        } else {
            return s2;
        }
    }

    public void armenian(Student s) {
        if (s.isArmenian) {
            System.out.println(s.name + " " + s.surname);
        }
    }

    public Student HighestScore(Student s1, Student s2) {

        if (s1.mark > s2.mark) {
            return s1;
        } else {
            return s2;
        }
    }

    public String whichGender(Student s) {
        return s.gender == 'm' ? "male" : "female";
    }


    public Student HighestScoreFemale(Student s1, Student s2) {
        if (s1.gender == 'f' && s2.gender == 'f') {
            if (s1.mark > s2.mark) {
                return s1;
            } else {
                return s2;
            }
        } else if (s1.gender == 'f') {
            return s1;
        } else if (s2.gender == 'f') {
            return s2;
        }
        return null;
    }

}
