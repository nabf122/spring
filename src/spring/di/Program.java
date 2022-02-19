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
// 부품을 바꾸는 일을 직접 해보았고, 이런 귀찮은 일을 대신해주는 설정을 빼는 작업
// 이것이 spring framework 이다.