select
	t.oid tg_oid,				-- OID ��������
	t.tgname tg_name,			-- ��� ��������
	ns.oid tg_table_schema_oid,	-- OID ������������ ��� (�����), ����������� ������� ����� ��������
	ns.nspname tg_table_schema_name,-- ��� ������������ ��� (�����), ����������� ������� ����� ��������
	t.tgrelid tg_table_oid,		-- OID ������� ��������
	c.relname tg_table_name,	-- ��� ������� ��������
	t.tgfoid tgf_oid,			-- OID ���������� �������
	p.proname tgf_name,			-- ��� ���������� �������
	t.tgtype tgtype,			-- ������� �����, �������� ������� ������������ ��������
	t.tgenabled tgenabled		-- �������������, � ����� ������� session_replication_role ����������� �������: 
								-- O = ������� ����������� � ������� �origin� (��������) � �local� (��������), 
								-- D = ������� ��������, R = ������� ����������� � ������ �replica� (�������), 
								-- A = ������� ����������� ������.
	--,t.*
from pg_catalog.pg_trigger t
	join pg_catalog.pg_class c on c.oid=t.tgrelid
	join pg_catalog.pg_namespace ns on ns.oid=c.relnamespace
	join pg_catalog.pg_proc p on p.oid=t.tgfoid
where ns.nspname=?
