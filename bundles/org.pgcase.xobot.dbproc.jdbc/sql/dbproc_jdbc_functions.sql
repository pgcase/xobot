select 
  p.oid pro_oid,        	-- OID функции/процедуры
  p.proname pro_name,      	-- Имя функции/процедуры
  ns.oid schema_oid,       	-- OID пространства имён (схемы), содержащего эту функцию
  ns.nspname schema_name,   -- Имя пространства имён (схемы), содержащего эту функцию
  p.proowner proowner_oid,  -- OID владельца функции
  au.rolname proowner_name, -- Имя владельца функции
  p.prolang prolang_oid,    -- OID языка реализации или интерфейса вызова для этой функции
  l.lanname prolang_name,	-- Название языка реализации или интерфейса вызова для этой функции
  p.procost procost,      	-- Примерная стоимость выполнения (в единицах cpu_operator_cost); если установлен признак is_proretset, это стоимость выдачи одной строки
  p.prorows prorows,      	-- Примерное число возвращаемых строк (ноль, если признак is_proretset не установлен)
  p.proretset is_proretset, -- Функция возвращает множество (т. е. множество значений указанного типа данных)
  p.pronargs pronargs,      -- Число входных аргументов
  p.pronargdefaults pronargdefaults,-- Число аргументов, для которых определены значения по умолчанию
  p.prorettype prorettype_oid,    	-- OID nипа данных возвращаемого значения
  t.typname prorettype_name,       	-- Имя типа данных возвращаемого значения
  case when p.prokind='f' then true when p.prokind='a' then true when p.prokind='w' then true else false end 
    as is_function,   	-- Является функцией
  case when p.prokind='p' then true else false end 
    as is_procedure,    -- Является процедурой
  case when p.prokind='a' then true else false end 
    as is_aggregate,    -- Является агрегатной (функцией)
  case when p.prokind='w' then true else false end 
    as is_window,      	-- Является оконной (функцией)
  case when p.provolatile='i' then true else false end
    as is_immutable,    -- Является постоянной функцией («immutable»), которая всегда возвращают один результат для одних и тех же аргументов
  case when p.provolatile='s' then true else false end
    as is_stable,      	-- Является стабильной функцией («stable»), результаты которой (для одних и тех же аргументов) не меняются в ходе одного сканирования    
  case when p.provolatile='v' then true else false end
    as is_volatile,     -- Является изменчивой функцией («volatile»), результаты которой могут меняться в любое время (с побочными эффектами, чтобы система не оптимизировала вызов)
  case when p.proparallel='s' then true else false end
    as is_parallel_safe,-- Может выполняться в параллельном режиме без ограничений (PARALLEL SAFE)
  case when p.proparallel='r' then true else false end
    as is_parallel_restricted,  -- Может выполняться в параллельном режиме, но только в ведущем процессе группы; в параллельных рабочих процессах вызывать нельзя (PARALLEL RESTRICTED)
  case when p.proparallel='u' then true else false end
    as is_parallel_unsafe,  	-- Небезопасна в параллельном режиме; влечёт выбор последовательного плана выполнения запроса (PARALLEL UNSAFE)
  pg_get_functiondef(p.oid) 
  	as pro_definition, 	-- Определение функции
  p.prosrc as prosrc,	-- Тело функции
  pg_get_function_identity_arguments(p.oid) 
  	as pro_params,		-- Список параметров 
  pg_get_function_arguments(p.oid) 
  	as pro_param_defaults,-- Список параметров со значениями по-умолчаниюs
  regexp_replace(regexp_replace(pg_get_function_identity_arguments(p.oid),'(,{1}\s{1}?(\S+){1}?\s{1})',',','g'),'(.+?\s{1}?)','','i')
  	as pro_param_types,	-- Очищенный список параметров, только типы
  pg_get_function_result(p.oid)
  	as pro_return		-- Предложение RETURNS для функции (для процедуры возвращает NULL)
  --, p.*
from pg_catalog.pg_proc p 
  join pg_catalog.pg_namespace ns on ns.oid=p.pronamespace
  join pg_catalog.pg_authid au on au.oid=p.proowner
  join pg_catalog.pg_language l on l.oid=p.prolang
  left join pg_catalog.pg_type t on t.oid=p.prorettype
where 
  ns.nspname=?