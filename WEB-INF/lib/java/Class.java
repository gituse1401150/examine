package models;

import com.iciql.Iciql.IQColumn;
import com.iciql.Iciql.IQIndex;
import com.iciql.Iciql.IQIndexes;
import com.iciql.Iciql.IQSchema;
import com.iciql.Iciql.IQTable;
import com.iciql.Iciql.IndexType;
import java.io.Serializable;

@IQTable(name="class")
public class Class implements Serializable {

	private static final long serialVersionUID = 1L;

	@IQColumn(primaryKey=true, autoIncrement=true, nullable=false)
	public Integer class_id;

	@IQColumn(length=20, nullable=false)
	public String class_name;

	public Class() {
	}
}