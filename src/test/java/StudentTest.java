import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        student = new Student("John", "Wick");
        student.addSubject("Math");
        student.addSubject("Physics");
        student.addSubject("French");
        student.addSubject("Biology");
        student.addSubject("Computer Science");
        student.addSubject("Witchcraft and Wizardry");
        student.updateSubjectGrade("Math", 5);
        student.updateSubjectGrade("Physics", 6);
        student.updateSubjectGrade("French", 7);
        student.updateSubjectGrade("Biology", 6);
        student.updateSubjectGrade("Computer Science", 7);
        student.updateSubjectGrade("Witchcraft and Wizardry", 7);

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

        student = null;

    }

    @org.junit.jupiter.api.Test
    void bestSubject() {

        assertEquals("French", student.bestSubject());
        student.updateSubjectGrade("French", 6);
        assertEquals("Computer Science", student.bestSubject());
        student.updateSubjectGrade("Computer Science", 6);
        assertEquals("Witchcraft and Wizardry", student.bestSubject());

    }

    @org.junit.jupiter.api.Test
    void averageGrade() {

        assertEquals(6.3, ((int) (student.averageGrade()*10))/10.0);
        student.updateSubjectGrade("Math", 6);
        assertEquals(6.5, student.averageGrade());
        student.updateSubjectGrade("Biology", 7);
        assertEquals(6.6, ((int) (student.averageGrade()*10))/10.0);

    }

    //@org.junit.jupiter.api.Test
//    void reportCard() {
//
//        String expectedReportCard = "Report card for John Wick\nMath\t5\nPhysics\t6\nFrench\t7\nBiology\t6\nComputer Science\t7\nWitchcraft and Wizardry\t7";
//        String actualReportCard = student.reportCard();
//        assertEquals(expectedReportCard, actualReportCard);
//
//    }
}