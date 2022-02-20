package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.SongExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드 변경.
		Exam exam = new SongExam();
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		*/
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		// ExamConsole console = (ExamConsole) context.getBean("console");
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		
		ExamConsole console = context.getBean(ExamConsole.class);
		
		console.print();
	}
}


// spring framework 스터디 다시 시작
// 부품을 바꾸는 일을 직접 해보았고, 이런 귀찮은 일을 대신해주는 설정을 빼는 작업
// 이것이 spring framework 이다.
// xml 파일 방식.