import com.sac.dao.TeacherMapper;
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
    public void test() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher();
        for (Teacher teacher1 : teacher) {
            System.out.println(teacher1);
        }
        sqlSession.close();
    }
}
