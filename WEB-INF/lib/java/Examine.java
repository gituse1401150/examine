package models;

import com.iciql.Iciql.IQColumn;
import com.iciql.Iciql.IQIndex;
import com.iciql.Iciql.IQIndexes;
import com.iciql.Iciql.IQSchema;
import com.iciql.Iciql.IQTable;
import com.iciql.Iciql.IndexType;
import java.io.Serializable;

@IQTable(name="examine")
@IQIndex(name="FK__promoter", value={ "promoter_id" })
public class Examine implements Serializable {

	private static final long serialVersionUID = 1L;

	@IQColumn(primaryKey=true, autoIncrement=true, nullable=false)
	public Integer examine_id;

	@IQColumn(length=100, nullable=false)
	public String examine_name;

	@IQColumn(nullable=false)
	public Integer promoter_id;

	public Examine() {
	}
}