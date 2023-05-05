import com.wz.dao.StudentDao;
import com.wz.dao.StudentDaoImpl;
import com.wz.entity.Student;
import com.wz.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    StudentDao studentDao = new StudentDaoImpl();

    @Test
    public void testSelect() throws IOException {
        List<Student>  studentList=studentDao.selectAllStudents();
        for(Student s :studentList){
            System.out.println(s);

        }
    }

    @Test
    public void testInsert() throws IOException {
        Student s=new Student();
        s.setId(5);
        s.setEmail("12");
        s.setAge(12);
        s.setName("张三");
        studentDao.insertStudent(s);
    }


    @Test
    public void testUpdate() throws IOException {
        Student student = new Student();
        student.setId(4);
        student.setAge(1111);
        studentDao.updateStudent(student);
    }


    @Test
    public void testDelete() throws IOException {
        String id = "4";
        studentDao.deleteStudent(id);
    }

}
