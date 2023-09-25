package db.migration;

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.SQLDataType.*;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

/**
* @see "https://www.jooq.org/doc/3.1/manual/sql-building/ddl-statements/"
*/
public class V1695564280676__CreateTableExample extends BaseJavaMigration {
    @Override
    public void migrate(Context context) {
      var create = using(context.getConnection());
      create.transaction(configuration -> using(configuration)
       .createTableIfNotExists("example")
         .column("id", BIGINT.identity(true))
         .column("bar", VARCHAR(100).nullable(false))
         .constraints(primaryKey("id"), unique("bar"))
       .execute());
    }
}