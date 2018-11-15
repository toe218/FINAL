package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import model.City;
import model.Continent;
import model.Country;

@Repository
public class cartegoryRepository extends AbstractRepository{
	private final String namespace = "repository.mapper.CategoryMapper";

	public static List<Continent> continentSelect() {
		SqlSession sqlSession =
				getSqlSessionFactory().openSession();
		String statement =
				namespace + ".continentSelect";
		try {
			return sqlSession.selectList(statement);
		}finally {
			sqlSession.close();
		}
	}

	public static List<Country> countrySelect(Continent continent) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".countrySelect";
		try {
			return sqlSession.selectList(statement, continent);
		}finally {
			sqlSession.close();
		}
	}

	public static List<City> citySelect(Country country) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".citySelect";
		try {
			return sqlSession.selectList(statement, country);
		} finally {
			sqlSession.close();
		}
	}
}
