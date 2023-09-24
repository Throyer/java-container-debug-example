package db.migration;

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.SQLDataType.*;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

public class V2__createTableEmployee extends BaseJavaMigration {
  public void migrate(Context context) {
    var dsl = using(context.getConnection());
    dsl.transaction(connection -> using(connection)
      .createTableIfNotExists("employee")
      .column("id", BIGINT.identity(true))
      .column("name", VARCHAR(100).nullable(false))
      .constraints(constraint("user_pk").primaryKey("id"))
        .execute());
  }
}
