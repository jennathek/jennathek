package student;
// list of seated students initially sorted alphabetically.
List<Student> students = new List();

public void removeStudent(Student student) {
	// Loop through the list of seated students to find the correct student.
	For (int i = 0; i < students.size(); i++) {
		Student seatedStudent = students.get(i);

		// if the student is found, remove the student and shift the remaining students (to the right of the empty seat) to the left.
		If (seatedStudent.lastName == student.lastName && seatedStudent.firstName == student.firstName) {
			students.remove(i);
			shiftStudentsLeft(i, students);
		}
	}
}



public void addStudent(Student student) {

	// First find where the student should sit by comparing the student’s
	// last name with every other student.

	// the index in the list of seats the student will sit in.
	int seatToSit;

	// since we are checking next student, the end of the loop condition will be
	// students.size() - 2.
	for (int i = 0; i < students.size() - 2; i++) {
		Student seatedStudent = students.get(i);
		Student nextSeatedStudent = students.get(i + 1);

		// The student’s last name is alphabetically after the seatedStudent
		// and alphabetically before the nextSeatedStudent so the student should sit 
		// in between them.
		if (student.lastName > seatedStudent.lastName && student.lastName < nextSeatedStudent.lastName) {
			seatToSit = i + 1;
		} 
		// if the student’s last name is the same then compare with the first name.
		
// if the first name is greater, then seat the student before the seatedStudent.
		else if (student.lastName == seatedStudent.lastName && student.firstName >                   seatedStudent.firstName) {
			// if loop index is on the first student (0), then seatToSit will be 0
			if (i == 0) {
				seatToSit = 0;
			} else {
				seatToSit = i - 1;
}
}

// if the first name is lexicographically after, then seat the student after the 
// seatedStudent.
else if (student.lastName == seatedStudent.lastName && student.firstName < seatedStudent.firstName) {
	seatToSit = i + 1;
}

// this method shifts students to the right from the seatToSit index
shiftStudentsRight(seatToSit, students);
}
}
}
