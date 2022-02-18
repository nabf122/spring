package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.SongExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new SongExam();
		// ExamConsole console = new InlineExamConsole(exam); // DI
		// ExamConsole console = new GridExamConsole(exam);
		ExamConsole console = ?;
		console.print();
	}
}


// spring framework 스터디 다시 시작
