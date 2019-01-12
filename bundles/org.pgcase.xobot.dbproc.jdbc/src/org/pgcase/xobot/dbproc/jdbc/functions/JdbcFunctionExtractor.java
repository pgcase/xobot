package org.pgcase.xobot.dbproc.jdbc.functions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionExtractor;

public class JdbcFunctionExtractor implements XFunctionExtractor {

	@Override
	public Iterable<XFunctionDescriptor> extractFunctions(Object input, Map<String, Object> context, XIssueReporter reporter) {
		if (input instanceof Connection) {
			Connection jdbcConnection = (Connection) input;
			List<XFunctionDescriptor> functions = Collections.emptyList();
			String schema = context.getOrDefault("schema", (Object)"public").toString();
			String sql = 
					"select \n" + 
					"  p.oid pro_oid,        	-- OID функции/процедуры\n" + 
					"  p.proname pro_name,      -- Имя функции/процедуры\n" + 
					"  ns.oid schema_oid,       -- OID пространства имён (схемы), содержащего эту функцию\n" + 
					"  ns.nspname schema_name,  -- Имя пространства имён (схемы), содержащего эту функцию\n" + 
					"  p.proowner proowner_oid, -- OID владельца функции\n" + 
					"  au.rolname proowner_name,-- Имя владельца функции\n" + 
					"  p.prolang prolang_oid,   -- OID языка реализации или интерфейса вызова для этой функции\n" + 
					"  l.lanname prolang_name,	-- Название языка реализации или интерфейса вызова для этой функции\n" + 
					"  p.procost procost,      	-- Примерная стоимость выполнения (в единицах cpu_operator_cost); если установлен признак is_proretset, это стоимость выдачи одной строки\n" + 
					"  p.prorows prorows,      	-- Примерное число возвращаемых строк (ноль, если признак is_proretset не установлен)\n" + 
					"  p.proretset is_proretset,-- Функция возвращает множество (т. е. множество значений указанного типа данных)\n" + 
					"  p.pronargs pronargs,     -- Число входных аргументов\n" + 
					"  p.pronargdefaults pronargdefaults,-- Число аргументов, для которых определены значения по умолчанию\n" + 
					"  p.prorettype prorettype_oid,      -- OID nипа данных возвращаемого значения\n" + 
					"  t.typname prorettype_name,        -- Имя типа данных возвращаемого значения\n" + 
					"  case when p.prokind='f' then true when p.prokind='a' then true when p.prokind='w' then true else false end \n" + 
					"    as is_function,   	-- Является функцией\n" + 
					"  case when p.prokind='p' then true else false end \n" + 
					"    as is_procedure,    -- Является процедурой\n" + 
					"  case when p.prokind='a' then true else false end \n" + 
					"    as is_aggregate,    -- Является агрегатной (функцией)\n" + 
					"  case when p.prokind='w' then true else false end \n" + 
					"    as is_window,      	-- Является оконной (функцией)\n" + 
					"  case when p.provolatile='i' then true else false end\n" + 
					"    as is_immutable,    -- Является постоянной функцией («immutable»), которая всегда возвращают один результат для одних и тех же аргументов\n" + 
					"  case when p.provolatile='s' then true else false end\n" + 
					"    as is_stable,      	-- Является стабильной функцией («stable»), результаты которой (для одних и тех же аргументов) не меняются в ходе одного сканирования    \n" + 
					"  case when p.provolatile='v' then true else false end\n" + 
					"    as is_volatile,     -- Является изменчивой функцией («volatile»), результаты которой могут меняться в любое время (с побочными эффектами, чтобы система не оптимизировала вызов)\n" + 
					"  case when p.proparallel='s' then true else false end\n" + 
					"    as is_parallel_safe,-- Может выполняться в параллельном режиме без ограничений (PARALLEL SAFE)\n" + 
					"  case when p.proparallel='r' then true else false end\n" + 
					"    as is_parallel_restricted,  -- Может выполняться в параллельном режиме, но только в ведущем процессе группы; в параллельных рабочих процессах вызывать нельзя (PARALLEL RESTRICTED)\n" + 
					"  case when p.proparallel='u' then true else false end\n" + 
					"    as is_parallel_unsafe,  	-- Небезопасна в параллельном режиме; влечёт выбор последовательного плана выполнения запроса (PARALLEL UNSAFE)\n" + 
					"  pg_get_functiondef(p.oid) \n" + 
					"  	as pro_definition, 	-- Определение функции\n" + 
					"  p.prosrc as prosrc,	-- Тело функции\n" + 
					"  pg_get_function_identity_arguments(p.oid) \n" + 
					"  	as pro_params,		-- Список параметров \n" + 
					"  pg_get_function_arguments(p.oid) \n" + 
					"  	as pro_param_defaults,-- Список параметров со значениями по-умолчаниюs\n" + 
					"  regexp_replace(regexp_replace(pg_get_function_identity_arguments(p.oid),'(,{1}\\s{1}?(\\S+){1}?\\s{1})',',','g'),'(.+?\\s{1}?)','','i')\n" + 
					"  	as pro_param_types,	-- Очищенный список параметров, только типы\n" + 
					"  pg_get_function_result(p.oid)\n" + 
					"  	as pro_return		-- Предложение RETURNS для функции (для процедуры возвращает NULL)\n" + 
					"  --, p.*\n" + 
					"from pg_catalog.pg_proc p \n" + 
					"  join pg_catalog.pg_namespace ns on ns.oid=p.pronamespace\n" + 
					"  join pg_catalog.pg_authid au on au.oid=p.proowner\n" + 
					"  join pg_catalog.pg_language l on l.oid=p.prolang\n" + 
					"  left join pg_catalog.pg_type t on t.oid=p.prorettype\n" + 
					"where \n" + 
					"  ns.nspname= ? ";
			try {				
				PreparedStatement preparedStatement = jdbcConnection.prepareStatement(sql);
				preparedStatement.setString(1, schema);
				ResultSet resultSet = preparedStatement.executeQuery();			
				while (resultSet.next()) {
					XFunctionDescriptor parsed = JdbcFunctionParser.parse(jdbcConnection,resultSet,reporter);
					functions.add(parsed);
				}
				return functions;
			} catch (SQLException e) {
				String message = String.format("Failed to process input with context %s", context);
				reporter.reportIssue(this, input, message, e);
			}
		}
		return Collections.emptyList();
	}
	
}
