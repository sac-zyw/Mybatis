import com.sac.dao.StudentMapper;
import com.sac.dao.TeacherMapper;
import com.sac.pojo.Student;
import com.sac.pojo.Teacher;
import com.sac.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ShiAC
 * @date 2020/3/24
 */
public class MyTest {
    @Test
    public void testStudent() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
