import App.Application;
import USER.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utils.IApplication;
import utils.database.IApplicationDao;
import utils.database.IUserDao;


import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class mytest {
    InputStream inputStream = null;
    SqlSession sqlSession = null;
    IApplicationDao iApplicationDao=null;
    IUserDao iUserDao=null;

    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //3.SqlSession对象
        sqlSession = sqlSessionFactory.openSession();
        iApplicationDao=sqlSession.getMapper(IApplicationDao.class);
        iUserDao=sqlSession.getMapper(IUserDao.class);
    }

    @After
    public void destory() throws IOException {
        sqlSession.commit();

        //7.释放资源
        sqlSession.close();
        inputStream.close();
    }



    @Test
    public void testadd(){
        Application application=new Application();
        application.setAppID("001");
        application.setClassroomID("310a");
        application.setDemandTime(new Date());
        application.setMessage("第一次租借");
        application.setPriority(5);
        application.setStudentID("2017302590226");
        iApplicationDao.addApp(application);
    }

    @Test
    public void test1(){
        List<Application> applications=iApplicationDao.findall();
        for(Application application:applications)
            System.out.println(application);
        System.out.println("成功连接");
    }

    @Test
    public void test2(){
        List<User> users=iUserDao.findall();
        for(User user:users)
            System.out.println(user);
        System.out.println("成功连接");
    }

    @Test
    public void addstudent(){
        User user=new User();
        user.setStudentID("2017302590226");
        user.setStudentName("朱家伟");
        user.setStudentPassWord("zz434370");
        iUserDao.addUser(user);
        System.out.println("成功连接");
    }
}
