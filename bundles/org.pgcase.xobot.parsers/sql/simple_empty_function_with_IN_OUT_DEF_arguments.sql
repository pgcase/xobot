CREATE OR REPLACE FUNCTION increment(
   IN a integer,
   IN b integer DEFAULT 100500,
   IN x integer = -1000,
  OUT c integer
) 
RETURNS integer AS 
$$ 
BEGIN 
END; 
$$ LANGUAGE plpgsql;
