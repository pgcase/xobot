CREATE OR REPLACE FUNCTION %s.xb_pr_test1(i_par1 bigint, i_par2 text)
 RETURNS bigint
 LANGUAGE plpgsql
AS $function$
begin
	return 1::int8;
end
$function$
