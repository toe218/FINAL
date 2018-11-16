package repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import command.Loginsession;

@Repository
public class LoginRepository extends AbstractRepository{
	private final String namespace = "repository.mapper.LoginMapper";
	
	
	public Loginsession comparisonLogin(Loginsession login) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".comparisonLogin";
		System.out.println("login repository"+login.getId());
		System.out.println("login repository"+login.getName());
		try {
			return sqlSession.selectOne(statement, login);
		}finally {
			sqlSession.close();
		}
	}
}
