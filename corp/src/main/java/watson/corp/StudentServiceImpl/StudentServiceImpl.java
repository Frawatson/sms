package watson.corp.StudentServiceImpl;

import java.util.List;


import org.springframework.stereotype.Service;

import watson.corp.Model.Students;
import watson.corp.Repository.StudentRepo;
import watson.corp.StudentService.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	//@Autowired
	private StudentRepo studentRepo;
	
	
	public StudentServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Students> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Students saveStudents(Students students) {
		return studentRepo.save(students);
	}

	@Override
	public Students updateStudent(Students students) {
		return studentRepo.save(students);
	}

	@Override
	public Students getStudentById(Long id) {
		return studentRepo.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepo.deleteById(id);
		
	}
	
	

}
