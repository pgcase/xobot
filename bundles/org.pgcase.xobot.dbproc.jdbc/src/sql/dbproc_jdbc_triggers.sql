select
	t.oid tg_oid,				-- OID триггера
	t.tgname tg_name,			-- Имя триггера
	ns.oid tg_table_schema_oid,	-- OID пространства имён (схемы), содержащего таблицу этого триггера
	ns.nspname tg_table_schema_name,-- Имя пространства имён (схемы), содержащего таблицу этого триггера
	t.tgrelid tg_table_oid,		-- OID таблицы триггера
	c.relname tg_table_name,	-- Имя таблицы триггера
	t.tgfoid tgf_oid,			-- OID вызываемой функции
	p.proname tgf_name,			-- Имя вызываемой функции
	t.tgtype tgtype,			-- Битовая маска, задающая условия срабатывания триггера
	t.tgenabled tgenabled		-- Устанавливает, в каких режимах session_replication_role срабатывает триггер: 
								-- O = триггер срабатывает в режимах «origin» (источник) и «local» (локально), 
								-- D = триггер отключён, R = триггер срабатывает в режиме «replica» (реплика), 
								-- A = триггер срабатывает всегда.
	--,t.*
from pg_catalog.pg_trigger t
	join pg_catalog.pg_class c on c.oid=t.tgrelid
	join pg_catalog.pg_namespace ns on ns.oid=c.relnamespace
	join pg_catalog.pg_proc p on p.oid=t.tgfoid
where ns.nspname=?
