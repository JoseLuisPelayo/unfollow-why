package business;

import java.util.List;

public interface CrudOperations<J, ID> {
		J findById(ID atributoPK);
		int insertOne(J objeto);
		int updateOne(J objeto);
		int deleteById(ID atributoPK);
		int deleteByObject(J objeto);
		List<J> findAll();
}
