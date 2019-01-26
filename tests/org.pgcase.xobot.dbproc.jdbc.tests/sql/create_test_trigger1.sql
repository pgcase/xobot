SET search_path to %s ;

CREATE TABLE xobot_test (
	id bigserial,
	"name" text);

CREATE OR REPLACE FUNCTION xobot_test_trigproc_before_insert()
 RETURNS trigger
 LANGUAGE plpgsql
AS $function$   
begin
  
end
 $function$
;

create
    trigger xobot_test_before_insert_trigger before insert
        on
        xobot_test for each row execute procedure xobot_test_trigproc_before_insert();
