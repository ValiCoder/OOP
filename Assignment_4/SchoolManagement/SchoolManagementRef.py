from students_grade import calculate_average, convert_to_letter_grade


class Person:
    def __init__(self, name, age):
        self.__name = name
        self.__age = age

    def __str__(self):
        return f"Name: {self.__name}, Age: {self.__age}"

    @property
    def name(self):
        return self.__name

    @property
    def age(self):
        return self.__age


class Student(Person):
    def __init__(self, name, age, student_id, test1, test2, test3):
        super().__init__(name, age)
        self.__student_id = student_id
        self.__test1 = test1
        self.__test2 = test2
        self.__test3 = test3
        self.__grade = self.calculate_grade()

    def calculate_grade(self):
        average = calculate_average(self.__test1, self.__test2, self.__test3)
        return convert_to_letter_grade(average)

    def get_details(self):
        return f"{super().__str__()}, Student ID: {self.__student_id}, Grade: {self.__grade}"

    @property
    def student_id(self):
        return self.__student_id

    @property
    def grade(self):
        return self.__grade


class Teacher(Person):
    def __init__(self, name, age, teacher_id, subject):
        super().__init__(name, age)
        self.__teacher_id = teacher_id
        self.__subject = subject

    def get_details(self):
        return f"{super().__str__()}, Teacher ID: {self.__teacher_id}, Subject: {self.__subject}"

    @property
    def teacher_id(self):
        return self.__teacher_id

    @property
    def subject(self):
        return self.__subject


class Classroom:
    def __init__(self, room_number):
        self.__room_number = room_number
        self.__students = []
        self.__teacher = None

    @property
    def room_number(self):
        return self.__room_number

    def add_student(self, student):
        if isinstance(student, Student):
            self.__students.append(student)
        else:
            raise TypeError("Invalid student object")

    def get_student_list(self):
        return self.__students

    def set_teacher(self, teacher):
        if isinstance(teacher, Teacher):
            self.__teacher = teacher
        else:
            raise TypeError("Invalid teacher object")

    def get_teacher(self):
        return self.__teacher

    def __str__(self):
        teacher_info = f"Teacher: {self.__teacher.name}, Subject: {self.__teacher.subject}" if self.__teacher else "No teacher assigned"
        students_info = "\n".join(
            [f"{i + 1}. {student.name} (ID: {student.student_id}, Grade: {student.grade})" for i, student in
             enumerate(self.__students)])
        return f"Classroom {self.__room_number}:\n{teacher_info}\nStudents:\n{students_info if students_info else 'No students enrolled'}"


def search_students_by_grade(classroom, grade):
    students = classroom.get_student_list()
    return list(filter(lambda student: student.grade == grade, students))


def get_next_student_id(students):
    if not students:
        return 101
    return max(student.student_id for student in students) + 1


def get_next_teacher_id(teachers):
    if not teachers:
        return 101
    return max(teacher.teacher_id for teacher in teachers) + 1


def get_valid_input(prompt, input_type):

    while True:
        try:
            value = input_type(input(prompt))
            return value
        except ValueError:
            print("Invalid input. Please enter a valid value.")


def get_student_age(prompt):
    while True:
        age = get_valid_input(prompt, int)
        if 5 <= age <= 20:
            return age
        print("Student age must be between 5 and 20. Please try again.")


def get_teacher_age(prompt):
    while True:
        age = get_valid_input(prompt, int)
        if 20 <= age <= 70:
            return age
        print("Teacher age must be between 20 and 70. Please try again.")


def get_test_score(prompt):
    while True:
        score = get_valid_input(prompt, float)
        if 0 <= score <= 100:
            return score
        print("Test score must be between 0 and 100. Please try again.")


def main():
    classrooms = []
    students = []
    teachers = []

    while True:
        print("\nSchool Management System Menu:")
        print("1. Add a Student")
        print("2. Add a Teacher")
        print("3. Create a Classroom")
        print("4. Assign Teacher to a Classroom")
        print("5. Add Student to a Classroom")
        print("6. Display Classroom Information")
        print("7. Search for Students by Grade")
        print("8. Exit")

        choice = get_valid_input("\nEnter your choice: ", int)

        if choice == 1:
            name = input("Enter student name: ").strip()
            while not name:
                print("Name cannot be empty. Please try again.")
                name = input("Enter student name: ").strip()

            age = get_student_age("Enter age: ")

            student_id = get_next_student_id(students)
            print(f"The Automatically Assigned Student ID: {student_id}")

            test1 = get_test_score("Enter Test 1 score: ")
            test2 = get_test_score("Enter Test 2 score: ")
            test3 = get_test_score("Enter Test 3 score: ")

            student = Student(name, age, student_id, test1, test2, test3)
            students.append(student)
            print(f'Student "{name}" added successfully with grade {student.grade}!')

        elif choice == 2:
            name = input("Enter teacher name: ").strip()
            while not name:
                print("Name cannot be empty. Please try again.")
                name = input("Enter teacher name: ").strip()

            age = get_teacher_age("Enter age: ")

            teacher_id = get_next_teacher_id(teachers)
            print(f"The Automatically Assigned Teacher ID: {teacher_id}")

            subject = input("Enter subject: ").strip()
            while not subject:
                print("Subject cannot be empty. Please try again.")
                subject = input("Enter subject: ").strip()

            teacher = Teacher(name, age, teacher_id, subject)
            teachers.append(teacher)
            print(f'Teacher "{name}" added successfully!')

        elif choice == 3:
            room_number = get_valid_input("Enter classroom number: ", int)
            classroom = Classroom(room_number)
            classrooms.append(classroom)
            print(f"Classroom {room_number} was successfully created!")

        elif choice == 4:
            room_number = get_valid_input("Enter classroom number: ", int)
            teacher_id = get_valid_input("Enter teacher ID to assign: ", int)

            classroom = next((c for c in classrooms if c.room_number == room_number), None)
            teacher = next((t for t in teachers if t.teacher_id == teacher_id), None)

            if classroom and teacher:
                classroom.set_teacher(teacher)
                print(f'Teacher "{teacher.name}" assigned to classroom {room_number} successfully!')
            else:
                print("Classroom or Teacher not found.")

        elif choice == 5:
            room_number = get_valid_input("Enter classroom number: ", int)
            student_id = get_valid_input("Enter student ID: ", int)

            classroom = next((c for c in classrooms if c.room_number == room_number), None)
            student = next((s for s in students if s.student_id == student_id), None)

            if classroom and student:
                classroom.add_student(student)
                print(f'Student "{student.name}" added to classroom {room_number} successfully!')
            else:
                print("Classroom or Student not found.")

        elif choice == 6:
            room_number = get_valid_input("Enter classroom number: ", int)
            classroom = next((c for c in classrooms if c.room_number == room_number), None)

            if classroom:
                print(classroom)
            else:
                print("Classroom not found.")

        elif choice == 7:
            room_number = get_valid_input("Enter classroom number: ", int)
            grade = input("Enter grade to search for: ").strip().upper()
            while not grade:
                print("Grade cannot be empty. Please try again.")
                grade = input("Enter grade to search for: ").strip().upper()

            classroom = next((c for c in classrooms if c.room_number == room_number), None)
            if classroom:
                students_with_grade = search_students_by_grade(classroom, grade)
                if students_with_grade:
                    print(f"Students with grade {grade} in classroom {room_number}:")
                    for i, student in enumerate(students_with_grade):
                        print(f"{i + 1}. {student.name} (ID: {student.student_id})")
                else:
                    print(f"No students found with grade {grade} in classroom {room_number}.")
            else:
                print("Classroom not found.")

        elif choice == 8:
            print("Exiting the system.")
            break

        else:
            print("Invalid choice. Please try again.")

        print("\n=======================================================")

        doNext = input("\nDo you want to continue? (yes/no): ").strip().lower()
        while True:
            if doNext == "yes":
                print("Continuing with the operation...\n")
                break
            elif doNext == "no":
                print("Exiting the Library Management System. Thank you!")
                return
            else:
                print("Sorry, didn't understand you, please enter 'yes' or 'no'")
                doNext = input("\nDo you want to continue? (yes/no): ").strip().lower()


if __name__ == "__main__":
    main()
